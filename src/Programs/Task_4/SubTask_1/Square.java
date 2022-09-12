package Programs.Task_4.SubTask_1;

public class Square extends Rectangle{
    public Square(){
        super(1.0,1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public void setSide(double side){
        setWidth(side);
    }
    public double getSide(){
        return width;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square, side - " + width + ", " + color + " color, " + (filled ? "" : "not ") + "filled";
    }
}
