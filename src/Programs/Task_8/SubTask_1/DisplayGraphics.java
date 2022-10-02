package Programs.Task_8.SubTask_1;

import java.awt.*;
import java.util.ArrayList;

public class DisplayGraphics extends Canvas {
    Graphics graphics;
    ArrayList<Shape> shapes = new ArrayList<>();
    public void paint(Graphics graphics){
        this.graphics = graphics;
        setBackground(new Color(0xDFCCCC));
        paintShapes(graphics);
    }
    public void setBounds(int x, int y, int width, int height){
        super.setBounds(x,y,width,height);
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
