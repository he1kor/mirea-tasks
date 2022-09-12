package Programs.Task_4.SubTask_1;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle(){
        super("white", false);
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length) {
        super("white", false);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }

    @Override
    public String toString() {
        return "Rectangle, length - " + length + ", width - " + width + ", " + color + " color, " + (filled ? "" : "not ") + "filled";
    }
}
