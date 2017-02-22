package com.iqmsoft.boot.service;

import java.util.List;

import com.iqmsoft.boot.domain.Question;
import com.iqmsoft.boot.domain.Answer;
import com.iqmsoft.jsf.service.GenericService;

public interface AnswerService extends GenericService<Answer>{

	List<Answer> listarPorPergunta(Question question);
}
