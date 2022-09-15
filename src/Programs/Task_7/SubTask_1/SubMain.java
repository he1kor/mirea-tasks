package Programs.Task_7.SubTask_1;

public class SubMain {
    public static void main(){
        System.out.println("Enter here length of spoon (cm): ");
        int length = Input.getInteger();
        System.out.println("Enter here cleanness of spoon (%): ");
        int cleanness = Input.getInteger();
        Spoon spoon = new Spoon(length,cleanness);

        System.out.println("Enter here radius of plate (cm): ");
        int radius = Input.getInteger();
        System.out.println("Enter here cleanness of plate (%): ");
        cleanness = Input.getInteger();
        Plate plate = new Plate(radius,cleanness);

        Tester.test(spoon);
        Tester.test(plate);

        System.out.println("Enter food you want to put in plate: ");
        String food = Input.getString();
        plate.putFood(food);

        Tester.test(plate);

        System.out.println("Do you want to take food with spoon from plate? (true/false): ");
        if (Input.getBoolean()) spoon.takeFoodFrom(plate);

        Tester.test(spoon);

        System.out.println("Do you want to clear food from your spoon? (true/false): ");
        if (Input.getBoolean()) spoon.clearFood();

        Tester.test(spoon);

        System.out.println("Do you want to clear food from your plate? (true/false): ");
        if (Input.getBoolean()) plate.clearFood();

        Tester.test(plate);
        System.out.println("Do you want to clean your spoon? (true/false): ");
        if (Input.getBoolean()) spoon.clean();

        Tester.test(spoon);

        System.out.println("Do you want to clean your plate? (true/false): ");
        if (Input.getBoolean()) plate.clean();

        Tester.test(plate);
    }
}