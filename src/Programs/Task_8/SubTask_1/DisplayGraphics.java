package Programs.Task_8.SubTask_1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DisplayGraphics extends JComponent {
    Graphics graphics;
    ArrayList<Shape> shapes = new ArrayList<>();
    public DisplayGraphics(Dimension resolution){
        setPreferredSize(resolution);
    }
    public void paintComponent(Graphics graphics){
        this.graphics = graphics;
        setBackground(new Color(0xDFCCCC));
        paintShapes(graphics);
    }
    private void paintShapes(Graphics graphics){
        for (Shape shape : shapes) {
            shape.draw(graphics);
        }
    }
    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
        repaint();
    }
}
