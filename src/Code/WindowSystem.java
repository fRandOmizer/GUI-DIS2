package Code;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * Mainly extending GraphicsEventSystem and managing our application
 */

public class WindowSystem extends de.rwth.hci.Graphics.GraphicsEventSystem {

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
     * Constructor for our class
     *
     * @param i Width
     * @param j height
     */
    public WindowSystem(int i, int j)
    {
        //calling super class constructor
        super(i,j);

        //initializing basic stuff
        this.width=i;
        this.height=j;
        this.windows = new ArrayList<>();

    }

    /**
     * Override method that manage all drawing
     */
    @Override
    public void handlePaint() {
        //accessing all objects in ArrayList windows
        for (SimpleWindow window : windows) {

            //accessing instance points
            List<Point2D> points = window.getPoints();

            //accessing start and end point
            Point2D topLeft = points.get(0);
//            Point2D topRight = points.get(1);
            Point2D bottomRight = points.get(1);
//            Point2D bottomLeft = points.get(3);

            //setting the color for drawing from window
            this.setColor(window.getColor());

            //drawing line & converting values from <0,1> -> <0,inf>
            //top left to top right
            this.drawRect(convertToWindowResolution(this.width,(float)topLeft.getX()),
                    convertToWindowResolution(this.height,(float)topLeft.getY()),
                    convertToWindowResolution(this.width,(float)bottomRight.getX()),
                    convertToWindowResolution(this.height,(float)topLeft.getY()));
            //top right to bottom right
            this.drawRect(convertToWindowResolution(this.width,(float)bottomRight.getX()),
                    convertToWindowResolution(this.height,(float)topLeft.getY()),
                    convertToWindowResolution(this.width,(float)bottomRight.getX()),
                    convertToWindowResolution(this.height,(float)bottomRight.getY()));
            //bottom right to bottom left
            this.drawRect(convertToWindowResolution(this.width,(float)bottomRight.getX()),
                    convertToWindowResolution(this.height,(float)bottomRight.getY()),
                    convertToWindowResolution(this.width,(float)topLeft.getX()),
                    convertToWindowResolution(this.height,(float)bottomRight.getY()));
            //bottom left to top left
            this.drawRect(convertToWindowResolution(this.width,(float)topLeft.getX()),
                    convertToWindowResolution(this.height,(float)bottomRight.getY()),
                    convertToWindowResolution(this.width,(float)topLeft.getX()),
                    convertToWindowResolution(this.height,(float)topLeft.getY()));

            this.fillRect(convertToWindowResolution(this.width,(float)topLeft.getX()),
                    convertToWindowResolution(this.height,(float)topLeft.getY()),
                    convertToWindowResolution(this.width,(float)bottomRight.getX()),
                    convertToWindowResolution(this.height,(float)bottomRight.getY()));


        }

    }

    /**
    * drawing rectagles
    **/

    public void drawRect(float StartX, float StartY, float EndX, float EndY){

        //checking input values, if they are in <0,1>
        if   ((StartX < 0.0f || StartX > 1.0f)
                ||(StartY < 0.0f || StartY > 1.0f)
                ||(EndX < 0.0f || EndX > 1.0f)
                ||(EndY < 0.0f || EndY > 1.0f))
        {
            throw new IllegalArgumentException("Parameter out of range <0;1>");
        }

        //creating simple window
        SimpleWindow window = new SimpleWindow();

        //creating two points
        Point2D start = new Point2D.Float(StartX, StartY );
        Point2D end = new Point2D.Float(EndX, EndY);

        //creating list for two points
        List<Point2D> points = new ArrayList<>();
        //adding two points
        points.add(start);
        points.add(end);

        //adding points to window
        window.setPoints(points);

        //adding window to windows
        windows.add(window);
    }





    /**
     * converting from <0,1> to <0,inf>
     * @param windowSize size of the window: height or width in range <0,inf>
     * @param position   position in range <0,1>
     * @return           real position in window in range <0,inf>
     */
    private int convertToWindowResolution(int windowSize, float position)
    {
        //calculation
        float result = ((float)windowSize)*position;
        //returning result
        return (int)result;
    }

}
