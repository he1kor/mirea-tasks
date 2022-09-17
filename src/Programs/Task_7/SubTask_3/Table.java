package Programs.Task_7.SubTask_3;

public class Table extends Furniture{

    public Table(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Table | " + getPrice() + "$ | " + id + " ID";
    }
}
