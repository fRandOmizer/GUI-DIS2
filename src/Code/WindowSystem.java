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
            Point2D start = points.get(0);
            Point2D end = points.get(1);

            //setting the color for drawing from window
//            this.setColor(window.getColor());
            this.setColor(Color.lightGray);

//            //drawing line & converting values from <0,1> -> <0,inf>
//            this.drawLine(convertToWindowResolution(this.width,(float)start.getX()),
//                    convertToWindowResolution(this.height,(float)start.getY()),
//                    convertToWindowResolution(this.width,(float)end.getX()),
//                    convertToWindowResolution(this.height,(float)end.getY()));


            this.drawRect(convertToWindowResolution(this.width,(float)start.getX()),
                    convertToWindowResolution(this.height,(float)start.getY()),
                    convertToWindowResolution(this.width,(float)end.getX()),
                    convertToWindowResolution(this.height,(float)end.getY()));

            this.fillRect(convertToWindowResolution(this.width,(float)start.getX()),
                    convertToWindowResolution(this.height,(float)start.getY()),
                    convertToWindowResolution(this.width,(float)end.getX()),
                    convertToWindowResolution(this.height,(float)end.getY()));

            this.setColor(Color.blue);
        }

    }

    /**
     * Drawing line
     * @param StartX start X position
     * @param StartY start Y position
     * @param EndX   end X position
     * @param EndY   end Y position
     */

//    public void drawLine(float StartX, float StartY, float EndX, float EndY){
//
//        //checking input values, if they are in <0,1>
//        if   ((StartX < 0.0f || StartX > 1.0f)
//            ||(StartY < 0.0f || StartY > 1.0f)
//            ||(EndX < 0.0f || EndX > 1.0f)
//            ||(EndY < 0.0f || EndY > 1.0f))
//        {
//            throw new IllegalArgumentException("Parameter out of range <0;1>");
//        }
//
//        //creating simple window
//        SimpleWindow window = new SimpleWindow();
//
//        //creating two points
//        Point2D start = new Point2D.Float(StartX, StartY );
//        Point2D end = new Point2D.Float(EndX, EndY);
//
//        //creating list for two points
//        List<Point2D> points = new ArrayList<>();
//        //adding two points
//        points.add(start);
//        points.add(end);
//
//        //adding points to window
//        window.setPoints(points);
//
//        //adding window to windows
//        windows.add(window);
//    }

    public void drawRect(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {

        //checking input values, if they are in <0,1>
        if   ((topLeftX < 0.0f || topLeftX > 1.0f)
                ||(topLeftY < 0.0f || topLeftY > 1.0f)
                ||(bottomRightX < 0.0f || bottomRightX > 1.0f)
                ||(bottomRightY < 0.0f || bottomRightY > 1.0f))
        {
            throw new IllegalArgumentException("Parameter out of range <0;1>");
        }


        SimpleWindow window = new SimpleWindow();

        //creating two points
        Point2D start = new Point2D.Float(topLeftX, topLeftY );
        Point2D end = new Point2D.Float(bottomRightX, bottomRightY);

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
