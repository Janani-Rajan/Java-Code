//Janani Rajan, 9/8/19

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.scene.control.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.*;
import javafx.event.*;

@SuppressWarnings("restriction")
public class FlipImages extends Application {
	public void start(Stage myStage) throws FileNotFoundException {
		//Set stage title
		myStage.setTitle("FlipImages");
		
		//Create/configure GridPane
		GridPane rootNode = new GridPane();
		rootNode.setAlignment(Pos.CENTER);
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		Scene myScene = new Scene(rootNode, 700, 300);
		myStage.setScene(myScene);
		
		//Create images and imageviews for each image
		Image c1 = new Image(new FileInputStream("C:\\Users\\soumyasarang\\Downloads\\c1.gif"));
		ImageView iv1 = new ImageView(c1);
		Image c2 = new Image(new FileInputStream("C:\\Users\\soumyasarang\\Downloads\\c2.gif"));
		ImageView iv2 = new ImageView(c2);
		Image c3 = new Image(new FileInputStream("C:\\Users\\soumyasarang\\Downloads\\c3.gif"));
		ImageView iv3 = new ImageView(c3);
		Image b1fv = new Image(new FileInputStream("C:\\Users\\soumyasarang\\Downloads\\b1fv.gif"));
		
		//Create buttons with text
		Button button1 = new Button("Flip");
		Button button2 = new Button("Flip");
		Button button3 = new Button("Flip");
		
		//Add all controls to the root node and set alignment of buttons to center
		rootNode.addColumn(0, iv1, button1);
		rootNode.addColumn(1, iv2, button2);
		rootNode.addColumn(2, iv3, button3);
		GridPane.setHalignment(button1, HPos.CENTER);
		GridPane.setHalignment(button2, HPos.CENTER);
		GridPane.setHalignment(button3, HPos.CENTER);
		
		//Button handler class
		class ButtonHandler implements EventHandler<ActionEvent> {
			@Override
			public void handle(ActionEvent e) {
				//Check event source and flip image appropriately
				if (e.getSource() == button1) {
					if ( iv1.getImage() == c1 ) {
						iv1.setImage(b1fv);
					} else {
						iv1.setImage(c1);
					}
				}
				if (e.getSource() == button2) {
					if ( iv2.getImage() == c2 ) {
						iv2.setImage(b1fv);
					} else {
						iv2.setImage(c2);
					}
				}
				if (e.getSource() == button3) {
					if ( iv3.getImage() == c3 ) {
						iv3.setImage(b1fv);
					} else {
						iv3.setImage(c3);
					}
				}
			}
		}
		
		//Set buttons on action
		button1.setOnAction(new ButtonHandler());
		button2.setOnAction(new ButtonHandler());
		button3.setOnAction(new ButtonHandler());
		
		//Display stage
		myStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
 