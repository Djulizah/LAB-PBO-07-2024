package javafx;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeScene {
    private Scene scene;
    private ProfileScene profileScene;
    private TextField nameField;
    private TextField nimField;
    private ToggleGroup genderGroup;

    public HomeScene(Stage primaryStage) {
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-color: linear-gradient(to bottom, #2C3E50, #4CA1AF); -fx-padding: 40;");

        Label titleLabel = new Label("Selamat Datang");
        titleLabel.setStyle("-fx-text-fill: white; -fx-font-size: 28px; -fx-font-weight: bold;");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(0, 10, 0, 10));

        Label nameLabel = new Label("Nama Lengkap:");
        nameLabel.setStyle("-fx-text-fill: white; -fx-font-size: 16px;");
        nameField = new TextField();
        nameField.setStyle("-fx-background-radius: 10px; -fx-border-radius: 10px; -fx-padding: 10px;");

        Label nimLabel = new Label("NIM:");
        nimLabel.setStyle("-fx-text-fill: white; -fx-font-size: 16px;");
        nimField = new TextField();
        nimField.setStyle("-fx-background-radius: 10px; -fx-border-radius: 10px; -fx-padding: 10px;");

        Label genderLabel = new Label("Gender:");
        genderLabel.setStyle("-fx-text-fill: white; -fx-font-size: 16px;");
        
        genderGroup = new ToggleGroup();
        RadioButton maleRadio = new RadioButton("Laki-laki");
        maleRadio.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");
        maleRadio.setToggleGroup(genderGroup);
        

        RadioButton femaleRadio = new RadioButton("Perempuan");
        femaleRadio.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");
        femaleRadio.setToggleGroup(genderGroup);

        Button submitButton = new Button("Submit");
        submitButton.setStyle(
            "-fx-background-color: #00BCD4; " +
            "-fx-text-fill: #ffffff; " +
            "-fx-font-size: 14px; " +
            "-fx-padding: 10px 20px; " +
            "-fx-border-radius: 5px; " +
            "-fx-background-radius: 5px; " +
            "-fx-cursor: hand;"
        );

        submitButton.setOnAction(e -> {
            String name = nameField.getText();
            String nim = nimField.getText();
            Toggle selectedToggle = genderGroup.getSelectedToggle();

            if (name.isEmpty() || nim.isEmpty() || selectedToggle == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Kesalahan");
                alert.setHeaderText(null);
                alert.setContentText("Data harus dilengkapi!");
                alert.showAndWait();
            } else if (!nim.matches("H0712310\\d{2}")) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Kesalahan");
                alert.setHeaderText(null);
                alert.setContentText("NIM anda tidak terdaftar!");
                alert.showAndWait();
            } else {
                // Extract the last two digits and convert to integer
                int lastTwoDigits = Integer.parseInt(nim.substring(nim.length() - 2));
                if (lastTwoDigits < 1 || lastTwoDigits > 93) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Kesalahan");
                    alert.setHeaderText(null);
                    alert.setContentText("NIM anda tidak terdaftar!");
                    alert.showAndWait();
                } else {
                    String gender = ((RadioButton) selectedToggle).getText();
                    profileScene.updateProfile(name, nim, gender);
                    profileScene.setGreeting(name);
                    primaryStage.setScene(profileScene.getScene());
                }
            }
        });

        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(nimLabel, 0, 1);
        gridPane.add(nimField, 1, 1);
        gridPane.add(genderLabel, 0, 2);
        gridPane.add(maleRadio, 1, 2);
        gridPane.add(femaleRadio, 1, 3);
        gridPane.add(submitButton, 1, 4);

        layout.getChildren().addAll(titleLabel, gridPane);

        scene = new Scene(layout, 600, 400);
    }

    public Scene getScene() {
        return scene;
    }

    public void setProfileScene(ProfileScene profileScene) {
        this.profileScene = profileScene;
    }
}
