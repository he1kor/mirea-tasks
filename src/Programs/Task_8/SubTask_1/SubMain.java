package Programs.Task_8.SubTask_1;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static Programs.Task_8.SubTask_1.DrawRect.createAndShowGui;

public class SubMain {
    public static void main() {
        Window window = new Window();
        EventQueue.invokeLater(window);
        String answer = "";
        ArrayList<Shape> shapes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (!Objects.equals(answer, "stop")){
            shapes.add(getRandomRectangle(500,500,200,200));
            window.drawShapes(shapes);
            answer = scanner.nextLine();
        }
    }
    public static Rectangle getRandomRectangle(int MaxX, int MaxY, int MaxWidth, int MaxHeight){
        int x = (int) Math.round(MaxX*Math.random());
        int y = (int) Math.round(MaxY*Math.random());
        int width = (int) Math.round(MaxWidth*Math.random());
        int height = (int) Math.round(MaxHeight*Math.random());
        return new Rectangle(Color.RED,new Point(x,y),width,height);
    }
}
