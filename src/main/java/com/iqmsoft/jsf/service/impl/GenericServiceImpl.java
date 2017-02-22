package com.iqmsoft.jsf.service.impl;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.iqmsoft.jsf.domain.BaseEntity;
import com.iqmsoft.jsf.service.GenericService;

public abstract class GenericServiceImpl<E extends BaseEntity, T extends CrudRepository<E, Long>>
		implements GenericService<E> {

	protected T repository;

	public GenericServiceImpl(T repository) {
		super();
		this.repository = repository;
	}

	public E saveOrUpdate(E entidade) {

		return (E) repository.save(entidade);

	}

	public void delete(E entidade) {

		repository.delete(entidade);

	}

	public List<E> getAll() {

		return (List<E>) repository.findAll();
	}

	public E findOne(Long id) {

		return repository.findOne(id);

	}

}
