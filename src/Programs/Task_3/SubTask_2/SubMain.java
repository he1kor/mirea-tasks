package Programs.Task_3.SubTask_2;

public class SubMain {
    public static void main(){

        System.out.println("Type here length of left leg: ");
        double length = Input.getDouble();
        System.out.println("Type here weight of left leg: ");
        double weight = Input.getDouble();
        Leg leftLeg = new Leg(length,weight);

        System.out.println("Type here length of right leg: ");
        length = Input.getDouble();
        System.out.println("Type here weight of right leg: ");
        weight = Input.getDouble();
        Leg rightLeg = new Leg(length,weight);

        System.out.println("Type here length of left hand: ");
        length = Input.getDouble();
        System.out.println("Type here weight of left hand: ");
        weight = Input.getDouble();
        Hand leftHand = new Hand(length,weight);

        System.out.println("Type here length of right hand: ");
        length = Input.getDouble();
        System.out.println("Type here weight of right hand: ");
        weight = Input.getDouble();
        Hand rightHand = new Hand(length,weight);

        System.out.println("Type here radius of head: ");
        double radius = Input.getDouble();
        System.out.println("Type here weight of head: ");
        weight = Input.getDouble();
        Head head = new Head(radius,weight);

        Human human = new Human(leftLeg,rightLeg,leftHand,rightHand,head);
        Tester.printHuman(human);
    }
}
