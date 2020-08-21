package Pirahna;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class test implements Initializable {
	
	@FXML ListView<Job> WorkLV = new ListView<Job>();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<Job> UnderLayMaterials= FXCollections.observableArrayList();
		Item x = new Item();
		Job y = new Job(x);
			UnderLayMaterials.add(y);
			WorkLV.setItems(UnderLayMaterials);
	   
}
}
