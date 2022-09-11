package Programs.Task_2.SubTask_2;

import java.util.ArrayList;

public class DogKennel {
    ArrayList<Dog> dogs;
    public DogKennel() {
        dogs = new ArrayList<>();
    }
    public void add(Dog dog){
        dogs.add(dog);
    }
    public Dog getDog(int index){
        return dogs.get(index);
    }
    public void print(){
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
