package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		for(int i =0; i < 32; i++) {
			Ellipse e1 = new Ellipse(150,100,100,50);
			e1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			e1.setFill(null);
			e1.setRotate(i*360/32);
			pane.getChildren().add(e1);
		}
		
		Scene scene = new Scene(pane, 300,200);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
}
class LinePane extends Pane{
	public LinePane() {
		Line line1 = new Line(0,0,0,0);
		line1.endXProperty().bind(widthProperty().subtract(10));
		line1.endYProperty().bind(heightProperty().subtract(10));
		line1.setStrokeWidth(5);
		line1.setStroke(Color.BLUE);
		getChildren().add(line1);
		
		Line line2 = new Line(0,0,0,0);
		line2.endXProperty().bind(widthProperty());
		line2.startYProperty().bind(heightProperty());
		line2.setStrokeWidth(5);
		line2.setStroke(Color.RED);
		getChildren().add(line2);
	}
}