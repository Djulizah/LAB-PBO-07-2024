package javafx;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProfileScene {
    private Scene scene;
    private Label greetingLabel;
    private Label nameLabel;
    private Label nimLabel;
    private ImageView profileImageView;
    private HomeScene homeScene;

    public ProfileScene(Stage primaryStage) {
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-color: linear-gradient(to bottom, #2C3E50, #4CA1AF); -fx-padding: 40;");

        greetingLabel = new Label();
        greetingLabel.setStyle("-fx-text-fill: white; -fx-font-size: 28px; -fx-font-weight: bold;");
        greetingLabel.setText("Halo");

        profileImageView = new ImageView();
        profileImageView.setFitWidth(120);
        profileImageView.setFitHeight(120);
        profileImageView.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.3), 10, 0, 0, 0);");

        nameLabel = new Label();
        nameLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");

        nimLabel = new Label();
        nimLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");

        Button nextButton = new Button("Next");
        nextButton.setStyle(
            "-fx-background-color: #00BCD4; " +
            "-fx-text-fill: #ffffff; " +
            "-fx-font-size: 14px; " +
            "-fx-padding: 10px 20px; " +
            "-fx-border-radius: 5px; " +
            "-fx-background-radius: 5px; " +
            "-fx-cursor: hand;"
        );

        nextButton.setOnAction(e -> {
            primaryStage.setScene(homeScene.getScene());
        });

        layout.getChildren().addAll(greetingLabel, profileImageView, nameLabel, nimLabel, nextButton);

        scene = new Scene(layout, 600, 400);
    }

    public Scene getScene() {
        return scene;
    }

    public void updateProfile(String name, String nim, String gender) {
        nameLabel.setText(name);
        nimLabel.setText(nim);
        if (gender.equals("Laki-laki")) {
            profileImageView.setImage(new Image("file:/Javafx/app/src/main/java/javafx/styles/images.png"));
        } else {
            profileImageView.setImage(new Image("file:/Javafx/app/src/main/java/javafx/styles/images (1).png"));
        }
    }

    public void setGreeting(String name) {
        String firstName = name.split(" ")[0];
        greetingLabel.setText("Halo " + firstName + ",");
    }

    public void setHomeScene(HomeScene homeScene) {
        this.homeScene = homeScene;
    }
}
