package Programs.Task_6.SubTask_1;

public class CommandController {
    MapController controller;
    public CommandController(){
        controller = new MapController();
    }
    public boolean doActionCommand(Command command){
        if (command.is("Create")){
            doCreatingCommand();
        } else if (command.is("Move")){
            doMovementCommand();
        } else if (command.is("Select")){
            doSelectingCommand();
        } else return command.is("Stop");
        return false;
    }
    public void printControllerInfo(){
        controller.printInfo();
    }
    public void doCreatingCommand(){
        System.out.println("Enter shape:\nCircle\nRectangle");
        Command command = Input.getCreatingCommand();

        if (command.is("CreateCircle")){
            doCreatingCycleCommand();
        } else if (command.is("CreateRectangle")){
            doCreatingRectangleCommand();
        } else throw new RuntimeException("Unknown command");
    }
    public void doCreatingCycleCommand(){
        System.out.println("Enter x value of circle center: ");
        int x = Input.getInt();
        System.out.println("Enter y value of circle center: ");
        int y = Input.getInt();
        System.out.println("Enter x speed value of circle: ");
        int xSpeed = Input.getInt();
        System.out.println("Enter y speed value of circle: ");
        int ySpeed = Input.getInt();
        System.out.println("Enter radius value of circle: ");
        int radius = Input.getInt();
        controller.createShape(new MovableCircle(x,y,xSpeed,ySpeed,radius));
    }
    public void doCreatingRectangleCommand(){
        System.out.println("Enter x value of rectangle center: ");
        int x = Input.getInt();
        System.out.println("Enter y value of rectangle center: ");
        int y = Input.getInt();
        System.out.println("Enter x speed value of rectangle: ");
        int xSpeed = Input.getInt();
        System.out.println("Enter y speed value of rectangle: ");
        int ySpeed = Input.getInt();
        System.out.println("Enter width value of rectangle: ");
        int width = Input.getInt();
        System.out.println("Enter length value of rectangle: ");
        int length = Input.getInt();
        controller.createShape(new MovableRectangle(x,y,xSpeed,ySpeed,width,length));
    }
    public void doMovementCommand(){
        System.out.println("Type one of wasd arrows to move: ");
        Command command = Input.getMovementCommand();
        if (command.is("MoveLeft")){
            controller.moveLeft();
        } else if (command.is("MoveUp")){
            controller.moveUp();
        } else if (command.is("MoveRight")){
            controller.moveRight();
        } else if (command.is("MoveDown")){
            controller.moveDown();
        }
    }
    public void doSelectingCommand(){
        int size = controller.getShapes().size();
        System.out.println("Choose object from 1 to " + size + ":");
        controller.printInfo();
        MovableShape selectedShape = controller.getShapes().get((Input.getIntInRange(1,size)-1));
        controller.selectShape(selectedShape);
    }
}
