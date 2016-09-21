package application;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Player extends BorderPane{
	
	//To create media we need 3 media's.....
	Media media;
	MediaPlayer player;
	MediaView view;
	Pane mpane;
	public Player(String file){
		media = new Media(file);
		player = new MediaPlayer(media); //creating player with the media
		view = new MediaView(player);    //finally view with that player
		mpane = new Pane();
		
		mpane.getChildren().add(view);
		
		setCenter(mpane);
		player.play();
	}

}
