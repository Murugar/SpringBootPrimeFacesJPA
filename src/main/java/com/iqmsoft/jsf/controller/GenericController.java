package com.iqmsoft.jsf.controller;

import java.lang.reflect.Type;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import com.iqmsoft.jsf.domain.BaseEntity;
import com.iqmsoft.jsf.forms.GenericForm;
import com.iqmsoft.jsf.service.GenericService;

import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

@SuppressWarnings("restriction")
public abstract class GenericController<E extends BaseEntity, F extends GenericForm<E>, S extends GenericService<E>> {

	private F formulario;

	private S service;

	public GenericController(F formulario, S service) {
		super();
		this.formulario = formulario;
		this.service = service;
	}

	@PostConstruct
	public void init() {

		this.iniciarCampos();
	}

	public void salvar() {

		this.getService().saveOrUpdate(this.getFormulario().getEntidade());

		this.iniciarCampos();

		this.mostrarMensagem("Item saved Success", "Success", FacesMessage.SEVERITY_INFO);

	}

	public void remover(E entidade) {

		this.getService().delete(entidade);

		this.mostrarMensagem("Item Deleted Success", "Success", FacesMessage.SEVERITY_INFO);

		this.iniciarCampos();

	}

	protected void iniciarCampos() {

		try {

			this.getFormulario().setEntidade(this.getTipoEntidade().newInstance());

			this.getFormulario().setLista(this.getService().getAll());

		} catch (final Exception e) {

			Logger.getLogger(this.getClass().getName()).info("ERROR: " + e.getMessage());
		}

	}

	public void novaEntidade() {

		try {

			this.getFormulario().setEntidade(this.getTipoEntidade().newInstance());

		} catch (final Exception e) {

			Logger.getLogger(this.getClass().getName()).info("ERROR: " + e.getMessage());

		}
	}

	public void mostrarMensagem(String msg, String titulo, Severity severity) {

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, titulo, msg));

	}

	public F getFormulario() {

		return formulario;
	}

	public S getService() {

		return service;
	}

	@SuppressWarnings("unchecked")
	protected Class<E> getTipoEntidade() {

		final Type type[] = ((ParameterizedTypeImpl) this.getClass().getGenericSuperclass()).getActualTypeArguments();

		return (Class<E>) type[0];
	}
}
