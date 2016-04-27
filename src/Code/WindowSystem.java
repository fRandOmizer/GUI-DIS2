package Code;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zanri_000 on 26-Apr-16.
 */
public class WindowSystem extends de.rwth.hci.Graphics.GraphicsEventSystem {

    private List<SimpleWindow> windows;
    private int height;
    private int width;

    public WindowSystem(int i, int j)
    {
        super(i,j);
        this.width=i;
        this.height=j;
        this.windows = new ArrayList<>();

    }

    @Override
    public void handlePaint() {
        this.drawLine(0.2f, 0.3f, 0.8f, 0.7f);

        for (SimpleWindow window : windows) {
            List<Point2D> points = window.GetPoints();
            Point2D start = points.get(0);
            Point2D end = points.get(1);

            this.setColor(window.GetColor());
            this.drawLine(convertToWindowResolution(this.width,(float)start.getX()),
                    convertToWindowResolution(this.height,(float)start.getY()),
                    convertToWindowResolution(this.width,(float)end.getX()),
                    convertToWindowResolution(this.height,(float)end.getY()));
        }

    }

    private void drawLine(float StartX, float StartY, float EndX, float EndY){
        if   ((StartX < 0.0f || StartX > 1.0f)
            ||(StartY < 0.0f || StartY > 1.0f)
            ||(EndX < 0.0f || EndX > 1.0f)
            ||(EndY < 0.0f || EndY > 1.0f))
        {
            throw new IllegalArgumentException("Parameter out of range <0;1>");
        }

        SimpleWindow window = new SimpleWindow();

        Point2D start = new Point2D.Float(StartX, StartY );
        Point2D end = new Point2D.Float(EndX, EndY);

        List<Point2D> points = new ArrayList<>();
        points.add(start);
        points.add(end);

        window.SetPoints(points);

        windows.add(window);
    }

    private int convertToWindowResolution(int windowSize, float position)
    {
        float result = ((float)windowSize)*position;
        return (int)result;
    }

}
