package br.edu.fapce.botao;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class FormController {

	@FXML
	private Button buttonEnviar;

	@FXML
	public void actionEnviar() {
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setTitle("Informação");
		alert.setContentText("O botão foi clicado!");
		alert.showAndWait();

	}

}
