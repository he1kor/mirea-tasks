package Programs.Task_8.SubTask_2;

import java.awt.*;

public class SubMain {
    private static volatile boolean isClosed;

    public static void main(){
        isClosed = false;
        Window window = new Window();
        EventQueue.invokeLater(window);
        while (!isClosed){
            Thread.onSpinWait();
        }
    }
    public static void onWindowClosed(){
        isClosed = true;
    }
}
