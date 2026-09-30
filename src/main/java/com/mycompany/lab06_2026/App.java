package com.mycompany.lab06_2026;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;

public class App extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override
    public void start(Stage primaryStage) {

        // Constants for the scene size
        final double SCENE_WIDTH = 520.0;
        final double SCENE_HEIGHT = 520.0;

        // Constants for each square's XY coordinates
        final int X1 = 10, Y1 = 10; // Square #1
        final int X2 = 60, Y2 = 60; // Square #1
        final int X3 = 110, Y3 = 110; // Square #3

        // Constants for each square's width and height
        final int WIDTH1 = 500, HEIGHT1 = 500; // Square #1
        final int WIDTH2 = 400, HEIGHT2 = 400; // Square #2
        final int WIDTH3 = 300, HEIGHT3 = 300; // Square #3

        // Constants for the circle's geometry
        final int CENTER_X = 260, CENTER_Y = 260, RADIUS = 150;

        // Create square #1 here. Set its stroke color to black
        // and set its fill color to null.
        var s1 = new Rectangle(WIDTH1, HEIGHT1);
        s1.setFill(null);
        s1.setStroke(Color.BLACK);
        s1.setX(X1);
        s1.setY(Y1);

        // Create square #2 here. Set its stroke color to black
        // and set its fill color to null.
        var s2 = new Rectangle(WIDTH2, HEIGHT2);
        s2.setFill(null);
        s2.setStroke(Color.BLACK);
        s2.setX(X2);
        s2.setY(Y2);

        // Create square #3 here. Set its stroke color to black
        // and set its fill color to null.
        var s3 = new Rectangle(WIDTH3, HEIGHT3);
        s3.setFill(null);
        s3.setStroke(Color.BLACK);
        s3.setX(X3);
        s3.setY(Y3);
        
        // Create the diagonal lines here.
        var d1 = new Line(X1, Y1, X3, Y3);
        var d2 = new Line(X1 + WIDTH1, Y1, X3 + WIDTH3, Y3);
        var d3 = new Line(X1, Y1 + HEIGHT1, X3, Y3 + HEIGHT3);
        var d4 = new Line(X1 + WIDTH1, Y1 + HEIGHT1, X3 + WIDTH3, Y3 + HEIGHT3);
        
        // Create the circle here.
        var circle = new Circle(CENTER_X, CENTER_Y, RADIUS, Color.BLACK);

        // Add the nodes to a Pane here.
        var root = new Pane();
        root.getChildren().addAll(s1, s2, s3, d1, d2, d3, d4, circle);

        // Create a Scene with the Pane as the root node,
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        
        // and display it here.
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}