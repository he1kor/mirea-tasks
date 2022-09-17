package Programs.Task_7.SubTask_3;

public class Chair extends Furniture{
    public Chair(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Table | " + getPrice() + "$ | " + id + " ID";
    }
}
