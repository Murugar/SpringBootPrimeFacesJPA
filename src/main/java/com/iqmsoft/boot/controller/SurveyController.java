package com.iqmsoft.boot.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iqmsoft.boot.domain.Option;
import com.iqmsoft.boot.domain.Question;
import com.iqmsoft.boot.forms.QuestionForm;
import com.iqmsoft.boot.service.QuestionService;
import com.iqmsoft.jsf.controller.GenericController;

@Component
public class SurveyController extends GenericController<Question, QuestionForm, QuestionService> {

	@Autowired
	public SurveyController(QuestionService questionService, QuestionForm formulario) {

		super(formulario, questionService);

	}

	@Override
	public void salvar() {
			super.salvar();
	}

	@Override
	public void novaEntidade() {

		super.novaEntidade();

		this.getFormulario().getEntidade().setOpcoes(new ArrayList<Option>());
	}

	@Override
	protected void iniciarCampos() {

		this.getFormulario().setOpcao(new Option());

		super.iniciarCampos();

		this.getFormulario().getEntidade().setOpcoes(new ArrayList<Option>());
	}

	public void addOpcao() {

		this.getFormulario().getEntidade().getOpcoes().add(this.getFormulario().getOpcao());

		this.getFormulario().setOpcao(new Option());
	}

	public void removerOpcao(Option option, Integer index) {

		this.getFormulario().getEntidade().getOpcoes().remove(option);

	}

	public void visualizarRespostas(Question question) {

		this.getFormulario().setMostrarRespostas(Boolean.TRUE);

		this.getFormulario().setEntidade(this.getService().findOne(question.getId()));
	}

	public void mostrarEnquetes() {

		this.getFormulario().setMostrarRespostas(Boolean.FALSE);
	}

	public String pageEdit() {

		this.iniciarCampos();

		return "adm/index";
	}

	public String pageList() {

		this.getFormulario().setLista(this.getService().getAll());

		return "/index";
	}
}
