package Programs.Task_1.SubTask_2;
import Launcher.Args;
public class SubMain {
    public static void main(){
        String[] args = Args.getArgs();
        for (String arg: args) {
            System.out.println(arg);
        }
    }
}
