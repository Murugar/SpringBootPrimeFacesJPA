package com.iqmsoft.boot.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iqmsoft.boot.domain.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long>{

}
