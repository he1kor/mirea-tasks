package Programs.Task_4.SubTask_1;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    public static double getDouble(){
        String input;

        while (true) {
            input = waitInput();
            try {
                double doubleInput = Double.parseDouble(input);
                return doubleInput;
            } catch (NumberFormatException e) {
                System.out.println("Not a number!");
            }
        }
    }
    public static String getString(){
        return waitInput();
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
    private static String waitInput(){
        return scanner.nextLine();
    }
}