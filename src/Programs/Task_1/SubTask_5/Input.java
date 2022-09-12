package Programs.Task_1.SubTask_5;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    public static short getShort(){
        String input;

        while (true) {
            input = waitInput();
            try {
                return Short.parseShort(input);
            } catch (NumberFormatException e) {
                System.out.println("Not a number!");
            }
        }
    }
    private static String waitInput(){
        return scanner.nextLine();
    }
}
