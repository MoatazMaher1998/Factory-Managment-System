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

public class PrintingFormController implements Initializable{
	@FXML TextField NumberOfUnitsPrintedTF = new TextField();
    @FXML TextField PrintingCostTF = new TextField();
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
		if(Integer.parseInt(NumberOfUnitsPrintedTF.getText()) > Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfUnitsOutForPrinting()){
			 Alert alert= new Alert (Alert.AlertType.ERROR);
			alert.setTitle("Error");
			alert.setContentText("Number Of Pieces In More Than Pieces Out!");
			alert.setHeaderText(null);
			alert.showAndWait();}
		 else {		
		//((Currentjob.getNumberOfUnitsCut()*Currentjob.getItem().getNumberOfPieces())-(Currentjob.getNumberOfUnitsOutForPrinting()-Currentjob.getNumberOfUnitsPrinted()))
			 Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setNumberOfUnitsPrinted(Integer.parseInt(NumberOfUnitsPrintedTF.getText()));
			 Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setPrintingPrice(Integer.parseInt(PrintingCostTF.getText())); 
			 Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setDatePrinting((Date.getValue().toString())); 
			 Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().setTotalcost((Float.parseFloat(PrintingCostTF.getText())/Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfUnitsPrinted())+Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getTotalcost());
			 Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setLosses(((((float)Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfUnitsPrinted())-((float)Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfUnitsOutForPrinting()))/(((float)Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getNumberOfUnitsCut())*((float)Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getNumberOfPieces())))*((float)Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getCuttingPrice()));
			 Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).setCondition("READY FOR SEWING");
		     Pirahna.Main.Database.refreshfile("CurrentJobs.txt");
		     Pirahna.Main.Database.readfile("CurrentJobs.txt");

				Alert alert= new Alert (Alert.AlertType.INFORMATION);
				alert.setTitle("Job Saved!");
				alert.setContentText("PRINTING proccess saved");
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
		//System.out.println(Pirahna.Main.Database.CurrentJobsOAData.get().getPrintingPrice());
		ItemIDTF.setText(String.valueOf(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getItem().getProductID()));	    
        OrderNumberTF.setText(String.valueOf(Pirahna.Main.Database.CurrentJobsOAData.get(Pirahna.MainController.index).getOrderNumber()));
        Date.setValue(java.time.LocalDate.now());

	}

}
