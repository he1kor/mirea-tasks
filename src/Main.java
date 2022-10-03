import Launcher.Args;
import Launcher.ProgramManager;
public class Main {
    private static boolean isEnded;

    public static void main(String[] args){
        Args.set(args);
        ProgramManager programManager = new ProgramManager();
        programManager.outPrograms();
        while (!isEnded) {
            programManager.inputProgram();
            isEnded = programManager.launch();
        }
    }
}