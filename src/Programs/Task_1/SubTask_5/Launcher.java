package Programs.Task_1.SubTask_5;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {

    @Override
    protected String getProgramNumber() {
        return "1.5";
    }

    @Override
    protected String getTechnicalTask() {
        return "Написать программу, которая с помощью метода, вычисляет факториал числа (использовать управляющую конструкцию цикла), проверить работу метода.";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
