package cn.ekgc.mystical.dao;

import cn.ekgc.mystical.pojo.entity.Menu;
import cn.ekgc.mystical.pojo.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <b>菜单模块数据持久层</b>
 * @author asus
 * @version 1.0.0 2020-08-04
 * @since 1.0.0
 *
 * */
@Repository
public interface MenuDao {
	/**
	 * <b>根据查询列表查询对象列表</b>
	 * @author asus
	 * @version 1.0.0 2020-08-04
	 * @since 1.0.0
	 *
	 * */
	List<Menu> findMenuListByQuer(Menu query) throws Exception;
		/**
		 * <b>保存对象</b>
		 * @author asus
		 * @version 1.0.0 2020-08-04
		 * @since 1.0.0
		 *
		 * */
		Integer saveMenu (Menu menu) throws Exception;
	/**
	 * <b>修改对象</b>
	 * @author asus
	 * @version 1.0.0 2020-08-04
	 * @since 1.0.0
	 *
	 * */
		Integer updateMenu(Menu menu) throws Exception;
	/**
	 * <b>根据角色和上级菜单查询菜单列表</b>
	 * @author asus
	 * @version 1.0.0 2020-08-04
	 * @since 1.0.0
	 *
	 * */


	List<Menu> findMenuListByRoleAndParent(Map<String, Object> queryMap) throws Exception;
}

