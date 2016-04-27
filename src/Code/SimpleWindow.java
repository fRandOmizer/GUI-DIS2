package Code;

import java.awt.geom.Point2D;
import java.util.List;

/**
 * Created by zanri_000 on 26-Apr-16.
 */
public class SimpleWindow {

    private List<Point2D> elements;

    public SimpleWindow()
    {

    }

    public void Set(List<Point2D> elements)
    {
        this.elements = elements;
    }

    public List<Point2D> Get()
    {
        return elements;
    }
}


