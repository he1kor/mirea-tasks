package Programs.Task_3.SubTask_1;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getLength(){
        return radius * Math.PI * 2;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setLength(double length){
        radius = 0.5 * length / Math.PI;
    }
}
