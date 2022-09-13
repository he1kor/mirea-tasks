package Programs.Task_6.SubTask_1;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "6.1";
    }

    @Override
    protected String getTechnicalTask() {
        return "2.Добавьте в проект ранее разработанный класс прямоугольник (Rectangle). На основе него напишите новый класс MovableRectangle (движущийся прямоугольник). Ваш класс должен реализовывать интерфейс Movable";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
