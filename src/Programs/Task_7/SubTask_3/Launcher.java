package Programs.Task_7.SubTask_3;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "7.3";
    }

    @Override
    protected String getTechnicalTask() {
        return "Создать абстрактный класс, описывающий мебель. С помощью наследования реализовать различные виды мебели. Также создать класс FurnitureShop, моделирующий магазин мебели";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
