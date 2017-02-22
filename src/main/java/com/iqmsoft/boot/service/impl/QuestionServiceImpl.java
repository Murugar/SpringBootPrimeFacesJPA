package com.iqmsoft.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.boot.domain.Option;
import com.iqmsoft.boot.domain.Question;
import com.iqmsoft.boot.service.QuestionService;
import com.iqmsoft.boot.service.repository.QuestionRepository;
import com.iqmsoft.jsf.service.impl.GenericServiceImpl;

@Service
public class QuestionServiceImpl extends GenericServiceImpl<Question, QuestionRepository>implements QuestionService {

	@Autowired
	public QuestionServiceImpl(QuestionRepository questionRepository) {

		super(questionRepository);
	}

	@Override
	public Question saveOrUpdate(Question entidade) {

		for(Option option : entidade.getOpcoes()){
			
			option.setQuestion(entidade);
			
		}
		
		return super.saveOrUpdate(entidade);
	}
}
