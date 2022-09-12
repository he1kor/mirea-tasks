package Programs.Task_3.SubTask_2;

public class Tester {
    public static void printHuman(Human human){
        System.out.println(
                "Head weight: " + human.getHead().getWeight() + "; Head radius: " + human.getHead().getRadius() +
                "\nLeft hand weight: " + human.getLeftHand().getWeight() + "; Left hand length: " + human.getLeftHand().getLength() +
                "\nRight hand weight: " + human.getRightHand().getWeight() + "; Right hand length: " + human.getRightHand().getLength() +
                "\nLeft leg weight: " + human.getLeftLeg().getWeight() + "; Left leg length: " + human.getLeftLeg().getLength() +
                "\nRight leg: " + human.getRightLeg().getWeight() + "; Right leg length: " + human.getRightLeg().getLength()
        );
    }
}
