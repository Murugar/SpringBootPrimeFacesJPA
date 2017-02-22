package com.iqmsoft.boot.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.iqmsoft.jsf.domain.BaseEntity;

@Entity
public class Option extends BaseEntity {

	private String conteudo;

	private Integer quantidadeVoto;

	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private Question question;

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Integer getQuantidadeVoto() {
		if(quantidadeVoto == null){
			quantidadeVoto = 0;
		}
		return quantidadeVoto;
	}

	public void setQuantidadeVoto(Integer quantidadeVoto) {
		this.quantidadeVoto = quantidadeVoto;
	}

}
