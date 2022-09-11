package Programs.Task_2.SubTask_2;

public class Dog {
    int age;
    String name;

    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString(){
        return "A dog called " + name + ", " + age + " years old - " + getHumanAge() + " in terms of human age;";
    }
    public int getHumanAge(){
        return age*7;
    }

    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
}
