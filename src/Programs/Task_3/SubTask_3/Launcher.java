package Programs.Task_3.SubTask_3;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "3.3";
    }

    @Override
    protected String getTechnicalTask() {
        return "Создать класс, описывающий книгу (Book). В классе должны быть описаны нужные свойства книги(автор, название, год написания и т. д.)и методы для получения, изменения этих свойств. Протестировать работу класса в классе BookTest, содержащим метод статический main(String[] args).";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
