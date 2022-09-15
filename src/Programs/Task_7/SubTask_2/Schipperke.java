package Programs.Task_7.SubTask_2;

public class Schipperke extends Dog{
    public Schipperke(String name, int age) {
        super(name, age);
    }
    public void ask(){
        System.out.println("*asking*");
    }
    @Override
    public void bark() {
        System.out.println("aw :3");
    }
}