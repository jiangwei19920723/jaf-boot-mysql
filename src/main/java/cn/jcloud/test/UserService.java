package cn.jcloud.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** 
 * @author  蒋维 
 * @date 创建时间：2018年3月28日 下午6:06:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public void add(User user){
		repository.save(user);
	}
}
