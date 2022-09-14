package Programs.Task_6.SubTask_2;

public class SubMain {
    public static void main(){
        Command command;
        CommandController commandFork = new CommandController();
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
