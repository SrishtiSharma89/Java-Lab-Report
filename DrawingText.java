package com.example.javafxpractice;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DrawingText extends Application{
    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        Text text = new Text();
        text.setText("Hello! I am practicing JavaFX!");
        text.setX(50);
        text.setY(100);
        text.setFont(Font.font("Arial", 25));
        pane.getChildren().add(text);
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setTitle("Drawing text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
