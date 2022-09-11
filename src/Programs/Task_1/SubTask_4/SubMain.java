package Programs.Task_1.SubTask_4;

import java.util.ArrayList;
import java.util.Collections;

public class SubMain {
    public static void main(){
        ArrayList<Integer> array;
        System.out.println("Random numbers array using Math.random:");
        array = RandomGenerator.generateArrayWithMath(3000);
        printArray(array);

        System.out.println("\n\nSorted:");
        Collections.sort(array);
        printArray(array);

        array.clear();

        System.out.println("\n\nRandom numbers array using Random:");
        array = RandomGenerator.generateArrayWithRandom(3000);
        printArray(array);

        System.out.println("\n\nSorted:");
        Collections.sort(array);
        printArray(array);
        System.out.println();
    }
    static void printArray(ArrayList<Integer> array){
        for (int i = 0; i < array.size(); i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(array.get(i));
        }
    }
}
