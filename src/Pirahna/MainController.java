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
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainController implements Initializable {
	 public static int index=-1;
	 public static int indexOfItem;

	@FXML
	protected void showNewJobPage(ActionEvent event) {
		Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
		try {
			Parent customerRoot = FXMLLoader.load(getClass().getResource("NewJob.fxml"));
			Scene scene = new Scene(customerRoot);
			primaryStage.hide();
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	protected void showWareHousePage(ActionEvent event) {
		Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
		try {
			Parent customerRoot = FXMLLoader.load(getClass().getResource("WareHousePage.fxml"));
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
	protected void showWorkersPage(ActionEvent event) {
		Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
		try {
			Parent customerRoot = FXMLLoader.load(getClass().getResource("WorkersPage.fxml"));
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
	protected void showNewJobForm(ActionEvent event) {
		Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
		try {
			Parent customerRoot = FXMLLoader.load(getClass().getResource("NewJobForm.fxml"));
			Scene scene = new Scene(customerRoot);
			primaryStage.hide();
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Pirahna's WorkShop");
			primaryStage.getIcons().add(new Image("Icon.jpg"));
			primaryStage.setMaximized(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@FXML
	protected void showOldJobForm(ActionEvent event) {
		Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
		try {
			Parent customerRoot = FXMLLoader.load(getClass().getResource("OldJobForm.fxml"));
			Scene scene = new Scene(customerRoot);
			primaryStage.hide();
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Pirahna's WorkShop");
			primaryStage.getIcons().add(new Image("Icon.jpg"));
			primaryStage.setMaximized(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
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
	protected void showHistoryForm(ActionEvent event) {
		Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
		try {
			Parent customerRoot = FXMLLoader.load(getClass().getResource("HistoryForm.fxml"));
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
	private void MusicOnOFF() {
		if(Pirahna.Main.mediaPlayer1.getStatus().toString()=="PLAYING") {Pirahna.Main.mediaPlayer1.pause();}
		if(Pirahna.Main.mediaPlayer1.getStatus().toString()=="PAUSED") {Pirahna.Main.mediaPlayer1.play();}
	}
//	work=FXCollections.observableArrayList();

@FXML ListView<String> WorkLV = new ListView<String>();
private void refresh() {
	WorkLV.setItems(Pirahna.Main.Database.CurrentJobsOAStrings);
}
@FXML 
private void WorkLvControll(ActionEvent event) throws IOException {
	index = WorkLV.getSelectionModel().getSelectedIndex();
	   Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
   switch(CheckWhichCondition()) {
   case  "READY FOR CUTTING": 
	try {
		Parent customerRoot = FXMLLoader.load(getClass().getResource("CuttingForm.fxml"));
		Scene scene = new Scene(customerRoot);
		primaryStage.hide();
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("Pirahna's WorkShop");
		primaryStage.getIcons().add(new Image("Icon.jpg"));
		primaryStage.setMaximized(false);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

   break;
   case "OUT FOR PRINTING":
		try {
			Parent customerRoot = FXMLLoader.load(getClass().getResource("PrintingForm.fxml"));
			Scene scene = new Scene(customerRoot);
			primaryStage.hide();
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Pirahna's WorkShop");
			primaryStage.getIcons().add(new Image("Icon.jpg"));
			primaryStage.setMaximized(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	   break;
   case  "READY FOR SEWING": 
	   
	   try {
			Parent customerRoot = FXMLLoader.load(getClass().getResource("SewingForm.fxml"));
			Scene scene = new Scene(customerRoot);
			primaryStage.hide();
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Pirahna's WorkShop");
			primaryStage.getIcons().add(new Image("Icon.jpg"));
			primaryStage.setMaximized(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	   break;
   case "READY":
	   
	   Alert alert= new Alert (Alert.AlertType.CONFIRMATION);
		alert.setTitle("Job Saved!");
		alert.setContentText("Confirm Transportation to Watergear WareHouse?");
		alert.setHeaderText(null);
		alert.showAndWait();
		if(alert.getResult().getText().equals("Cancel")==true) {}
		else {
			Pirahna.Main.Database.CurrentJobsOAData.get(index).setCondition("DONE");
			Pirahna.Main.Database.CurrentJobsOAData.get(index).setDateEnd(java.time.LocalDate.now().toString());
			Pirahna.Main.Database.OldJobsOAData.add(Pirahna.Main.Database.CurrentJobsOAData.get(index));
	//		Pirahna.Main.Database.OldJobsOAString.add(Pirahna.Main.Database.ToStringFormat(Pirahna.Main.Database.CurrentJobsOAData.get(index)));
			Pirahna.Main.Database.refreshfile("OldJobs.txt");
			Pirahna.Main.Database.readfile("OldJobs.txt");
		    Pirahna.Main.Database.CurrentJobsOAStrings.remove(index);
		    Pirahna.Main.Database.CurrentJobsOAData.remove(Pirahna.Main.Database.CurrentJobsOAData.get(index));
			Pirahna.Main.Database.refreshfile("CurrentJobs.txt");
			Pirahna.Main.Database.readfile("CurrentJobs.txt");	
		}
		break;
   case "READY FOR PRINTING":
	   
	    alert= new Alert (Alert.AlertType.CONFIRMATION);
		alert.setTitle("Job Saved!");
		alert.setContentText("Confirm Transportation For Printing?");
		alert.setHeaderText(null);
		alert.showAndWait();
		if(alert.getResult().getText().equals("Cancel")==true) {}
		else {
			
			 try {
					Parent customerRoot = FXMLLoader.load(getClass().getResource("OutForPrintingWindow.fxml"));
					Scene scene = new Scene(customerRoot);
				    primaryStage.hide();
					primaryStage.setScene(scene);
					primaryStage.show();
					primaryStage.setTitle("Pirahna's WorkShop");
					primaryStage.getIcons().add(new Image("Icon.jpg"));
					primaryStage.setMaximized(false);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			
			
		
		}
	   
	   
	   
	   
	   break;
	   
}
   
   
   }


@FXML 
private void delete() throws IOException {
	if(Pirahna.Main.Database.CurrentJobsOAData.get(index).getCondition().equals("READY FOR CUTTING")) {
		Pirahna.Main.Database.CurrentJobsOAData.remove(index);
		Pirahna.Main.Database.refreshfile("CurrentJobs.txt");
		Pirahna.Main.Database.readfile("CurrentJobs.txt");	
		Alert  alert= new Alert (Alert.AlertType.INFORMATION);
			alert.setTitle("Piranha's Warehouse");
			alert.setContentText("Job Deleted Successfully");
			alert.setHeaderText(null);
			alert.showAndWait();
	}
	else {
		Alert alert= new Alert (Alert.AlertType.ERROR);
			alert.setTitle("Piranha's Warehouse");
			alert.setContentText("Can't Delete Job After Cutting Process!");
			alert.setHeaderText(null);
			alert.showAndWait();
	}
}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
      refresh();
	}
	@FXML private String CheckWhichCondition()
	{ if(WorkLV.getSelectionModel().getSelectedItem().contains("READY FOR CUTTING")==true) {return "READY FOR CUTTING";}
	else if(WorkLV.getSelectionModel().getSelectedItem().contains("READY FOR PRINTING")==true) {return "READY FOR PRINTING";}	
	else if(WorkLV.getSelectionModel().getSelectedItem().contains("READY FOR SEWING")==true) {return "READY FOR SEWING";}
	else if(WorkLV.getSelectionModel().getSelectedItem().contains("PACKING")==true) {return "PACKING";}
	else if(WorkLV.getSelectionModel().getSelectedItem().contains("READY")==true) {return "READY";}
	else if(WorkLV.getSelectionModel().getSelectedItem().contains("OUT FOR PRINTING")==true) {return "OUT FOR PRINTING";}

	else return null;
	}
	@FXML 
  public void indexer() {
		index = WorkLV.getSelectionModel().getSelectedIndex();
	}
	@FXML
	protected void Review(ActionEvent event) {
		Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
		try {
			Parent customerRoot = FXMLLoader.load(getClass().getResource("Review.fxml"));
			Scene scene = new Scene(customerRoot);
			primaryStage.hide();
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Pirahna's WorkShop");
			primaryStage.getIcons().add(new Image("Icon.jpg"));
			primaryStage.setMaximized(false);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
