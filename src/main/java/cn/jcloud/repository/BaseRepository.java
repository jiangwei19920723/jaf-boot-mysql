package cn.jcloud.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import cn.jcloud.domain.BaseDomain;
import cn.jcloud.query.Items;
import cn.jcloud.query.ListParam;

/**
 * Created by closer on 2016/1/5.
 */
@NoRepositoryBean
public interface BaseRepository<T extends BaseDomain<I>, I extends Serializable> extends PagingAndSortingRepository<T, I> {

    Items<T> list(ListParam<T> listParam);
    
    @Override
    List<T> findAll();
}
