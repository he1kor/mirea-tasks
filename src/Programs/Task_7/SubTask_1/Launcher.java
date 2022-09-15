package Programs.Task_7.SubTask_1;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "7.1";
    }

    @Override
    protected String getTechnicalTask() {
        return "Создать абстрактный класс, описывающий посуду(Dish). С помощью наследования реализовать различные виды посуды, имеющие свои свойства и методы. Протестировать работу классов";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
