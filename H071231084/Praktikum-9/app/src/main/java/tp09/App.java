package tp09;

import javafx.application.Application;
import javafx.stage.Stage;
import tp09.scenes.HomeScene;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Ghibflix");
        stage.setResizable(false);
        HomeScene homeScene = new HomeScene(stage);
        homeScene.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}