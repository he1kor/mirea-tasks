package Programs.Task_1.SubTask_5;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger of(short iterations){
        if (iterations < 0) {
            return new BigInteger("-1");
        }
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= iterations; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
