package praktikum;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class App extends Application {
    private static Stage stage;
    public static List<User> users = new ArrayList<>();
    public static User currentUser;

    @Override
    public void start(Stage primaryStage) {
        App.stage = primaryStage;
        users.add(new User("user1", "pass1", "kabar.png"));
        users.add(new User("1", "1", "uang.jpg"));
        users.add(new User("a", "a", "aaa.png"));

        goToHomeScene();
        stage.setTitle("JavaFX Authentication");
        stage.show();
    }

    public static void goToHomeScene() {
        SceneHome home = new SceneHome();
        Scene scene = new Scene(home.getView(), 400, 300);
        stage.setScene(scene);
    }

    public static void goToProfileScene() {
        SceneProfil profile = new SceneProfil();
        Scene scene = new Scene(profile.getView(), 400, 300);
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}