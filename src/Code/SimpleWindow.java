package Code;

import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zanri_000 on 26-Apr-16.
 */
public class SimpleWindow {

    private List<Point2D> elements;
    private Color color;

    public SimpleWindow()
    {
        this.elements=new ArrayList<>();
        color = new Color(0,0,0);
    }

    public void SetPoints(List<Point2D> elements)
    {
        this.elements = elements;
    }

    public List<Point2D> GetPoints()
    {
        return elements;
    }

    public void SetColor(List<Point2D> elements)
    {
        this.elements = elements;
    }

    public Color GetColor()
    {
        return this.color;
    }
}




