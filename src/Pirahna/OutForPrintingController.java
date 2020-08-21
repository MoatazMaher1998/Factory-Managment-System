package Pirahna;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class OutForPrintingController{
	@FXML TextField number = new TextField();
    @FXML 
 private void Proceed(ActionEvent event) throws IOException {
    	if(Integer.parseInt(number.getText()) > (Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfUnitsCut()*Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getNumberOfPieces())){  
   		 Alert alert= new Alert (Alert.AlertType.ERROR);
   		alert.setTitle("Error");
   		alert.setContentText("Pieces Sent Out More Than Pieces Cut!");
   		alert.setHeaderText(null);
   		alert.showAndWait();}
   	 else {
	Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setNumberOfUnitsOutForPrinting(Integer.parseInt(number.getText()));  
	Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setCondition("OUT FOR PRINTING");
	Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setDatePrinting(java.time.LocalDate.now().toString());
	Pirahna.Main.Database.refreshfile("CurrentJobs.txt");
	Pirahna.Main.Database.readfile("CurrentJobs.txt");	
	 Alert alert= new Alert (Alert.AlertType.INFORMATION);
		alert.setTitle("Success!");
		alert.setContentText("Transportaion Confirmed!");
		alert.setHeaderText(null);
		alert.showAndWait();
	
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
		
		e.printStackTrace();
	}
   	 }
}}
  
    
	
    
	

