package Programs.Task_9.SubTask_1;

import java.awt.*;

public class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(Color color, Point point, int width, int height){
        super(color,point);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(point.x,point.y,width,height);
    }
}
