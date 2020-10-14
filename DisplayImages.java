import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;

import java.awt.Label;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Pos;

@SuppressWarnings("restriction")
public class DisplayImages extends Application{
	public void start(Stage myStage) throws FileNotFoundException {
		Label myLabel = new Label();
		myStage.setTitle("DisplayImages");
		FlowPane rootNode = new FlowPane(5, 5);
		rootNode.setAlignment(Pos.CENTER);
		Scene myScene = new Scene(rootNode, 425, 175);
		myStage.setScene(myScene);
		Image c1 = new Image(new FileInputStream("C:\\Users\\soumyasarang\\Downloads\\c1.gif"));
		ImageView iv1 = new ImageView(c1);
		Image c2 = new Image(new FileInputStream("C:\\Users\\soumyasarang\\Downloads\\c2.gif"));
		ImageView iv2 = new ImageView(c2);
		Image c3 = new Image(new FileInputStream("C:\\Users\\soumyasarang\\Downloads\\c3.gif"));
		ImageView iv3 = new ImageView(c3);
		rootNode.getChildren().addAll(iv1, iv2, iv3);
		myStage.show();
	}
	public static void main (String [] args) {
		launch(args);
	}

}
 