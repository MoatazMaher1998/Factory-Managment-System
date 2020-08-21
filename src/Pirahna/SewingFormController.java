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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class SewingFormController implements Initializable {

	@FXML TextField NumberOfUnitsSewTF = new TextField();
	@FXML TextField ExtraTF = new TextField();
    @FXML TextField SewingCostTF = new TextField();
    @FXML DatePicker Date = new DatePicker();
    @FXML TextField ItemIDTF = new TextField();
    @FXML TextField OrderNumberTF = new TextField();
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
    private void Proceed(ActionEvent event) throws IOException {
	   if(Integer.parseInt(NumberOfUnitsSewTF.getText()) > Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfUnitsPrinted()){
			 Alert alert= new Alert (Alert.AlertType.ERROR);
			alert.setTitle("Error");
			alert.setContentText("Number Of Pieces Sewed More Than Printed Pieces");
			alert.setHeaderText(null);
			alert.showAndWait();}
		 else {	
			 Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setNumberOfUnitsSewed(Integer.parseInt(NumberOfUnitsSewTF.getText()));
			 Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setExtra(Integer.parseInt(ExtraTF.getText()));
			 Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setSewingPrice(Integer.parseInt(SewingCostTF.getText()));
			 Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setDateSewing(Date.getValue().toString()); 
			 Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().setTotalcost((Float.parseFloat(SewingCostTF.getText())/Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfUnitsSewed())+Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getTotalcost());
			 Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().setTotalcost(Float.parseFloat(ExtraTF.getText())+Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getTotalcost());
		//	 Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().setTotalcost(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getTotalcost()/Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfTotalUnits());
			 Pirahna.Main.Database.ItemsOAData.get(Pirahna.MainController.indexOfItem).setTotalcost(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getTotalcost());
			 Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setCondition("READY");
			 Pirahna.Main.Database.refreshfile("CurrentJobs.txt");
			 Pirahna.Main.Database.readfile("CurrentJobs.txt");
			 Pirahna.Main.Database.refreshfile("Items.txt");
			 Pirahna.Main.Database.readfile("Items.txt");

			 Alert alert= new Alert (Alert.AlertType.INFORMATION);
				alert.setTitle("Job Saved!");
				alert.setContentText("SEWING proccess saved");
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
        Date.setValue(java.time.LocalDate.now());
		ItemIDTF.setText(String.valueOf(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getProductID()));	    
        OrderNumberTF.setText(String.valueOf(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getOrderNumber()));		
	}

}
