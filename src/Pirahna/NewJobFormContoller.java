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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.stage.Stage;
public class NewJobFormContoller implements Initializable {
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
			
			e.printStackTrace();
		}
	}
	@FXML ComboBox<String> MaterialsCombobox = new ComboBox<String>();
	
	@FXML javafx.scene.control.TextField OrderNumberTF = new javafx.scene.control.TextField();
    @FXML javafx.scene.control.TextField ItemIDTF = new javafx.scene.control.TextField();
	String Helper;
	@FXML TextField NumberOfPiecesTF = new TextField();		
	@FXML TextField ColourTF1=new TextField();
	@FXML TextField NumberOfUnitsTF=new TextField();
	@FXML TextField NameTF1=new TextField();
	@FXML TextField PatronCodeTF1=new TextField();
	@FXML DatePicker DatePicker12 = new DatePicker();
	@FXML  ComboBox<String> UnderLayMaterialComboBox = new ComboBox<String>();
	@FXML
   private void Writefile(ActionEvent event) throws IOException  {
	 Item NewItem = new Item();
	 Job CurrentJob = new Job(NewItem);	
	 Worker CurrentWorker = new Worker();
	 NewItem.setName(NameTF1.getText());
	 NewItem.setColour(ColourTF1.getText());
	 NewItem.setPatronCode(Integer.parseInt(PatronCodeTF1.getText()));
	 NewItem.setProductID(Integer.parseInt(ItemIDTF.getText()));Pirahna.Main.Database.ItemID++;
	 NewItem.setCategory(PopNoMix());
	 NewItem.setMaterialUsed(MaterialsCombobox.getValue()); // here
	 NewItem.setUnderLayMaterial(UnderLayMaterialComboBox.getValue());
	 NewItem.setNumberOfPieces(Integer.parseInt(NumberOfPiecesTF.getText()));
	 CurrentJob.setDateStart(DatePicker12.getValue().toString());
	 CurrentJob.setNumberOfTotalUnits(Integer.parseInt(NumberOfUnitsTF.getText()));
	 CurrentJob.setOrderNumber(Integer.parseInt(OrderNumberTF.getText()));
	 Pirahna.Main.Database.OrderNumber++;
	 CurrentJob.setCondition("READY FOR CUTTING");
	 CurrentJob.setJobWorker(CurrentWorker);
     Pirahna.Main.Database.CurrentJobsOAData.add(CurrentJob);
     Pirahna.Main.Database.ItemsOAData.add(NewItem);
     Pirahna.MainController.indexOfItem=Pirahna.Main.Database.ItemsOAData.indexOf(NewItem);
     Pirahna.Main.Database.refreshfile("Items.txt");
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
	
	}
	@FXML RadioButton Swimsuit = new RadioButton();
	@FXML RadioButton SwimRobe = new RadioButton();
	@FXML RadioButton Equipment = new RadioButton();
	@FXML RadioButton other = new RadioButton();
	ToggleGroup x = new ToggleGroup();
	@FXML 
	private void InputTest() {
		InputHelper Input = new InputHelper();
		if(Input.checkForLetter(PatronCodeTF1.getText())==false && PatronCodeTF1.getText().equals("")==false) {PatronCodeTF1.setStyle("-fx-control-inner-background:red");}
		else {PatronCodeTF1.setStyle("-fx-control-inner-background:white");}
		if(Input.checkForLetter(ColourTF1.getText())==true && ColourTF1.getText().equals("")==false) {ColourTF1.setStyle("-fx-control-inner-background:red");	}
		else {ColourTF1.setStyle("-fx-control-inner-background:white");	}
		if(Input.checkForLetter(NumberOfPiecesTF.getText())==false && NumberOfPiecesTF.getText().equals("")==false) {NumberOfPiecesTF.setStyle("-fx-control-inner-background:red");}
		else {NumberOfPiecesTF.setStyle("-fx-control-inner-background:white");}
		if(Input.checkForLetter(NumberOfUnitsTF.getText())==false && NumberOfUnitsTF.getText().equals("")==false) {NumberOfUnitsTF.setStyle("-fx-control-inner-background:red");}
		else {NumberOfUnitsTF.setStyle("-fx-control-inner-background:white");}
		
	}
    @FXML
    private String PopNoMix()
    {   SwimRobe.setToggleGroup(x);
        Swimsuit.setToggleGroup(x);
        Equipment.setToggleGroup(x);
        other.setToggleGroup(x);
        if(SwimRobe.isSelected()==true) {return "SwimRobe";}
        else if(Swimsuit.isSelected()==true) {return "SwimSuit";}
        else  if(Equipment.isSelected()==true) {return "Equipment";}
        else if (other.isSelected()==true) {return "Other";}
        else return null;
    }
	@FXML
	private void stat() throws IOException {	
        DatePicker12.setValue(java.time.LocalDate.now());
		OrderNumberTF.setText(Pirahna.Main.Database.OrderNumber+"");
		ItemIDTF.setText(Pirahna.Main.Database.ItemID+"");
		Pirahna.Main.Database.UnderLayMaterials.add("Red underlay");
		UnderLayMaterialComboBox.setItems(Pirahna.Main.Database.UnderLayMaterials);
		Pirahna.Main.Database.MaterialsStrings.add("Ahmed");
		Pirahna.Main.Database.MaterialsStrings.add("Moataz");		
		MaterialsCombobox.setItems(Pirahna.Main.Database.MaterialsStrings);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Pirahna.Main.Database.MaterialsStrings.clear();
           try {
			stat();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}	
	
}



