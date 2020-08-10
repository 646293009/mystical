package cn.ekgc.mystical.dao;

import cn.ekgc.mystical.pojo.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>角色模块数据持久层接口</b>
 * @author Arthur
 * @version 1.0.0 2020-08-05
 * @since 1.0.0
 */
@Repository
public interface RoleDao {
	/**
	 * <b>根据查询对象查询列表信息</b>
	 *
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Role> findListByQuery(Role query) throws Exception;

	/**
	 * <b>保存角色信息</b>
	 *
	 * @param role
	 * @return
	 * @throws Exception
	 */
	int saveRole(Role role) throws Exception;

	/**
	 * <b>修改角色信息</b>
	 *
	 * @param role
	 * @return
	 * @throws Exception
	 */
	Integer updateRole(Role role) throws Exception;
}
