package Pirahna;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class CuttingFormContoller implements Initializable {
   @FXML TextField NumberOfUnitsTF = new TextField();
   @FXML TextField CuttingCostTF = new TextField();
   @FXML TextField MetersConsumedRMTF = new TextField();
   @FXML TextField MetersConsumedULMTF = new TextField();
   @FXML TextField ItemIDTF = new TextField();
   @FXML TextField OrderNumberTF = new TextField();
   @FXML DatePicker Date = new DatePicker();
   @FXML ComboBox<String> WorkersCB = new ComboBox<String>();
   @FXML
	protected void showHomePage(ActionEvent event) {
		Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
		try {
			Parent customerRoot = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
			Scene scene = new Scene(customerRoot);
			primaryStage.hide();
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Pirahna's WorkShop");
			primaryStage.getIcons().add(new Image("Icon.jpg"));
			primaryStage.setMaximized(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

  @FXML
  private void Proceed(ActionEvent event) throws IOException {
	  if(Integer.parseInt(NumberOfUnitsTF.getText()) > Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfTotalUnits()){
  
		 Alert alert= new Alert (Alert.AlertType.ERROR);
		alert.setTitle("Error");
		alert.setContentText("Number of pieces cut more than total pieces");
		alert.setHeaderText(null);
		alert.showAndWait();}
	 else {
	Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setDateCutting(Date.getValue().toString());	    
	Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setCuttingPrice(Integer.parseInt(CuttingCostTF.getText()));		
	Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setMetersCutMain(Integer.parseInt(MetersConsumedRMTF.getText()));	
	Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setNumberOfUnitsCut(Integer.parseInt(NumberOfUnitsTF.getText()));		
	Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().setTotalcost((Float.parseFloat(CuttingCostTF.getText())/Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfUnitsCut()));
	Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getJobWorker().setName(WorkersCB.getSelectionModel().getSelectedItem());;
	Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setCondition("READY FOR PRINTING");
	Pirahna.Main.Database.refreshfile("CurrentJobs.txt");
	Pirahna.Main.Database.readfile("CurrentJobs.txt");
	Alert alert= new Alert (Alert.AlertType.INFORMATION);
	alert.setTitle("Job Saved!");
	alert.setContentText("CUTTING proccess saved");
	alert.setHeaderText(null);
	alert.showAndWait();
	Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
	try {
		Parent customerRoot = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		Scene scene = new Scene(customerRoot);
		primaryStage.hide();
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setMaximized(true);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
}
 
  
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
         Pirahna.Main.Database.WorkersOAStrings.add("Moustafa");
         Date.setValue(java.time.LocalDate.now());
         WorkersCB.setItems(Pirahna.Main.Database.WorkersOAStrings);
         ItemIDTF.setText(String.valueOf(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getProductID()));	    
         OrderNumberTF.setText(String.valueOf(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getOrderNumber()));	    

	
	
	
	}
	 
	 
}
