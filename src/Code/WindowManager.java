package Code;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lanwenlin on 5/6/16.
 */
public class WindowManager extends de.rwth.hci.Graphics.GraphicsEventSystem {


    /**
     * Array list for window objects
     */
    private List<SimpleWindow> windows;

    /**
     * Size of App workspace
     */
    private int height;
    private int width;
    /**
    *  title of the window manager
    **/
    private char[] title;

    /*
    * Constructor for our class
    *
    * @param i Width
    * @param j height
    */
    public WindowManager(int i, int j, char[] t)
    {
        //calling super class constructor
        super(i,j);

        //initializing basic stuff
        this.width=i;
        this.height=j;
        this.title=t;
        this.windows = new ArrayList<>();

    }

    /**
     * Override method that manage all drawing
     */
    @Override
    public void handlePaint() {

    }
}
