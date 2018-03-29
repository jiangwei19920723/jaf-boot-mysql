package cn.jcloud.service;

import java.io.Serializable;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cn.jcloud.domain.BaseDomain;
import cn.jcloud.repository.BaseRepository;

/** 
 * @author  蒋维 
 * @date 创建时间：2018年3月29日 上午10:02:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Transactional
public abstract class BaseService<T extends BaseDomain<I>, I extends Serializable> {
	@Autowired
	private BaseRepository<T, I> repository;
	public T findOne(I id){
		return repository.findOne(id);
	}
	public T save(T t){
		return repository.save(t);
	}
	public T update(T t) throws SQLException{
		if (!exists(t.getId())) {
			throw new SQLException("id不存在！");
		}
		return repository.save(t);
	}
    public boolean exists(I id) {
        return findOne(id) != null;
    }
}
