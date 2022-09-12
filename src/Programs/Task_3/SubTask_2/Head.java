package Programs.Task_3.SubTask_2;

public class Head {
    private double radius;
    private double weight;
    public Head(double length, double weight){
        this.radius = length;
        this.weight = weight;
    }

    public double getRadius() {
        return radius;
    }

    public double getWeight() {
        return weight;
    }

    public void setLength(double length) {
        this.radius = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
