package Programs.Task_1.SubTask_3;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "1.3";
    }

    @Override
    protected String getTechnicalTask() {
        return "Написать программу, в результате работы которой выводятся  на экран первые 10 чисел гармонического ряда (форматировать вывод).";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
