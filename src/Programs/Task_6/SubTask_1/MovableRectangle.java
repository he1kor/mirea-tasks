package Programs.Task_6.SubTask_1;


public class MovableRectangle extends MovableShape implements Movable {
    int width;
    int length;
    MovablePoint center;

    public MovableRectangle(int x, int y, int xSpeed, int ySpeed, int width, int length){
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }

    @Override public String toString(){
        return "Rectangle with width " + width + ", length " + length + " and center at (" + center.x + "; " + center.y + "); " + center.xSpeed + " x speed, " + center.ySpeed + " y speed";
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
