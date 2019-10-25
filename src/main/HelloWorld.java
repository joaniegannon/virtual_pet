package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class HelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //Root
        VBox root = new VBox(10);
        root.setPadding(new Insets(15));

        //Text
        Label text = new Label("Hello");
        root.getChildren().add(text);

        //Setup Stage
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Hello");
        //Show
        primaryStage.show();

    }
}
