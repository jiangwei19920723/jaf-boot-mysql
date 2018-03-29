package cn.jcloud.test;

import org.springframework.stereotype.Repository;

import cn.jcloud.repository.BizRepository;

/** 
 * @author  蒋维 
 * @date 创建时间：2018年3月28日 下午6:04:39 
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  
 */
@Repository
public interface UserRepository extends BizRepository<User, Long> {

}
