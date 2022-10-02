package Programs.Task_8.SubTask_1;

import java.awt.*;
import java.util.ArrayList;
public class SubMain {
    public static void main() {
        Window window = new Window();
        EventQueue.invokeLater(window);
        ArrayList<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            shapes.add(Random.getShape(0, 0, 500,500,10,10,200,200));
        }
        window.drawShapes(shapes);
    }
}
