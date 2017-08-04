import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Oval implements Sprite {
    private int height;
    private int width;
    private Color color;

    public Oval(int startH, int startW, Color startColor) {
        this.height = startH;
        this.width = startW;
        this.color = startColor;
    }

    //========================================================
    /** Draws the box at its current position on to surface. */
    public void draw(Graphics surface, int x, int y) {

        // Draw the object
        // NOTE drawOval registration point is the top left corner of the imaginary bounding rectangle.
        //      To place the oval in the right spot we have to figure out the real center.

        surface.setColor(color);
        surface.fillOval(x, y, width, height);
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(1.0f));
        surface.drawOval(x, y, width, height);
    }

    public int getWidth(){
        return width;
    }

    public int getHeight() {
        return height;
    }


}

