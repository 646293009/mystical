package cn.ekgc.mystical.dao;

import cn.ekgc.mystical.pojo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>用户数据持久层接口</b>
 * @author asus
 * @version 1.0.0 2020-08-04
 * @since 1.0.0
 *
 * */
@Repository
public interface UserDao {
	/**
	 * <b>根据用户信息查询相关用户型芯列表</b>
	 * @author asus
	 * @version 1.0.0 2020-08-04
	 * @since 1.0.0
	 *
	 * */
	List<User> findUserListByQuery(User query) throws Exception;
}
