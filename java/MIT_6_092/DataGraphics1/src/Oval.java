import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Oval {
    int x;
    int y;
    int height;
    int width;
    Color color;
    int xDirection = 0;
    int yDirection = 0;

    final int SIZE = 20;

    public Oval(int startX, int startY, int startH, int startW, Color startColor) {
        x = startX;
        y = startY;
        height = startH;
        width = startW;
        color = startColor;
    }

    //========================================================
    /** Draws the box at its current position on to surface. */
    public void draw(Graphics surface, Oval currOval) {

        // Draw the object
        // NOTE drawOval registration point is the top left corner of the imaginary bounding rectangle.
        //      To place the oval in the right spot we have to figure out the eal center.

        surface.setColor(color);

        // original   surface.fillOval(x - (currOval.height/2), y - (currOval.width/2), width, height);
        surface.fillOval(x - (currOval.width/2), y - (currOval.height/2), width, height);

        surface.setColor(Color.BLACK);

        ((Graphics2D) surface).setStroke(new BasicStroke(1.0f));

        // original   surface.drawOval(x - (currOval.height/2), y - (currOval.width/2), width, height);
        surface.drawOval(x - (currOval.width/2), y - (currOval.height/2), width, height);

        // Move the center of the object each time we draw it
        x += xDirection;
        y += yDirection;

        // If we have hit the edge and are moving in the wrong direction, reverse direction
        // We check the direction because if a box is placed near the wall, we would get "stuck"
        // rather than moving in the right direction
        if ((x - (currOval.width/2) <= 0 && xDirection < 0) ||
                (x + (currOval.width/2) >= SimpleDraw.WIDTH && xDirection > 0)) {
            xDirection = -xDirection;
        }
        if ((y - (currOval.height/2) <= 0 && yDirection < 0) ||
                (y + (currOval.height/2) >= SimpleDraw.HEIGHT && yDirection > 0)) {
            yDirection = -yDirection;
        }
    }

    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }
}

