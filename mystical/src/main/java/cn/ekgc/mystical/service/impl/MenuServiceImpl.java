package cn.ekgc.mystical.service.Impl;

import cn.ekgc.mystical.dao.MenuDao;
import cn.ekgc.mystical.pojo.entity.Menu;
import cn.ekgc.mystical.pojo.entity.Role;
import cn.ekgc.mystical.pojo.vo.Node;
import cn.ekgc.mystical.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <b>菜单模块业务层接口实现类</b>
 * @author Dell
 * @version 1.0.0 2020-08-04
 * @since 1.0.0
 */
@Service("menuService")
@Transactional
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuDao menuDao;

	/**
	 * <b>根据角色查询菜单列表</b>
	 * @param role
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Menu> getMenuListForIndex(Role role) throws Exception {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("role", role.getId());
		// 查询所有的一级菜单
		queryMap.put("parent", null);
		List<Menu> menuList = menuDao.findMenuListByRoleAndParent(queryMap);
		// 循环遍历一级菜单
		for (Menu parent : menuList) {
			// 获得此时一级菜单的主键，该主键是二级菜单的 parent_id
			queryMap.put("parent", parent.getId());
			List<Menu> childrenMenus = menuDao.findMenuListByRoleAndParent(queryMap);
			parent.setChildrenMenus(childrenMenus);
		}
		return menuList;
	}

	@Override
	public List<Node> getMenuListForAuth(Long id) throws Exception {
		//通过当前角色查询其现有的菜单列表
		List<Menu> roleMenuList=menuDao.findMenuListByRole(id);
		//因为ztree 在加载节点的时候，不需要组装成上下级，因此只需要查询所有的菜单即可
		List<Menu> menuList=menuDao.findMenuListByQuery(null);
		//循环 menuList 提取数据，转换为 nodeList
		List<Node> nodeList=new ArrayList<Node>();
		for (int i=0;i<menuList.size();i++){
			Menu menu=menuList.get(i);
			Node node=new Node();
			//设定id
			node.setId(menu.getId());
			//设定neme
			node.setName(menu.getName());
			//判断此时Menu 是否为一级菜单
			if (menu.getParent() == null){
				//一级菜单，一级菜单默认展开
				node.setpId(0L);
				node.setOpen(true);
			}else{
				//二级菜单
				node.setpId(menu.getParent().getId());
			}
			//判断此时的菜单是否已经分配给该角色
			System.out.println(roleMenuList.contains(menu));
			if (roleMenuList.contains(menu)){
				//如果在角色的现有的菜单中包含该菜单，那么该菜单将会处于选中状态
				node.setChecked(true);
			}
			nodeList.add(node);
		}
		return nodeList;
	}
}