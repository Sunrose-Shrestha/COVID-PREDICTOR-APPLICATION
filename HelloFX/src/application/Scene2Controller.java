package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scene2Controller {
	
	@FXML
	Label nameLabel;
	@FXML
	private Button logoutButton;
	@FXML
	private AnchorPane scenePane;
	@FXML
	private Label yourResult;
	@FXML
	private RadioButton oldAge, semiOldAge, adults, teenage, healthWorker, policeMen, deliveryMen, shopKeeper;
	@FXML
	private static int points;
	
	Stage stage;
	
	public void getAge(ActionEvent event) {
		if(oldAge.isSelected()) {
			points+=20;
		}
		else if(semiOldAge.isSelected()) {
			points+=15;
		}
		if(adults.isSelected()) {
			points+=10;
		}
		if(teenage.isSelected()) {
			points+=5;
		}
	}
	
	public void getProfession(ActionEvent event) {
		points = 0;
		if(healthWorker.isSelected()) {
			points+=15;
		}
		else if(policeMen.isSelected()) {
			points+=12;
		}
		if(deliveryMen.isSelected()) {
			points+=10;
		}
		if(shopKeeper.isSelected()) {
			points+=7;
		}
	}
	
	public void displayName(String username) {
		nameLabel.setText("Hello! " + username + "\nWelcome to covid analysis app...");
	}
	
	public void logout(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You are about to logout!");
		alert.setContentText("Do you really want to exit?");
		
		if(alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage) scenePane.getScene().getWindow();
			System.out.println("You have successfully logged out!");
			stage.close();
		}
	}
	
	public void displayResult(ActionEvent event) {
		if(points==35) {
			yourResult.setText("You have high chance of getting infected!!");
		}
		else if(points<35 && points>=20) {
			yourResult.setText("You have average chance of getting infected!!");
		}
		else if(points<20) {
			yourResult.setText("You have less chance of getting infected!!");
		}
	}
	
}
