package cn.ekgc.mystical.controller;

import cn.ekgc.mystical.controller.base.BaseController;
import cn.ekgc.mystical.pojo.entity.Role;
import cn.ekgc.mystical.pojo.vo.Page;
import cn.ekgc.mystical.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
