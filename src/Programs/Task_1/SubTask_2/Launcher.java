package Programs.Task_1.SubTask_2;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "1.2";
    }
    @Override
    protected String getTechnicalTask() {
        return "Написать программу, в результате которой выводятся на экран аргументы командной строки в цикле for";
    }
    @Override
    protected void launch() {
        SubMain.main();
    }
}