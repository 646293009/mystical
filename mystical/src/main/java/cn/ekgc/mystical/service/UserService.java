package cn.ekgc.mystical.service;

import cn.ekgc.mystical.pojo.entity.Role;
import cn.ekgc.mystical.pojo.entity.User;
import cn.ekgc.mystical.pojo.vo.Page;

/**
 * <b>用户模块业务层接口</b>
 * @author Dell
 * @version 1.0.0 2020-08-06
 * @since 1.0.0
 *
 * */
public interface UserService {
	/**
	 * <b>根据手机号码查询用户信息</b>
	 * @author asus
	 * @version 1.0.0 2020-08-04
	 * @since 1.0.0
	 *
	 * */
	User getUserByCellphone(String cellphone) throws Exception;
	/**
	 * <b>分页查询信息列表</b>
	 * @param page
	 * @return
	 * @throws Exception
	 */
	Page<User> getListByPage(Page<User> page) throws Exception;
}
