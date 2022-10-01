package Programs.Task_8.SubTask_1;

import java.awt.*;

public abstract class Shape {
    public Shape(Color color, Point point) {
        this.color = color;
        this.point = point;
    }

    public Color getColor() {
        return color;
    }

    public Point getPoint() {
        return point;
    }
    public abstract void draw(Graphics graphics);

    protected Color color;
    protected Point point;
}
