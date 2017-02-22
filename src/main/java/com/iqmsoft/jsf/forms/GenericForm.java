package com.iqmsoft.jsf.forms;

import java.util.List;

import com.iqmsoft.jsf.domain.BaseEntity;

public abstract class GenericForm<E extends BaseEntity> {

	private List<E> lista;

	private E entidade;

	public List<E> getLista() {
		return lista;
	}

	public void setLista(List<E> lista) {
		this.lista = lista;
	}

	public E getEntidade() {
		return entidade;
	}

	public void setEntidade(E entidade) {
		this.entidade = entidade;
	}

}
