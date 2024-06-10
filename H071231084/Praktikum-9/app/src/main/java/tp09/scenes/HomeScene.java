package tp09.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import tp09.UIUtil;

public class HomeScene {
    private Stage stage;

    public HomeScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        Pane root = new Pane();
        BackgroundImage backgroundImage = UIUtil.createBackgroundImage("/images/home_scene.png", 750, 500);
        Background background = new Background(backgroundImage);
        root.setBackground(background);

        Label labelWelcome = new Label("Welcome back, " + ProfileScene.name + "!");
        labelWelcome.getStyleClass().add("label-1");
        UIUtil.setupLabelLayout(labelWelcome, 50, 40, 500, 33);

        GridPane recentlyPlayedGrid = createRecentlyPlayedGrid();
        UIUtil.setupGridPaneLayout(recentlyPlayedGrid, 50, 142, 340, 120);

        GridPane recommendationGrid = createRecommendationGrid();
        UIUtil.setupGridPaneLayout(recommendationGrid, 50, 318, 520, 120);

        Label labelRP = new Label("Recently Played");
        labelRP.getStyleClass().add("label-2");
        UIUtil.setupLabelLayout(labelRP, 50, 102, 267, 34);

        Label labelRC = new Label("Recommendation");
        labelRC.getStyleClass().add("label-2");
        UIUtil.setupLabelLayout(labelRC, 50, 278, 267, 34);

        Button profileButton = new Button("My Profile");
        profileButton.getStyleClass().add("button");
        UIUtil.setupButtonLayout(profileButton, 550, 40, 150, 40);
        profileButton.setOnAction(e -> {
            ProfileScene profileScene = new ProfileScene(stage);
            profileScene.show();
        });

        root.getChildren().addAll(profileButton, labelWelcome, labelRP, recentlyPlayedGrid, labelRC, recommendationGrid);

        Scene scene = new Scene(root, 750, 500);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    private GridPane createRecentlyPlayedGrid() {
        GridPane grid = new GridPane();
        grid.setHgap(20); 

        VBox itemBox1 = createItemBox("Howl's Moving Castle", "/images/howls.jpg");
        VBox itemBox2 = createItemBox("The Boy & The Heron", "/images/the_boy.jpg");

        grid.add(itemBox1, 0, 0);
        grid.add(itemBox2, 1, 0);

        return grid;
    }

    private GridPane createRecommendationGrid() {
        GridPane grid = new GridPane();
        grid.setHgap(20);

        VBox itemBox1 = createItemBox("Ponyo", "/images/ponyo.jpg");
        VBox itemBox2 = createItemBox("The Wind Rises", "/images/wind_rises.jpg");
        VBox itemBox3 = createItemBox("Spirited Away", "/images/spirited_away.jpg");

        grid.add(itemBox1, 0, 0);
        grid.add(itemBox2, 1, 0);
        grid.add(itemBox3, 2, 0);

        return grid;
    }

    private VBox createItemBox(String title, String imagePath) {
        ImageView imageView = new ImageView(new Image(imagePath));
        imageView.setFitWidth(160);
        imageView.setFitHeight(90);

        Rectangle clip = new Rectangle(
        imageView.getFitWidth(), 
        imageView.getFitHeight()
        );
        clip.setArcWidth(20); 
        clip.setArcHeight(20); 
        imageView.setClip(clip);

        Label titleLabel = new Label(title);
        titleLabel.getStyleClass().add("label-tittle");
        
        VBox itemBox = new VBox(10, imageView, titleLabel);
        itemBox.getStyleClass().add("styled-vbox");
        return itemBox;
    }
}