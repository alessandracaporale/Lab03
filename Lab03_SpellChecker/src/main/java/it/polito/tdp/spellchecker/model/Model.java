package it.polito.tdp.spellchecker.model;

import java.util.*;

public class Model {
	
	public String filtraTesto (String testo) {
		String filtrato = testo.toLowerCase();
		filtrato.replaceAll("[.,\\/#!$%\\^&\\*;:{}=\\-_'()\\[\\]\"]", "");
		return filtrato;
	}

	
	public List<RichWord> spellCheckTest (List<String> inputTextList) {
		Dictionary dizionario = new Dictionary();
		LinkedList<RichWord> elenco = new LinkedList<RichWord>();
		
		for (String s : inputTextList) {
			RichWord parola = new RichWord(s);
			for (String p : dizionario.elenco) {
				if (p.equals(s)) {
					parola.setCorretta(true);
				}
			}
			elenco.add(parola);
		}
		return elenco;
		
	}
	
	public String toString (List<RichWord> lista) {
		String s = "";
		for (RichWord rw : lista) {
			s = s + rw.getParola()+ "\n";
		}
		return s;
	}
}
