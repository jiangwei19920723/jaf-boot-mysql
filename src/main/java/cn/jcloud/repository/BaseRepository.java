package cn.jcloud.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import cn.jcloud.domain.BaseDomain;

/** 
 * @author  蒋维 
 * @date 创建时间：2018年3月29日 上午9:56:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@NoRepositoryBean
public interface BaseRepository<T extends BaseDomain<I>,I extends Serializable> extends PagingAndSortingRepository<T, I>{
	List<T> findAll();
}
