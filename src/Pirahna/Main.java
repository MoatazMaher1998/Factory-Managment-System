package Pirahna;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Main extends Application{
	public static MediaPlayer mediaPlayer1;
	public static Data Database = new Data();
	private Stage PrimaryStage;
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		this.PrimaryStage=primaryStage;
		showPrimaryPage();
	
		
	}
	public void showPrimaryPage() throws IOException {
		playmusic();
		Database.readfile("CurrentJobs.txt");
		Database.readfile("Items.txt");
		Database.readfile("counter.txt");
		Database.readfile("OldJobs.txt");
		Parent mainViewRoot =  FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		Scene scene = new Scene(mainViewRoot);
		PrimaryStage.setScene(scene);
		PrimaryStage.setTitle("Pirahna's WorkShop");
		PrimaryStage.getIcons().add(new Image("Icon.jpg"));
		PrimaryStage.setMaximized(true);
		PrimaryStage.show();
	}
	public static void main(String[] args) {
		
		launch(args);
	}//     String[] d = Passer.split("       ");

   private void playmusic() {
	   String musicFile = "B.mp3";     // For example
		Media sound = new Media(new File(musicFile).toURI().toString());
	    mediaPlayer1 = new MediaPlayer(sound);
		mediaPlayer1.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer1.play();
   }
   
	public static int LineCounter(String FileName) throws IOException {
		FileReader x = new FileReader(FileName);
		BufferedReader c = new BufferedReader(x);
		int counter=0;
		while(c.readLine()!=null) {
			counter++;
		}
		x.close();
		return counter;
	}
}
