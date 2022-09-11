package Programs.Task_2.SubTask_2;

import java.util.Objects;

public class SubMain {
    public static void main(){
        int age;
        String name;
        DogKennel dogKennel = new DogKennel();
        System.out.println("If you wanna end just enter -1 at any question");
        while (true){
            age = askAge();
            if (age == -1) break;
            name = askName();
            if (Objects.equals(name, "-1")) break;
            dogKennel.add(new Dog(age,name));
            System.out.println("All dogs of kennel:");
            dogKennel.print();
        }
    }
    private static int askAge(){
        System.out.println("How old is your dog?");
        return Input.getInt();
    }
    private static String askName(){
        System.out.println("What's your dog's name?");
        return Input.getString();
    }
}