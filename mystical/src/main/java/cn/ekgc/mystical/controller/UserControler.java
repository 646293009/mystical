package cn.ekgc.mystical.controller;

import cn.ekgc.mystical.controller.base.BaseController;
import cn.ekgc.mystical.pojo.entity.User;
import cn.ekgc.mystical.service.UserService;
import cn.ekgc.mystical.util.MD5Util;
import cn.ekgc.mystical.util.enums.StatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.security.util.Password;

/**
 * <b>用户模块控制器</b>
 * @author asus
 * @version 1.0.0 2020-08-04
 * @since 1.0.0
 *
 * */
@Controller("userController")
@RequestMapping("/user")
public class UserControler extends BaseController {
	@Autowired
	private UserService userService;
	/**
	 * <b>转发到用户登录界面</b>
	 * @author asus
	 * @version 1.0.0 2020-08-04
	 * @since 1.0.0
	 *
	 * */
	@GetMapping("/login")
	public  String forwardLoginPage() throws Exception{
		return "user/user_login";
 }

	/**
	 * <b>用户登录</b>
	 * @author asus
	 * @version 1.0.0 2020-08-04
	 * @since 1.0.0
	 *
	 * */
 @PostMapping("/login")
    public  String loginUser(String cellphone , String password) throws Exception {
	    //效验所提供的手机号码和密码有效
	    if (cellphone != null && !"".equals(cellphone.trim())
			    && password != null && !"".equals(password.trim())) {
		    //对于用户所提供登录密码进行加密
		    password = MD5Util.encrypt(password);
		    //通过手机号码查询用户信息
		    User user = userService.getUserByCellphone(cellphone);
		    if (user != null) {
			    if (password.equals(user.getPassword())) {
				    if (user.getStatus() == StatusEnum.ENABLE_STATUS.getCode()) {
					    //登录成功
					    session.setAttribute("user", user);
					    return "redirect:/";
				    } else {
					    return "redirect:login?flag=status";
				    }
			    } else {
				    return "redirect:login?flag=password";
			    }
		    } else {
			    return "redirect:login?flag=user";
		    }
	    }else {
	    	return "redirect:login?flag=empty";
	    }
    }

}
