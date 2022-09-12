package Programs.Task_4.SubTask_1;

import java.sql.SQLOutput;

public class SubMain {
    public static void main(){
        System.out.println("Enter radius of circle: ");
        double radius = Input.getDouble();
        System.out.println("Enter color of circle: ");
        String color = Input.getString();
        System.out.println("Enter true or false is filled color of circle: ");
        boolean filled = Input.getBoolean();
        Circle circle = new Circle(radius, color, filled);

        System.out.println("Enter width of rectangle: ");
        double width = Input.getDouble();
        System.out.println("Enter length of rectangle: ");
        double length = Input.getDouble();
        System.out.println("Enter color of rectangle: ");
        color = Input.getString();
        System.out.println("Enter true or false is filled color of rectangle: ");
        filled = Input.getBoolean();
        Rectangle rectangle = new Rectangle(width, length, color, filled);

        System.out.println("Enter side length of square: ");
        double side = Input.getDouble();
        System.out.println("Enter color of square: ");
        color = Input.getString();
        System.out.println("Enter true or false is filled color of square: ");
        filled = Input.getBoolean();
        Square square = new Square(side, color, filled);

        System.out.println("Circle: ");
        Tester.print(circle);

        System.out.println("Rectangle: ");
        Tester.print(rectangle);

        System.out.println("Square: ");
        Tester.print(square);
    }
}
