package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		String path = "C:\\Users\\DELL\\workspace\\Saz_MediaPlayer\\moviemusic\\SherlockHolmes.mp3";
		//Media media = new Media(new File(path).toURI().toString());
		
		//converted the string to url type
		Player player = new Player(new File(path).toURI().toString());  //first I created a player..
		Scene scene = new Scene(player, 720, 480, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
