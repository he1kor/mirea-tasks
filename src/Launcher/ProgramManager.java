package Launcher;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class ProgramManager {

    Scanner scanner;
    String programKey;
    Class<?> programClass;
    public ProgramManager() {
        scanner = new Scanner(System.in);
    }
    public void outPrograms(){
        for (ArrayList<String> programBranch : ProgramTree.get()) {
            System.out.println(programBranch.get(0) + ":");
            for (int i = 1; i < programBranch.size(); i++){
                System.out.println("\t" + programBranch.get(0) + programBranch.get(i));
            }
        }
    }
    public void inputProgram(){
        System.out.println("Input program you want to run (or \"stop\" to exit program): ");
        String programNumber = scanner.nextLine();
        setProgram(programNumber);
    }
    private void setProgram(String programKey){
        this.programKey = programKey;
    }
    private boolean tryFindClass(ArrayList<String> programBranch,int subNumber){
        try {
            programClass = Class.forName("Programs.Task_" + programBranch.get(0) + ".SubTask_" + subNumber + ".Launcher");
            programClass.getDeclaredConstructor().newInstance();
            return true;

        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InstantiationException e) {
            return false;
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
    //launches program that was entered. If answer is "stop" then launch return true, else false.
    public boolean launch(){
        boolean isSuccessful = false;
        if (Objects.equals(programKey.toLowerCase(), "stop")){
            return true;
        }
        for (ArrayList<String> programBranch : ProgramTree.get()) {
            for (int subNumber = 1; subNumber < programBranch.size(); subNumber++){
                if (Objects.equals(programKey, programBranch.get(0) + programBranch.get(subNumber))) {
                    isSuccessful = tryFindClass(programBranch, subNumber);
                }
            }
        }
        if (!isSuccessful){
            printNotFoundException();
        }
        return false;
    }

    private void printNotFoundException(){
        System.out.println("Program wasn't found!");
    }
}
