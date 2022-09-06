package Programs.Task_1.SubTask_1;

public class Launcher {
    public Launcher(){
        System.out.println("\n-------------------------------------\nProgram 1.1 has started running!\n");
        printTechnicalTask();
        SubMain.main();
        System.out.println("\nProgram 1.1 has finished!\n-------------------------------------\n");
    }
    private void printTechnicalTask(){
        System.out.println("Technical task:");
        System.out.println("Написать программу, в результате которой считается сумма элементов целочисленного массива с помощью циклов for, while, do while, результат выводится на экран.\n");
    }
}
