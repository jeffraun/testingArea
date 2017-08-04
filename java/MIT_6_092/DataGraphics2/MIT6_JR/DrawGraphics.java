import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    //Bouncer movingSprite;
    //Bouncer movingOvalSprite;

    ArrayList<Mover> moveList = new ArrayList<>();
    ArrayList<Bouncer> myBouncerList = new ArrayList<Bouncer>();
    ArrayList<StraightMover> myStraightList = new ArrayList<StraightMover>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {

        Rectangle box = new Rectangle(15, 20, Color.RED);
        moveList.add(new Bouncer(100, 170, box));
        moveList.get(moveList.size() - 1).setMovementVector(3, 1);

        Oval mOval = new Oval( 30, 15, Color.CYAN);
        moveList.add(new Bouncer(50, 50, mOval));
        moveList.get(moveList.size() - 1).setMovementVector(3, 2);

        Rectangle boxStr = new Rectangle(15, 20, Color.green);
        Oval mOvalStr = new Oval( 30, 15, Color.BLUE);

        moveList.add(new StraightMover(20, 30, mOvalStr));
        moveList.get(moveList.size() - 1).setMovementVector(3, 3);
        moveList.add(new StraightMover(20, 110, boxStr));
        moveList.get(moveList.size() - 1).setMovementVector(3, 2);

        /*
        Rectangle box = new Rectangle(15, 20, Color.RED);
        myBouncerList.add(new Bouncer(100, 170, box));
        myBouncerList.get(myBouncerList.size() - 1).setMovementVector(3, 1);

        Oval mOval = new Oval( 30, 15, Color.CYAN);
        myBouncerList.add(new Bouncer(50, 50, mOval));
        myBouncerList.get(myBouncerList.size() - 1).setMovementVector(3, 2);

        Rectangle boxStr = new Rectangle(15, 20, Color.green);
        Oval mOvalStr = new Oval( 30, 15, Color.BLUE);

        myStraightList.add(new StraightMover(20, 30, mOvalStr));
        myStraightList.get(myStraightList.size() - 1).setMovementVector(3, 3);
        myStraightList.add(new StraightMover(20, 110, boxStr));
        myStraightList.get(myStraightList.size() - 1).setMovementVector(3, 2);
*/
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {

        for(int i=0; i < moveList.size(); i++ ){
            moveList.get(i).draw(surface);
        }
        //for(int i=0; i < myStraightList.size(); i++ ){
        //    myStraightList.get(i).draw(surface);
        //}

    }
}
