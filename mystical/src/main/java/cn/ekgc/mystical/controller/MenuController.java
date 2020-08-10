package cn.ekgc.mystical.controller;

import cn.ekgc.mystical.controller.base.BaseController;
import cn.ekgc.mystical.pojo.vo.Node;
import cn.ekgc.mystical.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <b>菜单模块控制器</b>
 * @author Dell
 * @version 1.0.0 2020-08-09
 * @since 1.0.0
 */
@Controller("menuController")
@RequestMapping("/menu")
public class MenuController extends BaseController {
	@Autowired
	private MenuService menuService;

	/**
	 * <b>加载角色授权页面</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/auth")
	public String openAuthMenuPage(Long id, ModelMap map) throws Exception{
		map.put("id",id);
		return "menu/menun_auth";
	}
	@PostMapping("/authlist")
	@ResponseBody
	public List<Node> getMenuListForAuth(Long id) throws Exception{
		return menuService.getMenuListForAuth(id);
	}
}
