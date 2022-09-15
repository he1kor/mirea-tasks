package Programs.Task_7.SubTask_2;

public class SubMain {
    public static void main(){
        System.out.println("Enter name of your dog: ");
        String name = Input.getString();
        System.out.println("Enter age of your dog: ");
        int age = Input.getInteger();
        System.out.println("Enter breed of your dog:\n1. German Shepherd.\n2. Schipperke.");
        int chose = Input.getIntInRange(1,2);
        Dog dog = null;
        switch (chose) {
            case 1:
                dog = new GermanShepherd(name,age);
                break;
            case 2:
                dog = new Schipperke(name,age);
        }
        Tester.test(dog);
    }
}
