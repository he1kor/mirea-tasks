package Programs.Task_7.SubTask_1;

public abstract class Dish {
    protected int cleanness;
    protected String material;

    public Dish(){
        cleanness = 100;
    }
    public abstract String toString();
    public Dish(int cleanness){
        this.cleanness = Math.min(100,cleanness);
    }
    public void clean() {
        cleanness = 100;
    }
    public void dirty() {
        cleanness = 0;
    }

    public int getCleanness() {
        return cleanness;
    }

    public String getMaterial() {
        return material;
    }
}
