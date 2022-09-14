package Programs.Task_6.SubTask_2;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    public static int getInt(){
        String input;

        while (true) {
            input = waitInput();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Not a number!");
            }
        }
    }
    public static int getIntInRange(int from,int to){
        String input;

        while (true) {
            input = waitInput();
            try {
                int result = Integer.parseInt(input);
                if (from <= result && result <= to){
                    return result;
                } else {
                    System.out.println("Not in the range!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Not a number!");
            }
        }
    }
    public static Command getMovementCommand(){
        String input;

        while (true) {
            input = waitInput();
            if (input.toLowerCase().equals("a")) {
                return new Command().moveLeft();

            } if (input.toLowerCase().equals("w")) {
                return new Command().moveUp();

            } if (input.toLowerCase().equals("d")) {
                return new Command().moveRight();

            } if (input.toLowerCase().equals("s")) {
                return new Command().moveDown();
            } else {
                System.out.println("Not a command!");
            }
        }
    }
    public static Command getCreatingCommand(){
        String input;

        while (true) {
            input = waitInput();
            if (input.toLowerCase().equals("circle")) {
                return new Command().createCircle();

            } if (input.toLowerCase().equals("rectangle")) {
                return new Command().createRectangle();

            } else {
                System.out.println("Not a command!");
            }
        }
    }
    public static Command getActionCommand(boolean isThereObjectToAct){
        String input;

        while (true) {
            input = waitInput();
            if (input.toLowerCase().equals("create")){
                return new Command().create();
            }
            if (input.toLowerCase().equals("select") && isThereObjectToAct){
                return new Command().select();
            }
            if (input.toLowerCase().equals("move") && isThereObjectToAct){
                return new Command().move();
            }
            if (input.toLowerCase().equals("stop")){
                return new Command().stop();
            }
            else {
                System.out.println("Not a command!");
            }
        }
    }
    public static String getString(){
        return waitInput();
    }
    private static String waitInput(){
        return scanner.nextLine();
    }
}