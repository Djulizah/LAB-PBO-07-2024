import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.styles.HomeScene;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        HomeScene homeScene = new HomeScene(primaryStage);
        primaryStage.setTitle("JavaFX Application");
        primaryStage.setScene(homeScene.getScene());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
