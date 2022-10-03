package Programs.Task_8.SubTask_1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class SubMain {
    private static volatile boolean isClosed;
    public static void main() {
        isClosed = false;
        Dimension resolution = new Dimension(500,500);
        Window window = new Window(resolution);
        EventQueue.invokeLater(window);
        ArrayList<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            shapes.add(Random.getShape(0, 0, resolution.width,resolution.height,10,10,200,200));
        }
        window.drawShapes(shapes);
        while (!isClosed) {
            Thread.onSpinWait();
        }
    }
    public static void onWindowClosed(){
        isClosed = true;
    }
}
