package Programs.Task_6.SubTask_1;

import Programs.Task_6.SubTask_1.Command;
import Programs.Task_6.SubTask_1.CommandFork;
import Programs.Task_6.SubTask_1.Input;

public class SubMain {
    public static void main(){
        Command command;
        CommandFork commandFork = new CommandFork();
        boolean stopped = false;

        System.out.println("Enter command:\nCreate\nStop");
        command = Input.getActionCommand(false);
        stopped = commandFork.doActionCommand(command);

        while (!stopped) {
            commandFork.printControllerInfo();
            System.out.println("Enter command:\nCreate\nMove\nSelect\nStop");
            command = Input.getActionCommand(true);
            stopped = commandFork.doActionCommand(command);
        }
    }
}
