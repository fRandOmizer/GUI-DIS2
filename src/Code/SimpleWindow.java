package Code;

import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Simple data class for windows
 */
public class SimpleWindow {

    /**
     * List of elements
     */
    private List<Point2D> elements;

    /**
     * Color of window
     */
    private Color color;

    /**
     * Constructor
     */
    public SimpleWindow()
    {
        //basic setting up
        this.elements=new ArrayList<>();

        //creating random color every simple window
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        this.color = new Color(r, g, b);
    }

    /**
     * setter for list of points
     * @param elements list of points
     */
    public void setPoints(List<Point2D> elements)
    {
        this.elements = elements;
    }

    /**
     * getter for list of points
     * @return list of points
     */
    public List<Point2D> getPoints()
    {
        return elements;
    }

    /**
     * setter for color of window
     * @param color Color of window
     */
    public void setColor(Color color)
    {
        this.color = color;
    }


    /**
     * getter for color of window
     * @return color of window
     */
    public Color getColor()
    {
        return this.color;
    }
}




