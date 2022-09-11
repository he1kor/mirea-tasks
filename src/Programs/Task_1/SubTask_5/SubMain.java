package Programs.Task_1.SubTask_5;

import java.math.BigInteger;
import java.util.Scanner;

public class SubMain {
    public static void main(){
        System.out.println("Enter the short number whose factorial you want to get: ");
        short argument = Input.getShort();
        BigInteger factorial = Factorial.of(argument);
        System.out.println(factorial);
    }
}
