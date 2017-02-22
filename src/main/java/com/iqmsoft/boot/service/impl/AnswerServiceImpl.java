package com.iqmsoft.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.boot.domain.Question;
import com.iqmsoft.boot.domain.Answer;
import com.iqmsoft.boot.service.AnswerService;
import com.iqmsoft.boot.service.repository.AnswerRepository;
import com.iqmsoft.jsf.service.impl.GenericServiceImpl;

@Service
public class AnswerServiceImpl extends GenericServiceImpl<Answer, AnswerRepository>implements AnswerService {

	@Autowired
	public AnswerServiceImpl(AnswerRepository answerRepository) {
		super(answerRepository);
	}

	@Override
	public List<Answer> listarPorPergunta(Question question) {
		
		return this.repository.findByQuestion(question);
	}

}
