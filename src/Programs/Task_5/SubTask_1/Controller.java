package Programs.Task_5.SubTask_1;

import java.util.ArrayList;

public class Controller implements Movable{

    private ArrayList<MovableCircle> circles;
    private MovableCircle selectedCircle;

    public Controller (){
        circles = new ArrayList<>();
    }
    public void createCycle(int x, int y, int xSpeed, int ySpeed, int radius){
        circles.add(new MovableCircle(x,y,xSpeed,ySpeed, radius));
        if (circles.size() == 1){
            selectCircle(circles.get(0));
        }
    }

    public void selectCircle(MovableCircle movableCircle){
        selectedCircle = movableCircle;
    }
    public void printInfo(){
        System.out.println("Map info:");
        System.out.println("-------------------------");
        int i = 1;
        for (MovableCircle circle : circles) {
            System.out.println(i + (getSelectedCircle() == circle ? "--" : ": ") + circle);
            i++;
        }
        System.out.println("-------------------------");
    }
    @Override
    public void moveUp() {
        selectedCircle.moveUp();
    }

    @Override
    public void moveDown() {
        selectedCircle.moveDown();
    }

    @Override
    public void moveLeft() {
        selectedCircle.moveLeft();
    }

    @Override
    public void moveRight() {
        selectedCircle.moveRight();
    }

    public ArrayList<MovableCircle> getCircles() {
        return circles;
    }

    public MovableCircle getSelectedCircle() {
        return selectedCircle;
    }
}