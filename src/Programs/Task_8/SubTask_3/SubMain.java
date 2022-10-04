package Programs.Task_8.SubTask_3;

import java.awt.*;
import java.io.File;

public class SubMain {
    private static boolean onClosed;
    public static void main(){
        onClosed = false;
        boolean isHorizontal = Input.getBoolean("Enter if your image is horizontal or not: ");
        int numberOfFrames = Input.getInt("Enter count of frames in your image: ");
        File image = Input.getFile("Enter file path: ");
        Window window = new Window(image,numberOfFrames,isHorizontal);
        EventQueue.invokeLater(window);
        while (!onClosed){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            window.nextFrame();
        }
    }
    public static void onClosed(){
        onClosed = true;
    }
}
