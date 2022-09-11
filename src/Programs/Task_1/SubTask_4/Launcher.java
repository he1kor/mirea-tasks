package Programs.Task_1.SubTask_4;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "1.4";
    }

    @Override
    protected String getTechnicalTask() {
        return "Написать программу, в результате которой генерируется массив целых чисел случайным образом, вывести его на экран, отсортировать его, и снова вывести на экран (использовать два подхода к генерации случайных чисел – метод random() класса Math и класс Random).";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
