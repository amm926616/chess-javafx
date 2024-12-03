package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import application.chessboard.*;

public class ChessApplication extends Application {
    double squareSize = 80.0; // Set the size of each square

    @Override
    public void start(Stage primaryStage) {
        Board chessBoard = new Board(squareSize, Color.GREEN, Color.WHITE);

        // Create a chessboard
        StackPane root = new StackPane();
        root.getChildren().add(chessBoard.createChessboard());

        Scene scene = new Scene(root, squareSize * 8, squareSize * 8);
        primaryStage.setTitle("Chessboard");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

