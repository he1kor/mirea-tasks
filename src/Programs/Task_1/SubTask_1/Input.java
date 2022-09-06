package Programs.Task_1.SubTask_1;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    public static void arrayValues(List<Integer> array){
        String inputElement;
        System.out.println("Input elements (if you're about end enter STOP): ");

        while (true) {
            inputElement = waitInput();
            if (Objects.equals(inputElement, "STOP")) {
                break;
            }
            try {
                array.add(Integer.valueOf(inputElement));
            } catch (NumberFormatException e) {
                System.out.println("Not a number!");
            }
        }
    }
    private static String waitInput(){
        return scanner.nextLine();
    }
}
