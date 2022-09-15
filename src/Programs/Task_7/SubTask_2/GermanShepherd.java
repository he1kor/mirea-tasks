package Programs.Task_7.SubTask_2;

public class GermanShepherd extends Dog{
    public GermanShepherd(String name, int age) {
        super(name, age);
    }

    public void bite(){
        System.out.println("*biting*");
    }

    @Override
    public void bark() {
        System.out.println("AWWW!!");
    }
}
