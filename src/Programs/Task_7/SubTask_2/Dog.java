package Programs.Task_7.SubTask_2;

public abstract class Dog {
    String name;
    int age;
    public abstract void bark();
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
}