package com.iqmsoft.boot.forms;

import org.springframework.stereotype.Component;

import com.iqmsoft.boot.domain.EnumTypeSurvey;
import com.iqmsoft.boot.domain.Option;
import com.iqmsoft.boot.domain.Question;
import com.iqmsoft.jsf.forms.GenericForm;

@Component
public class QuestionForm extends GenericForm<Question> {

	private Option option;

	private EnumTypeSurvey[] tiposEnquete = EnumTypeSurvey.values();

	private Boolean mostrarRespostas = Boolean.FALSE;

	public Option getOpcao() {
		return option;
	}

	public void setOpcao(Option option) {
		this.option = option;
	}

	public EnumTypeSurvey[] getTiposEnquete() {
		return tiposEnquete;
	}

	public void setTiposEnquete(EnumTypeSurvey[] tiposEnquete) {
		this.tiposEnquete = tiposEnquete;
	}

	public Boolean getMostrarRespostas() {
		return mostrarRespostas;
	}

	public void setMostrarRespostas(Boolean mostrarRespostas) {
		this.mostrarRespostas = mostrarRespostas;
	}

}
