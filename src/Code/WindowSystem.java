package Code;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zanri_000 on 26-Apr-16.
 */
public class WindowSystem extends de.rwth.hci.Graphics.GraphicsEventSystem {

    private List<SimpleWindow> windows;

    public WindowSystem(int i, int j)
    {
        super(i,j);
        windows = new ArrayList<SimpleWindow>();
    }

    @Override
    protected void handlePaint() {

    }

    void drawLine(float StartX, float StartY, float EndX, float EndY){

    }

    void setColor(Color inColor) {

    }
}
