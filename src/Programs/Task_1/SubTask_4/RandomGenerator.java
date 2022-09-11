package Programs.Task_1.SubTask_4;

import java.util.ArrayList;
import java.util.Random;

public class RandomGenerator {
    public static int generateNumberWithMath(){
        return (int) Math.round(1000*Math.random());
    }
    public static int generateNumberWithRandom(){
        return (new Random()).nextInt(1000+1);
    }
    public static ArrayList<Integer> generateArrayWithMath(int size){
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++){
            array.add(generateNumberWithMath());
        }
        return array;
    }
    public static ArrayList<Integer> generateArrayWithRandom(int size){
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++){
            array.add(generateNumberWithRandom());
        }
        return array;
    }
}
