package Programs.Task_8.SubTask_3;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FrameDividedPicture {
    private BufferedImage picture;
    private int currentFrame;
    private final boolean isHorizontal;
    private final int frameLength;
    private final int numberOfFrames;

    public FrameDividedPicture(File file, int numberOfFrames,boolean isHorizontal){
        currentFrame = 0;
        this.numberOfFrames = numberOfFrames;
        this.isHorizontal = isHorizontal;
        try {
            picture = ImageIO.read(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        resize(1000.0 / picture.getWidth());
        frameLength = isHorizontal ? picture.getWidth()/numberOfFrames : picture.getHeight()/numberOfFrames;
    }
    private void resize(double multiplier){
        int newWidth = (int) Math.round(picture.getWidth()*multiplier);
        int newHeight = (int) Math.round(picture.getHeight()*multiplier);
        Image image = picture.getScaledInstance(newWidth,newHeight,BufferedImage.SCALE_AREA_AVERAGING);
        BufferedImage buffered = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        buffered.getGraphics().drawImage(image,0,0,null);
        picture = buffered;
    }
    public BufferedImage nextFrame(){
        BufferedImage frame;
        if (isHorizontal) {
            frame = picture.getSubimage(currentFrame * frameLength,0,frameLength,picture.getHeight());
        } else {
            frame = picture.getSubimage(0,currentFrame * frameLength,picture.getWidth(),frameLength);
        }
        currentFrame++;
        if (currentFrame >= numberOfFrames){
            currentFrame = 0;
        }
        return frame;
    }
}
