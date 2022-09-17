package Programs.Task_7.SubTask_3;

public class Taburetochka extends Furniture{
    public Taburetochka(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Taburetochka | " + getPrice() + "$ | " + id + " ID";
    }
}
