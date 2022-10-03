package Programs.Task_8.SubTask_2;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window implements Runnable {
    public Window(){
    }
    @Override
    public void run() {
        JFrame frame = new JFrame(PictureArg.getPathFromArg());
        PictureArg myPicture = new PictureArg();
        JLabel pictureLabel = new JLabel(new ImageIcon(myPicture.getPicture()));

        frame.add(pictureLabel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        frame.addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                SubMain.onWindowClosed();
            }
        });

        frame.pack();
    }
}
