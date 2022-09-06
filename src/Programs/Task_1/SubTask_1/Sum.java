package Programs.Task_1.SubTask_1;

import java.util.List;

public class Sum {
    public static long ofValues(List<Integer> array){
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}
