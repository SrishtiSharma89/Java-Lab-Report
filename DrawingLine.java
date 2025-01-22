package com.example.javafxpractice;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DrawingLine extends Application{
    @Override
    public void start(Stage primaryStage){
        //creating pane to hold the line
        Pane pane = new Pane();
        //Creating a line from(50, 50) to (200,200)
        Line line = new Line();
        line.setStartX(50);
        line.setStartY(50);
        line.setEndX(200);
        line.setEndY(200);

        //Adding line to pane
        pane.getChildren().add(line);
        //Creating a scene and setting it on stage
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Drawing line");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
