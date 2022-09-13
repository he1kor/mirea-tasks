package Programs.Task_6.SubTask_1;


import Programs.Task_4.SubTask_1.Shape;

import java.util.ArrayList;

public class Controller implements Movable {

    private ArrayList<MovableShape> shapes;
    private MovableShape selectedShape;

    public Controller (){
        shapes = new ArrayList<>();
    }
    public void createShape(MovableShape shape){
        shapes.add(shape);
        if (shapes.size() == 1){
            selectShape(shapes.get(0));
        }
    }

    public void selectShape(MovableShape shape){
        selectedShape = shape;
    }
    public void printInfo(){
        System.out.println("Map info:");
        System.out.println("-------------------------");
        int i = 1;
        for (MovableShape shape : shapes) {
            System.out.println(i + (getSelectedShape() == shape ? "--" : "  ") + shape);
            i++;
        }
        System.out.println("-------------------------");
    }
    @Override
    public void moveUp() {
        selectedShape.moveUp();
    }

    @Override
    public void moveDown() {
        selectedShape.moveDown();
    }

    @Override
    public void moveLeft() {
        selectedShape.moveLeft();
    }

    @Override
    public void moveRight() {
        selectedShape.moveRight();
    }

    public ArrayList<MovableShape> getShapes() {
        return shapes;
    }

    public MovableShape getSelectedShape() {
        return selectedShape;
    }

}