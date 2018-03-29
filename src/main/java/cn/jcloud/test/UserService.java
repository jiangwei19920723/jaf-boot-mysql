package cn.jcloud.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jcloud.domain.Module;
import cn.jcloud.service.BizService;

/** 
 * @author  蒋维 
 * @date 创建时间：2018年3月28日 下午6:06:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class UserService extends BizService<User, Long> {
	@Autowired
	private UserRepository repository;
	@Override
	protected Module module() {
		return new Module("VENDOR_INFO");
	}

}
