import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    VBox root;


    @Override
    public void start(Stage primaryStage) throws Exception {



        root = FXMLLoader.load(getClass().getResource("Data.fxml"));
        primaryStage.setTitle("Fitness Journal");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
}
