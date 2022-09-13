package Programs.Task_6.SubTask_1;

import java.util.Objects;

public class Command{
    String command;
    public Command(String command){
        setCommand(command);
    }
    public Command(){
        setCommand("UnknownCommand");
    }
    private void setCommand(String command){
        switch (command) {
            case "MoveLeft":
            case "MoveUp":
            case "MoveRight":
            case "MoveDown":
            case "Create":
            case "CreateCircle":
            case "CreateRectangle":
            case "Select":
            case "Stop":
                this.command = command;
                break;
            default:
                this.command = "UnknownCommand";
        }
    }
    @Override
    public String toString(){
        return command;
    }
    public boolean is(String command){
        return (Objects.equals(this.command, command));
    }
    public Command moveUp() {
        command = "MoveUp";
        return this;
    }

    public Command moveDown() {
        command = "MoveDown";
        return this;
    }

    public Command moveLeft() {
        command = "MoveLeft";
        return this;
    }

    public Command moveRight() {
        command = "MoveRight";
        return this;
    }
    public Command createCircle() {
        command = "CreateCircle";
        return this;
    }
    public Command createRectangle() {
        command = "CreateRectangle";
        return this;
    }
    public Command create(){
        command = "Create";
        return this;
    }
    public Command select(){
        command = "Select";
        return this;
    }
    public Command move(){
        command = "Move";
        return this;
    }
    public Command stop(){
        command = "Stop";
        return this;
    }
}
