package Programs.Task_8.SubTask_1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Window implements Runnable{
    public Window(){
    }
    DisplayGraphics displayGraphics = new DisplayGraphics();
    @Override
    public void run() {
        System.out.println("TESTTTTT");
            JFrame frame = new JFrame("Random Rectangles!");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(500, 500);
            displayGraphics.setBounds(0,0,500,500);
            frame.add(displayGraphics);
            frame.setVisible(true);
            frame.setResizable(false);
        }
    public void drawShapes(ArrayList<Shape> shapes){
        displayGraphics.setShapes(shapes);
    }
}
