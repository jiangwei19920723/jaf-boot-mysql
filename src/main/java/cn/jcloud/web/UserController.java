package cn.jcloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.jcloud.test.User;
import cn.jcloud.test.UserService;

/** 
 * @author  蒋维 
 * @date 创建时间：2018年3月28日 上午11:33:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@RestController
public class UserController {
	@Autowired
	private UserService service;
	@RequestMapping(value="/v0.1/user",method=RequestMethod.GET)
	public Long create(){
		User user = new User();
		user.setUserName("zhangsan");
		user.setPassWord("123123");
		service.add(user);
		return 1l;
	}
}
