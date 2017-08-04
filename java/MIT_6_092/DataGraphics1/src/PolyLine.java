import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

 public class PolyLine {
    int[] x;
    int[] y;
    int numPoints = 0;

    final int SIZE = 20;

    public PolyLine(int[] startX, int[] startY, int nPoints) {
        x = startX;
        y = startY;
        numPoints = nPoints;

    }

    //========================================================

    /**
     * Draws the box at its current position on to surface.
     */

    public void draw(Graphics surface) {
        // Draw the object

        surface.drawPolyline(x, y, numPoints);

    }
}

