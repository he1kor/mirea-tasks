package Programs.Task_1.SubTask_1;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber(){
        return "1.1";
    }
    @Override
    protected String getTechnicalTask() {
        return "Написать программу, в результате которой считается сумма элементов целочисленного массива с помощью циклов for, while, do while, результат выводится на экран.\n";
    }
    @Override
    protected void launch() {
        SubMain.main();
    }
}
