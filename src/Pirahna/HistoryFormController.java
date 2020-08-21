package Pirahna;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class HistoryFormController implements Initializable{
	@FXML ToggleGroup Buttons = new ToggleGroup();
	@FXML ToggleGroup RadioButtons = new ToggleGroup();
    @FXML RadioButton ByBatch = new RadioButton();
    @FXML RadioButton ByDate = new RadioButton();
    @FXML DatePicker DateFrom = new DatePicker();
    @FXML DatePicker DateTo = new DatePicker();
	@FXML ToggleButton Swimsuits = new ToggleButton();
	@FXML ToggleButton Swimrobes = new ToggleButton();
	@FXML ToggleButton Equipments = new ToggleButton();
	@FXML ToggleButton Other = new ToggleButton();
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
	@FXML ListView<String> WorkLV = new ListView<String>();
	int index;
	int[] x = new int[Pirahna.Main.Database.OldJobsOAData.size()];

	
	@FXML
	private void refresh() {
		int k=0;
		ObservableList<String> Stringer = FXCollections.observableArrayList();
		if(Buttons.getSelectedToggle().equals(Swimsuits)==true) {
			for(int i=0;i<Pirahna.Main.Database.OldJobsOAData.size();i++) {
				if(Pirahna.Main.Database.OldJobsOAData.get(i).getItem().getCategory().equals("SwimSuit")==true) {
					x[k]=i;
					k++;
					Stringer.add(Pirahna.Main.Database.ToStringFormat(Pirahna.Main.Database.OldJobsOAData.get(i)));
			    //	Stringer.add(Pirahna.Main.Database.ItemsOAData.get(i).getProductID()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getName()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getColour()/*+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getTotalcost()+" L.E/Unit"+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getPatronCode()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getMaterialUsed()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getUnderLayMaterial())*/);}
			}}}
		else if(Buttons.getSelectedToggle().equals(Swimrobes)==true) {
			for(int i=0;i<Pirahna.Main.Database.OldJobsOAData.size();i++) {
				if(Pirahna.Main.Database.OldJobsOAData.get(i).getItem().getCategory().equals("SwimRobe")==true) {
					x[k]=i;
					k++;
					Stringer.add(Pirahna.Main.Database.ToStringFormat(Pirahna.Main.Database.OldJobsOAData.get(i)));}
					//Stringer.add(Pirahna.Main.Database.ItemsOAData.get(i).getProductID()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getName()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getColour()/*+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getTotalcost()+" L.E/Unit"+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getPatronCode()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getMaterialUsed()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getUnderLayMaterial()*/);}
			}
		}
		else if(Buttons.getSelectedToggle().equals(Equipments)==true) {
			for(int i=0;i<Pirahna.Main.Database.OldJobsOAData.size();i++) {
				if(Pirahna.Main.Database.OldJobsOAData.get(i).getItem().getCategory().equals("Equipment")==true) {
					x[k]=i;
					k++;
					Stringer.add(Pirahna.Main.Database.ToStringFormat(Pirahna.Main.Database.OldJobsOAData.get(i)));}
					//Stringer.add(Pirahna.Main.Database.ItemsOAData.get(i).getProductID()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getName()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getColour()/*+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getTotalcost()+" L.E/Unit"+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getPatronCode()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getMaterialUsed()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getUnderLayMaterial()*/);}
			}
		}
		else if(Buttons.getSelectedToggle().equals(Other)==true) {
			for(int i=0;i<Pirahna.Main.Database.OldJobsOAData.size();i++) {
				if(Pirahna.Main.Database.OldJobsOAData.get(i).getItem().getCategory().equals("Other")==true) {
					x[k]=i;
					k++;
					Stringer.add(Pirahna.Main.Database.ToStringFormat(Pirahna.Main.Database.OldJobsOAData.get(i)));}
					// Stringer.add(Pirahna.Main.Database.ItemsOAData.get(i).getProductID()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getName()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getColour()/*+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getTotalcost()+" L.E/Unit"+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getPatronCode()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getMaterialUsed()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getUnderLayMaterial()*/);}
			}
		}

		WorkLV.setItems(Stringer);

	}
	
@FXML
   private void View() {
	index = x[WorkLV.getSelectionModel().getSelectedIndex()];
	Name.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getItem().getName());
	 ID.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getItem().getProductID()+""); 
	 Colour.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getItem().getColour()); 
	 TotalCost.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getItem().getTotalcost()+""); 
	 MainMaterial.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getItem().getMaterialUsed()); 
	 UnderLayMaterial.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getItem().getUnderLayMaterial()); 
	 PatronCode.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getItem().getPatronCode()+""); 
	 NumberOfPieces.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getItem().getNumberOfPieces()+""); 
	// TotalNumberOfUnitsTF.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getNumberOfTotalUnits()+""); 
	 OrderNumber.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getOrderNumber()+""); 
	 DateStart.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getDateStart()); 
	 DateCutting.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getDateCutting()); ;
	 DatePrinting.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getDatePrinting()); ;
	 DateSewing.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getDateSewing()); ;
	 DateEnd.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getDateEnd()); ;
     CuttingPrice.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getCuttingPrice()+""); 
	 SewingPrice.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getSewingPrice()+""); 
	 PrintingPrice.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getPrintingPrice()+""); 
	 Losses.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getLosses()+""); 
	 MetersCutMain.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getMetersCutMain()+""); 
	 MetersCutSec.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getMetersCutSec()+""); 
	 NumberOfUnitsCut.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getNumberOfUnitsCut()+""); 
	 NumberOfUnitsPrinted.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getNumberOfUnitsPrinted()+""); 
	 NumberOfUnitsSewed.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getNumberOfUnitsSewed()+""); 
	 JobWorkerName.setText(Pirahna.Main.Database.OldJobsOAData.get(index).getJobWorker().getName()); }
	@FXML
	protected void showHomePage(ActionEvent event) {
		Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
		try {
			Parent customerRoot = FXMLLoader.load(getClass().getResource("NewJob.fxml"));
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
private void search() {
	    
		int k=0;
		ObservableList<String> Stringer = FXCollections.observableArrayList();
		if(RadioButtons.getSelectedToggle().equals(ByDate)==true) {
				for(int i=0;i<Pirahna.Main.Database.OldJobsOAData.size();i++) {
					if(LocalDate.parse(Pirahna.Main.Database.OldJobsOAData.get(i).getDateStart()).isAfter(DateFrom.getValue())==true && LocalDate.parse(Pirahna.Main.Database.OldJobsOAData.get(i).getDateEnd()).isBefore(DateTo.getValue())==true || LocalDate.parse(Pirahna.Main.Database.OldJobsOAData.get(i).getDateStart()).isEqual(DateFrom.getValue())==true || LocalDate.parse(Pirahna.Main.Database.OldJobsOAData.get(i).getDateEnd()).isEqual(DateFrom.getValue())==true) {
					x[k]=i;
					k++;
					Stringer.add(Pirahna.Main.Database.ToStringFormat(Pirahna.Main.Database.OldJobsOAData.get(i)));}
				}
				WorkLV.setItems(Stringer);
		}
		
		else {
			for(int i=0;i<Pirahna.Main.Database.OldJobsOAData.size();i++) {
if(Search.getText().equals(String.valueOf(Pirahna.Main.Database.OldJobsOAData.get(i).getOrderNumber()))==true) {
	x[k]=i;
	k++;
	Stringer.add(Pirahna.Main.Database.ToStringFormat(Pirahna.Main.Database.OldJobsOAData.get(i)));}
			}
			WorkLV.setItems(Stringer);

			
		}
	}
@FXML 
private void SwitchRadio() {
	if(RadioButtons.getSelectedToggle().equals(ByDate)==true) {
		Search.setVisible(false);
		DateTo.setVisible(true);
		DateFrom.setVisible(true);
	}
	else {
		Search.setVisible(true);
		DateTo.setVisible(false);
		DateFrom.setVisible(false);
	}
}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			Pirahna.Main.Database.readfile("OldJobs.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ByBatch.setToggleGroup(RadioButtons);
		ByDate.setToggleGroup(RadioButtons);
		Other.setToggleGroup(Buttons);
		Swimsuits.setToggleGroup(Buttons);
        Swimrobes.setToggleGroup(Buttons);
		Equipments.setToggleGroup(Buttons);
		refresh();
	}

}
