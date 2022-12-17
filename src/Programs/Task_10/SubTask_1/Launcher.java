package Programs.Task_10.SubTask_1;

import Programs.AbstractLauncher;

public class Launcher extends AbstractLauncher {
    @Override
    protected String getProgramNumber() {
        return "10.1";
    }

    @Override
    protected String getTechnicalTask() {
        return "Треугольная последовательность. Дана монотонная последовательность, в которой каждое натуральное число k встречается ровно k раз: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4,… По данному натуральному n выведите первые n членов этой последовательности. Попробуйте обойтись только одним циклом for. \n";
    }

    @Override
    protected void launch() {
        SubMain.main();
    }
}
