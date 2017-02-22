package com.iqmsoft.boot.service.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iqmsoft.boot.domain.Question;
import com.iqmsoft.boot.domain.Answer;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {

	List<Answer> findByQuestion(Question question);
}
