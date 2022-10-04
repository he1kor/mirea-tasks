package Programs.Task_9.SubTask_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Window implements Runnable{
    private final Dimension resolution;
    DisplayGraphics displayGraphics;
    private JFrame frame;

    private ArrayList<Shape> shapes;

    public Window(Dimension resolution){
        this.resolution = resolution;
        shapes = new ArrayList<>();
    }
    @Override
    public void run() {
        frame = new JFrame("Random Shapes!");
        JPanel panel = new JPanel();
        displayGraphics = new DisplayGraphics(resolution);
        panel.add(displayGraphics);

        JButton button = new JButton("Create a random shape!");
        ActionListener actionListener = e -> {
            shapes.add(Random.getShape(0,0,resolution.width,resolution.height,10,10,200,200));
            displayGraphics.setShapes(shapes);
        };
        button.addActionListener(actionListener);

        frame.getContentPane().add(button,BorderLayout.NORTH);
        frame.getContentPane().add(panel,BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                SubMain.onWindowClosed();
            }
        });
    }
}
