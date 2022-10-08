import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application { 
    @Override
    public void start(Stage primaryStage) { 
        StackPane pane = new StackPane(); // Create Parent Object
        pane.getChildren().add(new Button("OK")); // add node to the pane(Parent)
        Scene scene = new Scene(pane, 200, 50); // add pane to the scene
        primaryStage.setTitle("Button in a pane");
        primaryStage.setScene(scene);
        primaryStage.show();   
        
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
