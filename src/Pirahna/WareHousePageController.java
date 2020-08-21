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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class WareHousePageController implements Initializable {
	
	@FXML TableView<String> x = new TableView<String>();
	@FXML ObservableList<String> y = FXCollections.observableArrayList();
	@FXML TableView<String> table = new TableView<String>();
	@FXML 
	private void tryy() {
		//y.add("ibrahim");
		//x.setItems(y);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
//		TableColumn<Object, Object> firstNameCol = new TableColumn<Object, Object>("First Name");
//        TableColumn lastNameCol = new TableColumn("Last Name");
//        TableColumn emailCol = new TableColumn("Email");
//        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
//		y.add("dsaaaaaaaaaaaaaaaAhmed");
//		x.setItems(y);
       tryy();		
	}
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
	protected void showNewMaterialForm(ActionEvent event) {
		Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
		try {
			Parent customerRoot = FXMLLoader.load(getClass().getResource("NewMaterialForm.fxml"));
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
}
