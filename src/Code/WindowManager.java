package Code;



/**
 * Created by lanwenlin on 5/6/16.
 */
public class WindowManager {


    /**
     * Constructor for our class
     *
     * @param i Width
     * @param j height
     */
    public WindowManager(int i, int j) {


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
