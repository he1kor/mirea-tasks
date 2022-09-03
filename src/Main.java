import Main.ProgramManager;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ProgramManager programManager = new ProgramManager();
        programManager.outPrograms();
        while (true) {
            programManager.inputProgram();
            programManager.launch();
        }
    }
}