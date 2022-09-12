package Programs.Task_3.SubTask_2;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {

    @Override
    protected String getProgramNumber() {
        return "3.2";
    }

    @Override
    protected String getTechnicalTask() {
        return "Создать класс, описывающий тело человека(Human). Для описания каждой части тела создать отдельные классы(Head, Leg, Hand). Описать необходимые свойства и методы для каждого класса. Протестировать работу класса Human.";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
