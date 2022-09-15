package Programs.Task_7.SubTask_1;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    public static int getInteger(){
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
    public static Boolean getBoolean(){
        String input;

        while (true) {
            input = waitInput();
            if (input.toLowerCase().equals("true")) {
                return true;
            } else if (input.toLowerCase().equals("false")){
                return false;
            } else {
                System.out.println("Not a boolean!");
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
