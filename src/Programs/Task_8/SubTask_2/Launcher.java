package Programs.Task_8.SubTask_2;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "8.2";
    }

    @Override
    protected String getTechnicalTask() {
        return "Создать окно, отобразить в нем картинку, путь к которой указан в аргументах командной строки.";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
