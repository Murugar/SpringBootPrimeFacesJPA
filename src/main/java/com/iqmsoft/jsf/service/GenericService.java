package com.iqmsoft.jsf.service;

import java.util.List;

import com.iqmsoft.jsf.domain.BaseEntity;

public interface GenericService<E extends BaseEntity> {

	public E saveOrUpdate(E entidade);

	public void delete(E entidade);

	public List<E> getAll();
	
	public E findOne(Long id);
}
