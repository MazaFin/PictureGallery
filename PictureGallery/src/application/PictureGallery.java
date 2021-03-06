package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PictureGallery extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		
		primaryStage.setTitle("PictureGallery");
		Pane myPane = (Pane)FXMLLoader.load(getClass().getResource("picturegallery.fxml"));
		primaryStage.setScene(new Scene(myPane));
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
