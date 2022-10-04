package Programs.Task_9.SubTask_1;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "9.1";
    }

    @Override
    protected String getTechnicalTask() {
        isEnteredAfterTask = false;
        return "В задание из практической работы №8 добавить кнопку, в результате обработки нажатия события нажатия на которую, генерируются случайным образом различные фигуры из задания на эту практическую работу";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
