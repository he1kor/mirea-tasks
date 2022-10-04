package Programs.Task_8.SubTask_3;

import java.awt.*;
import java.io.File;

public class SubMain {
    private static boolean onClosed;
    public static void main(){
        onClosed = false;
        File image = Input.getFile("Enter file path: ");
        String question = "Enter count of frames in your image: ";
        int numberOfFrames = Input.getPositiveInt(question);
        boolean isHorizontal = Input.getBoolean("Enter if your image is horizontal or not: ");
        int frameRate = Input.getPositiveInt("Enter amount of frames per second: ");
        int frameInterval = 1000 / frameRate;
        Window window = new Window(image,numberOfFrames,isHorizontal);
        EventQueue.invokeLater(window);
        while (!onClosed){
            try {
                Thread.sleep(frameInterval);
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
