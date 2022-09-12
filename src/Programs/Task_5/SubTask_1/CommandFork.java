package Programs.Task_5.SubTask_1;

public class CommandFork {
    Controller controller;
    public CommandFork(){
        controller = new Controller();
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
        controller.createCycle(x,y,xSpeed,ySpeed,radius);
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
        int size = controller.getCircles().size();
        System.out.println("Choose circle from 1 to " + size + ":");
        controller.printInfo();
        MovableCircle selectedCircle = controller.getCircles().get((Input.getIntInRange(1,size)-1));
        controller.selectCircle(selectedCircle);
    }
}
