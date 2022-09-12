package Programs.Task_3.SubTask_3;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    public static int getInt(){
        String input;

        while (true) {
            input = waitInput();
            try {
                int integerInput = Integer.parseInt(input);
                return integerInput;
            } catch (NumberFormatException e) {
                System.out.println("Not a number!");
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
