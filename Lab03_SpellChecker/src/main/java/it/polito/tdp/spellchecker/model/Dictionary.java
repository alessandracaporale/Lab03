package it.polito.tdp.spellchecker.model;

import java.io.*;
import java.util.*;

public class Dictionary {
	
	LinkedList<String> elenco;
	
	public Dictionary() {
		super();
		//this.dictionary = dictionary;
		elenco = new LinkedList<String>();
	}



	public void loadDictionary (String language) {
		if (language.equals("English")) {
			try {
				FileReader fr = new FileReader("English.txt");
				BufferedReader br = new BufferedReader(fr);
				String word;
				while ((word=br.readLine())!=null) {
					elenco.add(word);
				}
				br.close();
			}
			catch (IOException e) {
				System.out.println("Errore nella lettura del file!");
			}
		}
	}

}
