import Launcher.Args;
import Launcher.ProgramManager;
public class Main {
    public static String[] args;
    public static void main(String[] args){
        Args.set(args);
        ProgramManager programManager = new ProgramManager();
        programManager.outPrograms();
        while (true) {
            programManager.inputProgram();
            programManager.launch();
        }
    }

    public static String[] getArgs() {
        return args;
    }
}