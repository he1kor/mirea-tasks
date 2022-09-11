package Programs.Task_3.SubTask_1;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "3.1";
    }

    @Override
    protected String getTechnicalTask() {
        return "Создать класс, описывающий модель окружности (Circle). В классе должны быть описаны нужные свойства окружности и методы для получения, изменения этих свойств. Протестировать работу класса в классе CircleTest, содержащим метод статический main(String[] args).";
     }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
