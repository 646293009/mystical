package cn.ekgc.mystical.dao;

import cn.ekgc.mystical.pojo.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <b>菜单模块数据持久层接口</b>
 * @author Arthur
 * @version 1.0.0 2020-08-04
 * @since 1.0.0
 */
@Repository
public interface MenuDao {
	/**
	 * <b>根据角色和上级菜单查询菜单列表</b>
	 * @param queryMap
	 * @return
	 * @throws Exception
	 */
	List<Menu> findMenuListByRoleAndParent(Map<String, Object> queryMap) throws Exception;

	/**
	 * <b>根据查询对象查询对象列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Menu> findMenuListByQuery(Menu query) throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param menu
	 * @return
	 * @throws Exception
	 */
	Integer saveMenu(Menu menu) throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param menu
	 * @return
	 * @throws Exception
	 */
	Integer updateMenu(Menu menu) throws Exception;
}


