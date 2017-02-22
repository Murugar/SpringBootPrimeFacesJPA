package com.iqmsoft.boot.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iqmsoft.boot.domain.Option;
import com.iqmsoft.boot.service.OptionService;
import com.iqmsoft.boot.service.repository.OptionRepository;
import com.iqmsoft.jsf.service.impl.GenericServiceImpl;

@Service
public class OptionServiceImpl extends GenericServiceImpl<Option, OptionRepository>implements OptionService {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	public OptionServiceImpl(OptionRepository repository) {
		super(repository);
	}

	@Override
	@Transactional
	public Option saveOrUpdate(Option entidade) {

		if (entidade.getId() != null) {
			
			entidade = this.findOne(entidade.getId());

			entidade.setQuantidadeVoto(entidade.getQuantidadeVoto() + 1);

			return entityManager.merge(entidade);
		}

		return null;
	}
}
