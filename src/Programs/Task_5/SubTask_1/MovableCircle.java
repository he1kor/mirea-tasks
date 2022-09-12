package Programs.Task_5.SubTask_1;

public class MovableCircle implements Movable{

    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
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