package Programs.Task_8.SubTask_3;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class Window implements Runnable{
    private FrameDividedPicture animation;
    String path;
    private ImageIcon icon;
    private JFrame frame;

    public Window(File file, int numberOfFrames, boolean isHorizontal){
        animation = new FrameDividedPicture(file,numberOfFrames,isHorizontal);
        path = file.getPath();
    }
    @Override
    public void run() {
        frame = new JFrame(path);
        icon = new ImageIcon(animation.nextFrame());
        JLabel pictureLabel = new JLabel(icon);
        frame.add(pictureLabel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                SubMain.onClosed();
            }
        });
    }

    public void nextFrame() {
        icon.setImage(animation.nextFrame());
        frame.repaint();
    }
}
