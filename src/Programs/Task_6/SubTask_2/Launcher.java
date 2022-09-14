package Programs.Task_6.SubTask_2;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "6.1";
    }

    @Override
    protected String getTechnicalTask() {
        return "Прямоугольник можно также представить как две движущиеся точки MovablePoints (представляющих верхняя левая и нижняя правая точки) и реализующие интерфейс Movable";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
