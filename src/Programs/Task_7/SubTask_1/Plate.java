package Programs.Task_7.SubTask_1;

import java.util.Objects;

public class Plate extends Dish{
    private int radiusCM;
    private String food;

    public Plate(int radiusCM, int cleanness){
        super(cleanness);
        this.radiusCM = radiusCM;
        food = "";
    }
    public Plate(int radiusCM, int cleanness, String food){
        super(cleanness);
        this.radiusCM = radiusCM;
        this.food = food;
    }
    public int getRadiusCM(){
        return radiusCM;
    }
    public String getFood(){
        return food;
    }
    public void putFood(String food){
        this.food = food;
    }
    public void clearFood(){
        food = "";
        cleanness -= 50;
    }
    @Override
    public String toString() {
        return "Plate, " + radiusCM + " cm radius, cleared by " + cleanness + "% " + (Objects.equals(food, "") ? "without any food inside" : "with " + food + " inside");
    }
}