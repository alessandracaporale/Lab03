package it.polito.tdp.spellchecker;

import it.polito.tdp.spellchecker.model.*;
import it.polito.tdp.spellchecker.model.Model;
import it.polito.tdp.spellchecker.model.Dictionary;

import java.net.URL;
import java.util.*;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton btnLanguage;
    
    @FXML
    private MenuItem menuEnglish;

    @FXML
    private MenuItem menuItaliano;

    @FXML
    private TextArea txtInserito;

    @FXML
    private Button btnSpellCheck;

    @FXML
    private TextArea txtRisultato;

    @FXML
    private TextField txtErrori;

    @FXML
    private Button btnClearText;

    @FXML
    private TextField txtTempo;
    
    private Model model;
    Dictionary dizionario;
    
    @FXML
    void doEnglish(ActionEvent event) {
    	dizionario.loadDictionary("English");
    }

    @FXML
    void doItaliano(ActionEvent event) {
    	dizionario.loadDictionary("Italiano");
    }

    @FXML
    void handleClearText(ActionEvent event) {
    	
    }

    @FXML
    void handleErrori(ActionEvent event) {

    }

    @FXML
    void handleLanguage(ActionEvent event) {

    }

    @FXML
    void handleSpellCheck(ActionEvent event) {
    	String inserito = txtInserito.getText();
    	LinkedList<String> parole = new LinkedList<String>();;
    	String arrayparole[]=inserito.split(" ");
    	for (int i=0; i<arrayparole.length; i++) {
    		parole.add(arrayparole[i]);
    	}
    	
    	LinkedList<RichWord> risultato= new LinkedList<>();
    	for (RichWord rw : this.model.spellCheckTest(parole)) {
    		if (rw.isCorretta() == false) {
    			risultato.add(rw);
    		}
    	}
    	
    	String s = this.model.toString(risultato);
    	this.txtRisultato.setText(s);
    	
    }

    @FXML
    void handleTempo(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnLanguage != null : "fx:id=\"btnLanguage\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtInserito != null : "fx:id=\"txtInserito\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnSpellCheck != null : "fx:id=\"btnSpellCheck\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtErrori != null : "fx:id=\"txtErrori\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClearText != null : "fx:id=\"btnClearText\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempo != null : "fx:id=\"txtTempo\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}

