package Programs.Task_8.SubTask_2;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import Launcher.Args;

public class PictureArg {
    private BufferedImage picture;
    public PictureArg(){
        System.out.println(getPathFromArg());
        try {
            picture = ImageIO.read(new File(getPathFromArg()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        resize(0.5);
    }
    public void resize(double multiplier){
        int newWidth = (int) Math.round(picture.getWidth()*multiplier);
        int newHeight = (int) Math.round(picture.getHeight()*multiplier);
        Image image = picture.getScaledInstance(newWidth,newHeight,BufferedImage.SCALE_AREA_AVERAGING);
        BufferedImage buffered = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        buffered.getGraphics().drawImage(image,0,0,null);
        picture = buffered;
    }
    public BufferedImage getPicture(){
        return picture;
    }
    public static String getPathFromArg(){
        String path = "";
        for (String word : Args.getArgs()){
            path += word + " ";
        }
        path = path.substring(0,path.length()-1);
        return path;
    }
}
