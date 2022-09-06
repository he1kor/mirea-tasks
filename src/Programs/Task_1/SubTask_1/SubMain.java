package Programs.Task_1.SubTask_1;

import java.util.ArrayList;
public class SubMain {
    public static void main(){
        ArrayList<Integer> array = new ArrayList();
        Input.arrayValues(array);
        long result = Sum.ofValues(array);
        System.out.println("Result: " + result);
    }
}
