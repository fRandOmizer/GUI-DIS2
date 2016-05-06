package Code;



import java.awt.*;

/**
 * This is my app, how awesome is that!
 * Anyway, this is user Class where user sets the windows layout
 */
public class MyApp {
    public static void main(String[] args)
    {
        //creating the object
        WindowSystem obj = new WindowSystem(900,450);
        //drawing line
//        obj.drawLine(0.2f, 0.3f, 0.8f, 0.7f);

        //drawing Rect
//        obj.drawRect(2, 2, 8, 7);



        obj.drawRect(0.2f, 0.3f, 0.8f, 0.7f);

        obj.drawRect(0.4f, 0.1f, 0.6f, 0.9f);

        obj.drawRect(0.5f, 0.2f, 0.7f, 0.6f);




    }
}
