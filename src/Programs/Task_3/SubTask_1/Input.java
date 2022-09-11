package Programs.Task_3.SubTask_1;

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
    private static String waitInput(){
        return scanner.nextLine();
    }
}
