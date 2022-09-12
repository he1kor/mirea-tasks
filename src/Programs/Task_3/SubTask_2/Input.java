package Programs.Task_3.SubTask_2;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    public static double getDouble(){
        String input;

        while (true) {
            input = waitInput();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Not a number!");
            }
        }
    }
    private static String waitInput(){
        return scanner.nextLine();
    }
}
