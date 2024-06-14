package application;

/**
 * @author Mr. sam
 * @date 06/03/2024
 * A login screen using JavaFX 🐐
 */

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * this is the login page
 */
public class MainFX extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(
				getClass().getResource("/view/Login.fxml")
		);
		Scene scene = new Scene(root);
	
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	/**
	 * main
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}