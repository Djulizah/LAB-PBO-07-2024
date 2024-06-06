package javafx;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        HomeScene homeScene = new HomeScene(primaryStage);
        ProfileScene profileScene = new ProfileScene(primaryStage);

        homeScene.setProfileScene(profileScene);
        profileScene.setHomeScene(homeScene);

        primaryStage.setTitle("My Profile");
        primaryStage.setScene(homeScene.getScene());
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
