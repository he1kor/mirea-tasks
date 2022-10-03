package Programs.Task_8.SubTask_1;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "8.1";
    }

    @Override
    protected String getTechnicalTask() {
        isEnteredAfterTask = false;
        return "Создать окно, нарисовать в нем 20 случайных фигур, случайного цвета. Классы фигур должны наследоваться от абстрактного класса Shape, в котором описаны свойства фигуры: цвет, позиция.";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
