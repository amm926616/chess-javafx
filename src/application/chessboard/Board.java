package application.chessboard;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Board {
    private final int rows = 8;
    private final int cols = 8;
    private Color darkSquareColor = Color.GREEN;
    private Color lightSquareColor = Color.WHITE;
    private double squareSize = 80.0;

    public Board(double squareSize, Color darkColor, Color lightColor) {
    	super();
        this.squareSize = squareSize;
    	this.darkSquareColor = darkColor;
    	this.lightSquareColor = lightColor;        
    }
    
    
    public Board() {
		super();
	}


	// Method to create the chessboard
    public GridPane createChessboard() {
        GridPane gridPane = new GridPane();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // Alternate colors between black and white
                Color color = (row + col) % 2 == 0 ? lightSquareColor : darkSquareColor;
                Square square = new Square(color, row, col, squareSize);

                // Get the visual representation and add it to the grid
                gridPane.add(square.getVisualRepresentation(), col, row);
            }
        }

        return gridPane;
    }
}
