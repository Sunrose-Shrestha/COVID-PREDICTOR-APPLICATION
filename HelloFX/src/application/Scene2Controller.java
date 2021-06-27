package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class Scene2Controller {
	
	@FXML
	Label nameLabel;
	@FXML
	private RadioButton oldAge, semiOldAge, adults, teenage, healthWorker, policeMen, deliveryMen, shopKeeper,
	lungsDisease, asthma, heartDisease, bloodDisorder, organTransplant, done, notDone, none, none1, male, female;
	@FXML
	private static int points=0;
	private Scene scene;
	private Parent root;
	
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
		if(healthWorker.isSelected()) {
			points+=20;
		}
		else if(policeMen.isSelected()) {
			points+=15;
		}
		else if(deliveryMen.isSelected()) {
			points+=10;
		}
		else if(shopKeeper.isSelected()) {
			points+=7;
		}
		else if(none.isSelected()) {
			points+=5;
		}
	}
	
	public void getHealth(ActionEvent event) {
		if(lungsDisease.isSelected()) {
			points+=20;
		}
		else if(asthma.isSelected()) {
			points+=20;
		}
		else if(heartDisease.isSelected()) {
			points+=18;
		}
		else if(bloodDisorder.isSelected()) {
			points+=15;
		}
		else if(organTransplant.isSelected()) {
			points+=15;
		}
		else if(none1.isSelected()) {
			points+=10;
		}
	}
	
	public void getVaccination(ActionEvent event) {
		if(done.isSelected()) {
			points+=10;
		}
		else if(notDone.isSelected()) {
			points+=20;
		}
	}
	
	public void getGender(ActionEvent event) {
		if(male.isSelected()) {
			points+=15;
		}
		else if(female.isSelected()) {
			points+=20;
		}
	}
	
	public void displayName(String username) {
		nameLabel.setText("Hello! " + username + "\nWelcome to covid analysis app...");
	}
	
	public void result(ActionEvent event) throws IOException{
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene3.fxml"));
		root = loader.load();
		
		Scene3Controller scene3Controller = loader.getController();
		scene3Controller.displayResult(points);
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}
