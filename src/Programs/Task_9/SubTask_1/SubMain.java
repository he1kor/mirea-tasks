package Programs.Task_9.SubTask_1;

import java.awt.*;
import java.util.ArrayList;

public class SubMain {
    private static volatile boolean isClosed;
    public static void main() {
        isClosed = false;
        Dimension resolution = new Dimension(500,500);
        Window window = new Window(resolution);
        EventQueue.invokeLater(window);
        while (!isClosed) {
            Thread.onSpinWait();
        }
    }
    public static void onWindowClosed(){
        isClosed = true;
    }
}
