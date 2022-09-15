package Programs.Task_7.SubTask_2;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "7.2";
    }

    @Override
    protected String getTechnicalTask() {
        return "Создать абстрактный класс, описывающий собак(Dog). С помощью наследования реализовать различные породы собак. Протестировать работу классов";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
