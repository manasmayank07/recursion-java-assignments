import edu.princeton.cs.introcs.StdDraw;

public class RecursiveSquares {
    public static void drawSquares(double x, double y, double size) {
        if (size <= 0.01) return;

        // Draw the square
        StdDraw.square(x, y, size / 2.0);

        // Recursively draw 4 smaller squares
        double newSize = size / 2.0;
        drawSquares(x + newSize / 2.0, y + newSize / 2.0, newSize);
        drawSquares(x - newSize / 2.0, y + newSize / 2.0, newSize);
        drawSquares(x + newSize / 2.0, y - newSize / 2.0, newSize);
        drawSquares(x - newSize / 2.0, y - newSize / 2.0, newSize);
    }

    public static void main(String[] args) {
        StdDraw.setScale(-1, 1);
        drawSquares(0, 0, 1.0);
    }
}
