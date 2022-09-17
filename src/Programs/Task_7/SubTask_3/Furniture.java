package Programs.Task_7.SubTask_3;

public abstract class Furniture {
    public Furniture(int price){
        this.price = price;
        id = lastId;
        lastId++;
    }
    private int price;
    private double weight;
    private static int lastId;
    public static void setLastId(int lastId){
        Furniture.lastId = lastId;
    }
    protected int id;


    public double getWeight() {
        return weight;
    }

    public double getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract String toString();
}
