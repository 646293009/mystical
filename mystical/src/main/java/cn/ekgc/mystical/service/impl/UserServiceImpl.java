package cn.ekgc.mystical.service.Impl;

import cn.ekgc.mystical.dao.UserDao;
import cn.ekgc.mystical.pojo.entity.Role;
import cn.ekgc.mystical.pojo.entity.User;
import cn.ekgc.mystical.pojo.vo.Page;
import cn.ekgc.mystical.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b>用户模块业务层接口实现类</b>
 * @author Dell
 * @version 1.0.0 2020-08-04
 * @since 1.0.0
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	/**
	 * <b>根据手机号码查询用户信息</b>
	 * @author Dell
	 * @version 1.0.0 2020-08-04
	 * @since 1.0.0
	 *
	 * */
	@Override
	public User getUserByCellphone(String cellphone) throws Exception{
		//创建查询对象
		User query=new User();
		query.setCellphone(cellphone);
		List<User> userList=userDao.findUserListByQuery(query);
		if (userList !=null && userList.size()>0){
			//此时查询获得相关数据
			return userList.get(0);
		}
		return null;
	}
	/**
	 * <b>分页查询信息列表</b>
	 * @param page
	 * @return
	 * @throws Exception
	 */


	@Override
	public Page<User> getListByPage(Page<User> page) throws Exception {
		// 使用 PageHelper 进行分页查询
		//获取第1页，10条内容，默认查询总数count
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		List<User> list = userDao.findUserListByQuery(null);
		// 为了获得分页的其他信息，通过使用分页后的列表获得 PageInfo 对象
		PageInfo<User> pageInfo = new PageInfo<User>(list);
		// 提取 PageInfo 对象中的相关信息，进行系统分页对象 Page 属性的填充
		page.setList(list);
		page.setTotalSize(pageInfo.getTotal());
		page.setTotalPage((long) pageInfo.getPages());

		return page;

	}

}
