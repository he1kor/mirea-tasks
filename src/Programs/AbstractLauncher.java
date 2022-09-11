package Programs;


public abstract class AbstractLauncher {
    abstract protected String getProgramNumber();
    abstract protected String getTechnicalTask();

    public AbstractLauncher(){
        System.out.println("\n-------------------------------------\nProgram " + getProgramNumber() + " has started running!\n");
        System.out.println("Technical task:");
        System.out.println(getTechnicalTask() + "\n");
        launch();
        System.out.println("\nProgram " + getProgramNumber() + " has finished!\n-------------------------------------\n");
    }
    abstract protected void launch();
}
