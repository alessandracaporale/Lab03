package it.polito.tdp.spellchecker.model;

public class RichWord {
	private String parola;
	private boolean corretta;
	
	
	
	
	public RichWord(String parola) {
		//super();
		this.parola = parola;
		corretta=false;
	}
	
	
	
	
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public boolean isCorretta() {
		return corretta;
	}
	public void setCorretta(boolean corretta) {
		this.corretta = corretta;
	}
	
	
}
