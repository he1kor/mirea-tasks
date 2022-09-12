package Programs.Task_3.SubTask_3;

public class SubMain {
    public static void main(){
        System.out.println("Enter author of book: ");
        String author = Input.getString();
        System.out.println("Enter name of book: ");
        String name = Input.getString();
        System.out.println("Enter year of book: ");
        int year = Input.getInt();

        Book book = new Book(author,name,year);
        BookTester.print(book);
    }
}