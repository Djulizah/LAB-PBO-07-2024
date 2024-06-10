package tp09.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import tp09.UIUtil;

public class ProfileScene {
    private Stage stage;
    public static String name = "Hinata Shoyo";

    public ProfileScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        Pane root = new Pane();
        BackgroundImage backgroundImage = UIUtil.createBackgroundImage("/images/profile_scene.png", 750, 500);
        Background background = new Background(backgroundImage);
        root.setBackground(background);

        Label labelProfile = new Label("My Profile");
        labelProfile.getStyleClass().add("label-1");        
        UIUtil.setupLabelLayout(labelProfile, 159, 106, 165, 33);

        Label labelName = new Label(name);
        labelName.getStyleClass().add("label-1");        
        UIUtil.setupLabelLayout(labelName, 350, 156, 240, 33);

        Circle profilePicture = new Circle(75); 
        profilePicture.setCenterX(230); 
        profilePicture.setCenterY(250); 

        Image image = new Image("/images/profile.jpg");
        profilePicture.setFill(new ImagePattern(image));

        Label labelBio = new Label("Doesn't matter how small I am,\nI can jump!");
        labelBio.getStyleClass().add("label-4");        
        UIUtil.setupLabelLayout(labelBio, 350, 195, 240, 45);

        Label labelTop = new Label("My Top 3 Ghibli Movies:");
        labelTop.getStyleClass().add("label-3");        
        UIUtil.setupLabelLayout(labelTop, 350, 245, 241, 38);

        Label labelTop3 = new Label("1. Howls Moving Castle\n2. From Up On Poppy Hill\n3. The Wind Rises");
        labelTop3.getStyleClass().add("label-4");        
        UIUtil.setupLabelLayout(labelTop3, 350, 277, 228, 69);

        Button homeButton = new Button("HOME");
        homeButton.getStyleClass().add("button");        
        UIUtil.setupButtonLayout(homeButton, 159, 354, 150, 40);
        homeButton.setOnAction(e -> {
            HomeScene homeScene = new HomeScene(stage);
            homeScene.show();
        });
        
        root.getChildren().addAll(homeButton, labelProfile, profilePicture, labelName, labelBio, labelTop, labelTop3);

        Scene scene = new Scene(root, 750, 500);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}