package cn.jcloud.repository;


import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;

import cn.jcloud.domain.BizDomain;

/**
 * Created by Wei Han on 2016/1/8.
 */
@NoRepositoryBean
public interface BizRepository<T extends BizDomain<I>, I extends Serializable> extends BaseRepository<T, I> {
    <T extends BizDomain<I>> List<T> findByDeletedIsFalse();

}
