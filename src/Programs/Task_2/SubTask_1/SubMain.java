package Programs.Task_2.SubTask_1;

public class SubMain {
    public static void main(){

        Shape shape = new Shape();
        Ball ball = new Ball();
        Book book = new Book();

        Tester tester = new Tester();

        tester.test(shape);
        tester.test(ball);
        tester.test(book);
    }
}
