package Programs.Task_8.SubTask_3;

import jdk.nashorn.api.tree.GotoTree;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);
    public static String getString(){
        return scanner.nextLine();
    }
    public static boolean getBoolean(String question){
        String answer;
        System.out.println(question + " (enter \"true\" or \"false\")");
        while (true) {
            answer = scanner.nextLine();
            if (answer.toLowerCase().equals("true")){
                return true;
            } else if (answer.toLowerCase().equals("false")){
                return false;
            } else {
                System.out.println("Your answer is not \"true\" or \"false\"!");
            }
        }
    }
    public static File getFile(String question, String errorMessage){
        File file;
        while (true) {
            System.out.println(question);
            file = new File(getString());
            if (!file.isDirectory() && file.exists()) {
                break;
            } else {
                System.out.println(errorMessage);
            }
        }
        return file;
    }
    public static File getFile(String question){
        return getFile(question,"Your answer is not file path!");
    }

    public static int getInt(String question,String errorMassage) {
        int answer;
        System.out.println(question);
        while (true) {
            try {
                answer = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(errorMassage);
            }
        }
        return answer;
    }
    public static int getInt(String question){
        return getInt(question,"Your answer is not integer number!");
    }
    public static int getPositiveInt(String question,String mistakeMessage){
        int answer;
        while (true){
            answer = getInt(question,mistakeMessage);
            if (answer > 0){
                break;
            } else {
                System.out.println(mistakeMessage);
            }
        }
        return answer;
    }
    public static int getPositiveInt(String question){
        return getPositiveInt(question,"Your answer is not positive integer number!");
    }
}
