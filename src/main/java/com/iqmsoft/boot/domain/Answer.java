package com.iqmsoft.boot.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.iqmsoft.jsf.domain.BaseEntity;

@Entity
public class Answer extends BaseEntity {

	private String texto;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Question question;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}
