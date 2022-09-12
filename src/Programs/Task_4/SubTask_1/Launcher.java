package Programs.Task_4.SubTask_1;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {

    @Override
    protected String getProgramNumber() {
        return "4.1";
    }

    @Override
    protected String getTechnicalTask() {
        return "Перепишите суперкласс Shape и его подклассы так как это представлено на UML диаграмме Circle, Rectangle and Square";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
