package cn.jcloud.service;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cn.jcloud.domain.BaseDomain;
import cn.jcloud.repository.BaseRepository;

/**
 * @author 蒋维
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

	public T findOne(I id) {
		return repository.findOne(id);
	}

	public T save(T t) {
		return repository.save(t);
	}

	public T update(T t) throws SQLException {
		if (!exists(t.getId())) {
			throw new SQLException("id不存在！");
		}
		return repository.save(t);
	}

	public boolean exists(I id) {
		return findOne(id) != null;
	}

	public List<T> findAll() {
		return repository.findAll();
	}

	public void delete(T t) {
		repository.delete(t);
	}

	public void delete(I id) {
		T t = findOne(id);
		if (t==null) {
			return;
		}
		repository.delete(id);
	}
}
