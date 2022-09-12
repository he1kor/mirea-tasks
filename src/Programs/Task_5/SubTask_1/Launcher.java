package Programs.Task_5.SubTask_1;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {

    @Override
    protected String getProgramNumber() {
        return "5.1";
    }

    @Override
    protected String getTechnicalTask() {
        return "Вам нужно написать два класса MovablePoint и MovableCircle - которые реализуют интерфейс Movable на основе классов, разработанных в практической работе № 4. Изучите UML диаграмму и представьте реализацию класса";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
