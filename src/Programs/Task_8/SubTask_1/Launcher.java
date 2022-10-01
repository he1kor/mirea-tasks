package Programs.Task_8.SubTask_1;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "8.1";
    }

    @Override
    protected String getTechnicalTask() {
        return null;
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
