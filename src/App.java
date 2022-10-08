import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class App extends Application { // 1: Extends Application
    @Override
    public void start(Stage primaryStage){ // 2. Override start (JVM creates stage object and calls start method)

        Button btnOK = new Button("OK"); // 3. Create nodes (like button)
        
        Scene scene = new Scene(btnOK, 200, 250); // 4. create scene and place node to the scene
        
        primaryStage.setScene(scene); // 5. add scene to the stage

        primaryStage.show(); // 6. show the stage/window. 
    }
    
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
