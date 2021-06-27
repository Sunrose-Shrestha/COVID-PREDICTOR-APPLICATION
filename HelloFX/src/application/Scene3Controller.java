package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scene3Controller {
	@FXML
	Label nameLabel;
	@FXML
	private AnchorPane scenePane1;
	@FXML
	private Button logoutButton;
	@FXML
	private AnchorPane scenePane;
	private Stage stage;
	
	public void logout(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You are about to logout!");
		alert.setContentText("Do you really want to exit?");
		
		if(alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage) scenePane1.getScene().getWindow();
			System.out.println("You have successfully logged out!");
			stage.close();
		}
	}
	
	public void displayResult(int points) {
		if(points>=80)
			nameLabel.setText("You have high chance of getting infected!");
		else if(points<80 && points>=50)
			nameLabel.setText("You have average chance of getting infected!");
		else
			nameLabel.setText("You have mild chance of getting infected!");
	}
}
