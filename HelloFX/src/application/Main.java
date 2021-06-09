package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
//import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//import javafx.scene.text.Text;


public class Main extends Application {
	
	@Override
	public void start(Stage stage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		String css = this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
