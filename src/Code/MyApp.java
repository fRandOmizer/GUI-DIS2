package Code;

/**
 * This is my app, how awesome is that!
 * Anyway, this is user Class where user sets the windows layout
 */
public class MyApp {
    public static void main(String[] args)
    {
        //creating the object
        WindowSystem obj = new WindowSystem(800,550);
        //drawing line
//        obj.drawLine(0.2f, 0.3f, 0.8f, 0.7f);
//        obj.drawLine(0.2f, 0.7f, 0.8f, 0.3f);
        obj.drawRect(0.2f, 0.7f, 0.8f, 0.3f);
    }
}
