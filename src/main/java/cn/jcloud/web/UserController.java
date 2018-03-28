package cn.jcloud.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	@RequestMapping(value="/v0.1/user/{id}",method=RequestMethod.GET)
	public Long create(@PathVariable("id") Long id){
		return id;
	}
}
