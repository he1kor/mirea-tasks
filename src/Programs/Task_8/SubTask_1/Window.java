package Programs.Task_8.SubTask_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Window implements Runnable{
    private final Dimension resolution;
    DisplayGraphics displayGraphics;
    private JFrame frame;
    private volatile boolean running;

    public Window(Dimension resolution){
        this.resolution = resolution;
        running = false;
    }
    @Override
    public void run() {
        frame = new JFrame("Random Shapes!");
        JPanel panel = new JPanel();
        displayGraphics = new DisplayGraphics(resolution);
        panel.add(displayGraphics);
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                running = false;
                SubMain.onWindowClosed();
            }
        });
        running = true;
    }
    public void drawShapes(ArrayList<Shape> shapes){
        while (!running) {
            Thread.onSpinWait();
        }
        displayGraphics.setShapes(shapes);
    }
    public void destroy(){
        running = false;
        frame.dispose();
    }
}
