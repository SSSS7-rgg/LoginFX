package controller;
/**
 * @author Hossaini sam
 * @date 06/14/2024
 * login
 */

import java.io.IOException;


import data.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * it is the login controller
 */

public class LoginController {
	@FXML
	public TextField tfUsername;
	@FXML
	public PasswordField pfPassword;
	@FXML
	public Label lblError;
	
	/**
	 * login Button Pressed
	 * @param event is the log in code
	 * @throws IOException is the id
	 */
	
	public void loginButtonPressed(ActionEvent event) throws IOException {
		/* Get the user name and password */
		String username = tfUsername.getText();
		String password = pfPassword.getText();
		
		if (!username.equals(Database.username) || 
			!password.equals(Database.password)
		) {
			lblError.setText("Invalid username or password.");
			lblError.setVisible(true);
			return;
		}
		
		// Switch scenes to MainApp
		Parent root = FXMLLoader.load(
				getClass().getResource("/view/MainApp.fxml")
		);
		
		Stage appStage = (Stage)((Node)event.getSource())
							.getScene()
							.getWindow();
		Scene scene = new Scene(root);
		appStage.setScene(scene);
	}

}