package Programs.Task_6.SubTask_2;

public class MovableCircle extends MovableShape {

    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override public String toString(){
        return "Circle with radius " + radius + " and center at (" + center.x + "; " + center.y + "); " + center.xSpeed + " x speed, " + center.ySpeed + " y speed";
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}