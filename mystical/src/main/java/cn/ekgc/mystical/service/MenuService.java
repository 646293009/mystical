package cn.ekgc.mystical.service;

import cn.ekgc.mystical.pojo.entity.Menu;
import cn.ekgc.mystical.pojo.entity.Role;

import java.util.List;

/**
 * <b>菜单业务层接口</b>
 * @author asus
 * @version 1.0.0 2020-08-04
 * @since 1.0.0
 *
 * */
public interface MenuService {
	/**
	 * <b>根据角色查询菜单列表</b>
	 * @author asus
	 * @version 1.0.0 2020-08-04
	 * @since 1.0.0
	 *
	 * */
	List<Menu> getMenuListForIndex(Role role) throws Exception;
}
