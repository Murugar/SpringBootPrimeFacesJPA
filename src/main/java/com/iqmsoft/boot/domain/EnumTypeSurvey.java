package com.iqmsoft.boot.domain;

public enum EnumTypeSurvey {

	RESPOSTA("Question & Answer"), VOTACAO("Question Vote");
	
	private String chave;

	private EnumTypeSurvey(String chave) {
		this.chave = chave;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}
	
	
}
