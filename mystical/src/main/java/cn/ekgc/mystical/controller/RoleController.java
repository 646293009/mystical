package cn.ekgc.mystical.controller;

import cn.ekgc.mystical.controller.base.BaseController;
import cn.ekgc.mystical.pojo.entity.Role;
import cn.ekgc.mystical.pojo.vo.Page;
import cn.ekgc.mystical.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <b>角色模块控制器</b>
 * @author Arthur
 * @version 1.0.0 2020-08-05
 * @since 1.0.0
 */
@Controller("roleController")
@RequestMapping("/role")
public class RoleController extends BaseController {
	@Autowired
	private RoleService roleService;

	/**
	 * <b>截取添加用户请求进行请求分发到添加角色页面</b>
	 * @return
	 * @throws Exception
	 */
	@GetMapping("save")
	public String save() throws Exception{

		return "role/role_insert";
	}

	/**
	 * <b>加载角色功能首页面</b>
	 * @param pageNum
	 * @param pageSize
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/index")
	public String getRoleIndex(Integer pageNum, Integer pageSize, ModelMap map)
			throws Exception {
		// 通过 pageNum 和 pageSize 创建分页对象
		Page<Role> page = new Page<Role>(pageNum, pageSize);
		// 通过分页对象进行分页查询
		page = roleService.getListByPage(page);
		// 转发到页面
		map.put("page", page);
		return "role/role_index";
	}

	/**
	 * <b>截取添加信息的请求进行</b>
	 * @param role
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/saveRole")
	public String postRole(Role role) throws Exception{
		boolean flag=roleService.saveRole(role);
		if (flag){
			System.out.println("保存成功！");
		}else {
			System.out.println("保存失败！");
		}
		return "role/role_index";
	}
}
