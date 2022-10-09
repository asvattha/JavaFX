import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class App extends Application { 
    @Override
    public void start(Stage primaryStage) { 
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.RED);

        //Pane stackPane = new StackPane(circle);
        // or
        Pane stackPane = new StackPane();
        stackPane.getChildren().add(circle);

        Scene scene = new Scene(stackPane, 200, 200);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
