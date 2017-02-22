package com.iqmsoft.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iqmsoft.boot.domain.Option;
import com.iqmsoft.boot.domain.Question;
import com.iqmsoft.boot.forms.OptionForm;
import com.iqmsoft.boot.service.OptionService;
import com.iqmsoft.jsf.controller.GenericController;

@Component
public class OptionController extends GenericController<Option, OptionForm, OptionService> {

	@Autowired
	public OptionController(OptionForm formulario, OptionService service) {
		super(formulario, service);
	}
	
	public void salvar(Question question) {
		
		this.getFormulario().getEntidade().setQuestion(question);
		
		super.salvar();
	}

}
