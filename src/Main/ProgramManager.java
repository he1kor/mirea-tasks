package Main;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class ProgramManager {

    Scanner scanner;
    String programKey;
    Class<?> program_class;
    ArrayList<ArrayList<String>> programMatrix = new ArrayList<ArrayList<String>>() {
        {
            add (new ArrayList<>()
             {
                {
                    add("1");
                    add(".1");
                    add(".2 coming soon");
                    add(".3 coming soon");
                }
             }
            );
            add (new ArrayList<>()
                 {
                     {
                         add("2");
                         add(".1 coming soon");
                         add(".2 coming soon");
                         add(".3 coming soon");
                     }
                 }
            );
        }
    };
    public ProgramManager() {
        scanner = new Scanner(System.in);
    }
    public void outPrograms(){
        for (ArrayList<String> programBranch : programMatrix) {
            System.out.println(programBranch.get(0) + ":");
            for (int i = 1; i < programBranch.size(); i++){
                System.out.println("\t" + programBranch.get(0) + programBranch.get(i));
            }
        }
    }
    public void inputProgram(){
        System.out.println("Input program you want to run: ");
        String programNumber = scanner.nextLine();
        setProgram(programNumber);
    }
    private void setProgram(String programKey){
        this.programKey = programKey;
    }
    private boolean tryFindClass(ArrayList<String> programBranch,int subNumber){
        try {
            program_class = Class.forName("Programs.Task_" + programBranch.get(0) + ".SubTask_" + subNumber + ".Launcher");
            program_class.getDeclaredConstructor().newInstance();
            return true;

        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InstantiationException e) {
            return false;
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
    public void launch() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        boolean isSuccessful = false;
        for (ArrayList<String> programBranch : programMatrix) {
            for (int subNumber = 1; subNumber < programBranch.size(); subNumber++){
                if (Objects.equals(programKey, programBranch.get(0) + programBranch.get(subNumber))) {
                    isSuccessful = tryFindClass(programBranch, subNumber);
                }
            }
        }
        if (!isSuccessful){
            printNotFoundException();
        }
    }

    private void printNotFoundException(){
        System.out.println("Program wasn't found!");
    }
}
