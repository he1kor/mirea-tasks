package Programs.Task_7.SubTask_2;

public class Tester {
    public static void test(Dog dog){
        dog.bark();
        if (dog instanceof Schipperke){
            ((Schipperke) dog).ask();
        } else if (dog instanceof GermanShepherd){
            ((GermanShepherd) dog).bite();
        }
    }
}
