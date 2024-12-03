package application.chessboard;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square {
    private Color color;
    private int x; // X-coordinate on the board
    private int y; // Y-coordinate on the board
    private double gridLength;

    public Square(Color color, int x, int y, double gridLength) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.gridLength = gridLength;
    }

    // Method to create the Rectangle representing this square
    public Rectangle getVisualRepresentation() {
        Rectangle rect = new Rectangle(gridLength, gridLength, color);
        return rect;
    }

    // Getters
    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getGridLength() {
        return gridLength;
    }
}
