package Programs.Task_7.SubTask_1;

public class Spoon extends Dish{
    private int lengthCM;
    private String food;
    public Spoon(int lengthCM, int cleanness){
        super(cleanness);
        this.lengthCM = lengthCM;
        food = "";
    }
    public int getLengthCM(){
        return lengthCM;
    }
    public void takeFoodFrom(Plate plate){
        food = plate.getFood();
    }
    public void clearFood(){
        food = "";
        cleanness -= 20;
    }

    @Override
    public String toString() {
        return "Spoon, " + lengthCM + " cm length, cleared by " + cleanness + "% " + (food == "" ? "without any food inside" : "with " + food + " inside");
    }
}
