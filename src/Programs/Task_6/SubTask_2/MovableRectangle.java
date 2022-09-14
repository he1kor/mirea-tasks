package Programs.Task_6.SubTask_2;


public class MovableRectangle extends MovableShape implements Movable {
    MovablePoint leftUpCorner;
    MovablePoint rightBottomCorner;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        int leftX = Math.min(x1,x2);
        int topY = Math.max(y1,y2);
        int rightX = Math.max(x1,x2);
        int bottomY = Math.min(y1,y2);
        leftUpCorner = new MovablePoint(leftX,topY,xSpeed,ySpeed);
        rightBottomCorner = new MovablePoint(rightX,bottomY,xSpeed,ySpeed);
    }

    public double getWidth() {
        return leftUpCorner.x-rightBottomCorner.x;
    }

    public double getLength() {
        return leftUpCorner.y-rightBottomCorner.y;
    }

    public double getArea() {
        return getWidth() * getLength();
    }

    public double getPerimeter() {
        return (2 * getWidth()) + (2 * getLength());
    }

    @Override public String toString(){
        return "Rectangle with top-left point at (" + leftUpCorner.x + "; " + leftUpCorner.y + ") and bottom-right at (" + rightBottomCorner.x + "; " + rightBottomCorner.y + "); " + leftUpCorner.xSpeed + " x speed, " + leftUpCorner.ySpeed + " y speed";
    }

    @Override
    public void moveUp() {
        leftUpCorner.moveUp();
        rightBottomCorner.moveUp();
    }

    @Override
    public void moveDown() {
        leftUpCorner.moveDown();
        rightBottomCorner.moveDown();
    }

    @Override
    public void moveLeft() {
        leftUpCorner.moveLeft();
        rightBottomCorner.moveLeft();
    }

    @Override
    public void moveRight() {
        leftUpCorner.moveRight();
        rightBottomCorner.moveRight();
    }
    public boolean isEuclidean(){
        return (leftUpCorner.xSpeed == rightBottomCorner.xSpeed) && (leftUpCorner.ySpeed == rightBottomCorner.ySpeed);
    }
}
