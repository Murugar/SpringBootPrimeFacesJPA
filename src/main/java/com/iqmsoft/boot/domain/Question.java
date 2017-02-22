package com.iqmsoft.boot.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.iqmsoft.jsf.domain.BaseEntity;

@Entity
public class Question extends BaseEntity {

	private String texto;

	private String descricao;

	@Enumerated(EnumType.STRING)
	private EnumTypeSurvey tipoEnquete;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true, targetEntity = Answer.class)
	private List<Answer> listaRespostas;

	public List<Answer> getListaRespostas() {
		return listaRespostas;
	}

	public void setListaRespostas(List<Answer> listaRespostas) {
		this.listaRespostas = listaRespostas;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true, targetEntity = Option.class)
	private List<Option> opcoes;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Option> getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(List<Option> opcoes) {
		this.opcoes = opcoes;
	}

	public EnumTypeSurvey getTipoEnquete() {
		return tipoEnquete;
	}

	public void setTipoEnquete(EnumTypeSurvey tipoEnquete) {
		this.tipoEnquete = tipoEnquete;
	}

}
