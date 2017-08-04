import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {

    BouncingBox box;
    Oval oval;
    PolyLine polyLine;

    ArrayList<BouncingBox> myBoxes = new ArrayList<BouncingBox>();
    ArrayList<Oval> myOvals = new ArrayList<Oval>();

    int[] xs = {25, 75, 125, 85, 125, 75, 25, 65};
    int[] ys = {50, 90, 50, 100, 150, 110, 150, 100};
    PolyLine myPolyLine = new PolyLine(xs, ys, ys.length);

    /** Initializes this class for drawing. */
    public DrawGraphics() {

        // box = new BouncingBox(200, 50, Color.RED);
        myBoxes.add(new BouncingBox(100, 50, Color.GREEN));
        myBoxes.add(new BouncingBox(50, 150, Color.BLUE));
        myBoxes.add(new BouncingBox(150, 250, Color.PINK));
        myBoxes.add(new BouncingBox(250, 200, Color.WHITE));

        myOvals.add(new Oval(200, 100, 100, 50, Color.BLUE));
        myOvals.add(new Oval(110, 90, 50, 150, Color.RED));
        myOvals.add(new Oval(40, 55, 30, 20, Color.GREEN));
        myOvals.add(new Oval(100, 105, 40, 25, Color.ORANGE));
        myOvals.add(new Oval(200, 35, 150, 35, Color.PINK));

        for(BouncingBox box: myBoxes){
            box.setMovementVector(-2, -1);
        }

        for(Oval dOval: myOvals){
            dOval.setMovementVector(2, 1);
        }

    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        //surface.drawLine(50, 50, 250, 250);
        //box.draw(surface);

        surface.drawLine(1, 100, 300, 100);
        surface.drawLine(200, 1, 200, 300);

        for(BouncingBox box: myBoxes){
            box.draw(surface);
        }

        for(Oval dOval: myOvals){
            dOval.draw(surface, dOval);
        }

       // myPolyLine.draw(surface);



      //  surface.drawOval(10,10,50,100);
      //  surface.fillOval(10,10,50,100);

    }
} 