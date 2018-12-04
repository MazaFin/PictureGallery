package application;

import java.io.InputStream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PictureGalleryController {

	@FXML
	private ImageView imgview;
	InputStream input1 = getClass().getResourceAsStream("/application/resources/koala.jpg");
	InputStream input2 = getClass().getResourceAsStream("/application/resources/koala_2.jpg");
	Image image = new Image(input1);
	Image image2 = new Image(input2);

	@FXML
	void next(ActionEvent event) {

		imgview.setImage(image);

	}

	@FXML
	void previous(ActionEvent event) {

		imgview.setImage(image2);

	}

	@FXML
	void initialize() {

	}

}
