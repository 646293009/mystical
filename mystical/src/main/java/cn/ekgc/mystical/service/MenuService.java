package cn.ekgc.mystical.service;

import cn.ekgc.mystical.pojo.entity.Menu;
import cn.ekgc.mystical.pojo.entity.Role;
import cn.ekgc.mystical.pojo.vo.Node;

import java.util.List;

/**
 * <b>菜单模块业务层接口</b>
 * @author Dell
 * @version 1.0.0 2020-08-04
 * @since 1.0.0
 */
public interface MenuService {
	/**
	 * <b>根据角色查询菜单列表</b>
	 * @param role
	 * @return
	 * @throws Exception
	 */
	List<Menu> getMenuListForIndex(Role role) throws Exception;

	/**
	 * <b>为授权准备所有的菜单列表</b>
	 * @return
	 */
	List<Node> getMenuListForAuth(Long id) throws Exception;
}
