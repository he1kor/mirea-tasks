import Main.ProgramManager;
public class Main {
    public static void main(String[] args){
        ProgramManager programManager = new ProgramManager();
        programManager.outPrograms();
        while (true) {
            programManager.inputProgram();
            programManager.launch();
        }
    }
}