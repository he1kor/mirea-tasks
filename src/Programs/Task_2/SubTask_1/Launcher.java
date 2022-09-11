package Programs.Task_2.SubTask_1;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {

    @Override
    protected String getProgramNumber() {
        return "2.1";
    }

    @Override
    protected String getTechnicalTask() {
        return "Необходимо реализовать простейший класс Shape (Фигура) на языке программирования Java. Добавить метод toString(). Создать класс-тестер для вывода информации об объекте. Реализуйте простейший класс «Мяч». Реализуйте простейший класс «Книга»";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
