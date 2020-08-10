package cn.ekgc.mystical.service;

import cn.ekgc.mystical.pojo.entity.Role;
import cn.ekgc.mystical.pojo.vo.Page;

import java.util.List;

/**
 * <b>角色模块业务层接口</b>
 * @author Dell
 * @version 1.0.0 2020-08-06
 * @since 1.0.0
 *
 * */
public interface RoleService {
	/**
	 * <b>分页查询信息列表</b>
	 * @param page
	 * @return
	 * @throws Exception
	 */
	Page<Role> getListByPage(Page<Role> page) throws Exception;

	/**
	 * <b>保存角色信息</b>
	 * @return
	 * @throws Exception
	 */
	boolean saveRole(Role role) throws Exception;
}
