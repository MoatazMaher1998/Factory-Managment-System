package Pirahna;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class WorkersFormController {
	@FXML
	protected void showHomePage(ActionEvent event) {
	Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
	try {
		Parent customerRoot = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		Scene scene = new Scene(customerRoot);
		primaryStage.hide();
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pirahna's WorkShop");
		primaryStage.getIcons().add(new Image("Icon.jpg"));
		primaryStage.show();
		primaryStage.setMaximized(true);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	@FXML
   protected void showAddWorkerForm(ActionEvent event) {
	Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
	try {
		Parent customerRoot = FXMLLoader.load(getClass().getResource("AddWorkerForm.fxml"));
		Scene scene = new Scene(customerRoot);
		primaryStage.hide();
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pirahna's WorkShop");
		primaryStage.getIcons().add(new Image("Icon.jpg"));
		primaryStage.show();
		primaryStage.setMaximized(false);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
