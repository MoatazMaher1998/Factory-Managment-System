package Pirahna;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class OldJobFormController implements Initializable{
	@FXML ToggleGroup Buttons = new ToggleGroup();
	@FXML ToggleButton Swimsuits = new ToggleButton();
	@FXML ToggleButton Swimrobes = new ToggleButton();
	@FXML ToggleButton Equipments = new ToggleButton();
	@FXML ToggleButton Other = new ToggleButton();
	@FXML Label Label1 = new Label();
	@FXML Label Label2 = new Label();
	@FXML Label Label3 = new Label();
	@FXML Label Label4 = new Label();
	@FXML Label Label5 = new Label();
	@FXML Label Label6 = new Label();
	@FXML Label Label7 = new Label();
	@FXML Label Label8 = new Label();
	@FXML Label Label9 = new Label();
	@FXML Label Label10 = new Label();
	@FXML Label Label11 = new Label();
	@FXML TextField Name = new TextField();
	@FXML TextField ID = new TextField();
	@FXML TextField Colour = new TextField();
	@FXML TextField TotalCost = new TextField();
	@FXML TextField MainMaterial = new TextField();
	@FXML TextField UnderLayMaterial = new TextField();
	@FXML TextField PatronCode = new TextField();
	@FXML TextField NumberOfPieces = new TextField();
	@FXML TextField TextField9 = new TextField();
	@FXML TextField TotalNumberOfUnitsTF = new TextField();
	@FXML DatePicker Date = new DatePicker();
	@FXML TextField OrderNumber = new TextField();
	@FXML Separator x1 = new Separator();
	@FXML Separator x2 = new Separator();
	@FXML Separator x3 = new Separator();
	@FXML Separator x4 = new Separator();
	@FXML ListView<String> WorkLV = new ListView<String>();
	int[] x = new int[Pirahna.Main.Database.ItemsOAData.size()];
	
	
	@FXML 
	private void refresh() {
		int k=0;
		ObservableList<String> Stringer = FXCollections.observableArrayList();
		if(Buttons.getSelectedToggle().equals(Swimsuits)==true) {
			for(int i=0;i<Pirahna.Main.Database.ItemsOAString.size();i++) {
				if(Pirahna.Main.Database.ItemsOAData.get(i).getCategory().equals("SwimSuit")==true) {
					x[k]=i;
					k++;
			    	Stringer.add(Pirahna.Main.Database.ItemsOAData.get(i).getProductID()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getName()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getColour()/*+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getTotalcost()+" L.E/Unit"+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getPatronCode()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getMaterialUsed()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getUnderLayMaterial())*/);}
			}}
		else if(Buttons.getSelectedToggle().equals(Swimrobes)==true) {
			for(int i=0;i<Pirahna.Main.Database.ItemsOAString.size();i++) {
				if(Pirahna.Main.Database.ItemsOAData.get(i).getCategory().equals("SwimRobe")==true) {
					x[k]=i;
					k++;
					Stringer.add(Pirahna.Main.Database.ItemsOAData.get(i).getProductID()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getName()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getColour()/*+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getTotalcost()+" L.E/Unit"+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getPatronCode()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getMaterialUsed()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getUnderLayMaterial()*/);}
			}
		}
		else if(Buttons.getSelectedToggle().equals(Equipments)==true) {
			for(int i=0;i<Pirahna.Main.Database.ItemsOAString.size();i++) {
				if(Pirahna.Main.Database.ItemsOAData.get(i).getCategory().equals("Equipment")==true) {
					x[k]=i;
					k++;
					Stringer.add(Pirahna.Main.Database.ItemsOAData.get(i).getProductID()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getName()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getColour()/*+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getTotalcost()+" L.E/Unit"+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getPatronCode()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getMaterialUsed()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getUnderLayMaterial()*/);}
			}
		}
		else if(Buttons.getSelectedToggle().equals(Other)==true) {
			for(int i=0;i<Pirahna.Main.Database.ItemsOAString.size();i++) {
				if(Pirahna.Main.Database.ItemsOAData.get(i).getCategory().equals("Other")==true) {
					x[k]=i;
					k++;
					Stringer.add(Pirahna.Main.Database.ItemsOAData.get(i).getProductID()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getName()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getColour()/*+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getTotalcost()+" L.E/Unit"+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getPatronCode()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getMaterialUsed()+"       "+Pirahna.Main.Database.ItemsOAData.get(i).getUnderLayMaterial()*/);}
			}
		}

		WorkLV.setItems(Stringer);
	}
	
	@FXML
	protected void showHomePage(ActionEvent event) {
		Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
		try {
			Parent customerRoot = FXMLLoader.load(getClass().getResource("NewJob.fxml"));
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
	int index;
	int flag=0;
	@FXML
private void WorkLVContoller() {
		index = x[WorkLV.getSelectionModel().getSelectedIndex()];
	}
	@FXML
	   private void Proceed(ActionEvent event) throws IOException  {
		if(WorkLV.getSelectionModel().getSelectedIndex() == -1) {}
		else {
		x1.setVisible(true);
		x2.setVisible(true);
		x3.setVisible(true);
		x4.setVisible(true);
		TotalNumberOfUnitsTF.setVisible(true);
		Date.setVisible(true);
		Label1.setVisible(true);
		Label2.setVisible(true);
		Label3.setVisible(true);
     	Label4.setVisible(true); 
		Label5.setVisible(true); 
		Label6.setVisible(true); 
		Label7.setVisible(true); 
		Label8.setVisible(true); 
		Label9.setVisible(true); 
		Label10.setVisible(true); 
		Label11.setVisible(true); 
		Colour.setVisible(true); 
		ID.setVisible(true); 
		 Name.setVisible(true); 
		MainMaterial.setVisible(true); 
		UnderLayMaterial.setVisible(true); 
		 TotalCost.setVisible(true); 
		PatronCode.setVisible(true); 
		 NumberOfPieces.setVisible(true);
		 TextField9.setVisible(true);
		WorkLV.setVisible(false);
		Swimrobes.setVisible(false);
		Swimsuits.setVisible(false);
		Equipments.setVisible(false);
		Other.setVisible(false);
		Pirahna.MainController.index=x[WorkLV.getSelectionModel().getSelectedIndex()];
		Name.setText(Pirahna.Main.Database.ItemsOAData.get(Pirahna.MainController.index).getName());
		ID.setText(Pirahna.Main.Database.ItemsOAData.get(Pirahna.MainController.index).getProductID()+"");
		Colour.setText(Pirahna.Main.Database.ItemsOAData.get(Pirahna.MainController.index).getColour());
		MainMaterial.setText(Pirahna.Main.Database.ItemsOAData.get(Pirahna.MainController.index).getMaterialUsed());
		UnderLayMaterial.setText(Pirahna.Main.Database.ItemsOAData.get(Pirahna.MainController.index).getUnderLayMaterial());
		TotalCost.setText(Pirahna.Main.Database.ItemsOAData.get(Pirahna.MainController.index).getTotalcost()+"");
		PatronCode.setText(Pirahna.Main.Database.ItemsOAData.get(Pirahna.MainController.index).getPatronCode()+"");
		NumberOfPieces.setText(Pirahna.Main.Database.ItemsOAData.get(Pirahna.MainController.index).getNumberOfPieces()+"");
		if(TotalNumberOfUnitsTF.getText().equals("")==true) {}
		else {
		Item NewItem = new Item();
	    NewItem = Pirahna.Main.Database.ItemsOAData.get(Pirahna.MainController.index);
		Job NewJob = new Job(NewItem);
		Worker NewWorker = new Worker();
	    NewJob.setItem(NewItem);
	    NewJob.setJobWorker(NewWorker);
	    NewJob.setNumberOfTotalUnits(Integer.parseInt(TotalNumberOfUnitsTF.getText()));
	    NewJob.setDateStart(Date.getValue().toString());
	    NewJob.setOrderNumber(Pirahna.Main.Database.OrderNumber);
	    NewJob.setCondition("READY FOR CUTTING");
		 Pirahna.Main.Database.OrderNumber++;
	    Pirahna.Main.Database.CurrentJobsOAData.add(NewJob);
	    String Stringer = Pirahna.Main.Database.ToStringFormat(NewJob);
	    Pirahna.Main.Database.CurrentJobsOAStrings.add(Stringer);
	    Pirahna.Main.Database.refreshfile("CurrentJobs.txt");
	     Pirahna.Main.Database.refreshfile("counter.txt");	    
	     Alert alert= new Alert (Alert.AlertType.INFORMATION);
		alert.setTitle("Job Saved!");
		alert.setContentText("Job Saved Successfully");
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
      
		}}}
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			Pirahna.Main.Database.readfile("Items.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Date.setValue(java.time.LocalDate.now());
		OrderNumber.setText(Pirahna.Main.Database.OrderNumber+"");
		Other.setToggleGroup(Buttons);
		Swimsuits.setToggleGroup(Buttons);
        Swimrobes.setToggleGroup(Buttons);
		Equipments.setToggleGroup(Buttons);
        refresh();		
	}
}
