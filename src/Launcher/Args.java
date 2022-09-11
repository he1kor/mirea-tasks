package Launcher;

public class Args {
    private static String[] args;
    public static void set(String[] args){
        Args.args = args;
    }

    public static String[] getArgs() {
        return args;
    }
}
