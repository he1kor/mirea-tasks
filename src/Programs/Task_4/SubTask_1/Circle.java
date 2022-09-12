package Programs.Task_4.SubTask_1;

public class Circle extends Shape{
    double radius;
    public Circle(){
        super("white", false);
        radius = 1.0;
    }

    public Circle(double radius) {
        super("white", false);
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle, radius - " + radius + ", " + color + " color, " + (filled ? "" : "not ") + "filled";
    }
}
