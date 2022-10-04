package Programs.Task_8.SubTask_3;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "8.3";
    }

    @Override
    protected String getTechnicalTask() {
        return "Создать окно, реализовать анимацию, с помощью картинки, состоящей из нескольких кадров";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
