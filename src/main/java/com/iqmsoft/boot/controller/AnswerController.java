package com.iqmsoft.boot.controller;

import javax.faces.application.FacesMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.iqmsoft.boot.domain.Question;
import com.iqmsoft.boot.domain.Answer;
import com.iqmsoft.boot.forms.AnswerForm;
import com.iqmsoft.boot.service.AnswerService;
import com.iqmsoft.jsf.controller.GenericController;

@Component
@Scope("request")
public class AnswerController extends GenericController<Answer, AnswerForm, AnswerService> {

	@Autowired
	public AnswerController(AnswerForm formulario, AnswerService service) {
		super(formulario, service);
	}

	public void salvar(Question question) {

		if (!StringUtils.isEmpty(this.getFormulario().getEntidade().getTexto().toString())) {

			this.getFormulario().getEntidade().setQuestion(question);

			super.salvar();

		} else {

			this.mostrarMensagem("Data Required", "Alert", FacesMessage.SEVERITY_WARN);
		}
	}

}
