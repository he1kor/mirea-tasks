package Programs.Task_3.SubTask_1;

public class SubMain {
    public static void main(){
        System.out.println("Enter radius of circle: ");
        int radius = Input.getInt();
        Circle circle = new Circle(radius);
        Tester.print(circle);
    }
}
