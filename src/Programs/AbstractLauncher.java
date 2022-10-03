package Programs;


public abstract class AbstractLauncher {
    abstract protected String getProgramNumber();
    abstract protected String getTechnicalTask();
    protected boolean isEnteredAfterTask = true;

    public AbstractLauncher(){
        System.out.println("\n-------------------------------------\nProgram " + getProgramNumber() + " has started running!\n");
        System.out.println("Technical task:");
        System.out.println(getTechnicalTask() + (isEnteredAfterTask ? "\n" : ""));
        launch();
        System.out.println("\nProgram " + getProgramNumber() + " has finished!\n-------------------------------------\n");
    }
    abstract protected void launch();
}
