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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ReviewController implements Initializable{
	@FXML TextField Name = new TextField();
	@FXML TextField ID = new TextField();
	@FXML TextField Colour = new TextField();
	@FXML TextField TotalCost = new TextField();
	@FXML TextField MainMaterial = new TextField();
	@FXML TextField UnderLayMaterial = new TextField();
	@FXML TextField PatronCode = new TextField();
	@FXML TextField NumberOfPieces = new TextField();
	@FXML TextField Search = new TextField();
	@FXML TextField TotalNumberOfUnitsTF = new TextField();
	@FXML TextField OrderNumber = new TextField();
	@FXML TextField DateStart= new TextField();
	@FXML TextField DateCutting= new TextField();;
	@FXML TextField DatePrinting= new TextField();;
	@FXML TextField DateSewing= new TextField();;
	@FXML TextField DateEnd= new TextField();;
	@FXML TextField  CuttingPrice= new TextField();
	@FXML TextField  SewingPrice= new TextField();
	@FXML TextField  PrintingPrice= new TextField();
	@FXML TextField  Losses= new TextField();
	@FXML TextField  MetersCutMain= new TextField();
	@FXML TextField  MetersCutSec= new TextField();
	@FXML TextField  NumberOfUnitsCut= new TextField();
	@FXML TextField  NumberOfUnitsPrinted= new TextField();
	@FXML TextField  NumberOfUnitsSewed= new TextField();
	@FXML TextField  JobWorkerName = new TextField();
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		Name.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getName());
 ID.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getProductID()+""); 
 Colour.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getColour()); 
 TotalCost.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getTotalcost()+""); 
 MainMaterial.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getMaterialUsed()); 
 UnderLayMaterial.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getUnderLayMaterial()); 
 PatronCode.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getPatronCode()+""); 
 NumberOfPieces.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getNumberOfPieces()+""); 
// TotalNumberOfUnitsTF.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfTotalUnits()+""); 
 OrderNumber.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getOrderNumber()+""); 
 DateStart.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getDateStart()); 
 DateCutting.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getDateCutting()); ;
 DatePrinting.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getDatePrinting()); ;
 DateSewing.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getDateSewing()); ;
 DateEnd.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getDateEnd()); ;
	     CuttingPrice.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getCuttingPrice()+""); 
 SewingPrice.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getSewingPrice()+""); 
 PrintingPrice.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getPrintingPrice()+""); 
 Losses.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getLosses()+""); 
 MetersCutMain.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getMetersCutMain()+""); 
 MetersCutSec.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getMetersCutSec()+""); 
 NumberOfUnitsCut.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfUnitsCut()+""); 
 NumberOfUnitsPrinted.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfUnitsPrinted()+""); 
 NumberOfUnitsSewed.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfUnitsSewed()+""); 
 JobWorkerName.setText(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getJobWorker().getName());
	}
}
