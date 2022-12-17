package Programs.Task_16.SubTask_1;

import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Input {

    protected static final String NO_QUESTION = "-1";
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
        if (!Objects.equals(question, NO_QUESTION)) System.out.println(question);
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
                question = NO_QUESTION;
            }
        }
        return answer;
    }
    public static int getPositiveInt(String question){
        return getPositiveInt(question,"Your answer is not positive integer number!");
    }
    public static int[] getInts(String question,String errorMassage) {
        String answer;
        if (!Objects.equals(question, NO_QUESTION)) System.out.println(question);
        while (true) {
            answer = getString();
            if (isIntArray(answer)){
                return toIntArray(answer);
            } else {
                System.out.println(errorMassage);
            }
        }
    }
    private static int[] toIntArray(String string) {
        char[] chars = string.toCharArray();
        ArrayList<String> words = new ArrayList<>();
        int currentWordIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' '){
                words.add(string.substring(currentWordIndex,i));
                currentWordIndex = i + 1;
                continue;
            }
            if (i == chars.length-1){
                words.add(string.substring(currentWordIndex,chars.length));
            }
        }

        int[] intArray = new int[words.size()];

        for (int i = 0; i < words.size(); i++) {
            try {
                intArray[i] = Integer.parseInt(words.get(i));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(words.get(i) + " is not integer.");
            }
        }
        return intArray;
    }

    private static boolean isIntArray(String string){
        char[] chars = string.toCharArray();
        ArrayList<String> words = new ArrayList<>();
        int currentWordIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' '){
                words.add(string.substring(currentWordIndex,i));
                currentWordIndex = i + 1;
                continue;
            }
            if (i == chars.length-1){
                words.add(string.substring(currentWordIndex,chars.length));
            }
        }

        for (String word : words) {
            try {
                Integer.parseInt(word);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
    public static int[] getInts(String question,String errorMessage,int size){
        int[] answer = getInts(question,errorMessage);
        while (true){
            if (answer.length == size) return answer;
            System.out.println(errorMessage);
            answer = getInts("-1",errorMessage);
        }
    }
}
