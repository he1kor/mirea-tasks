package Programs.Task_8.SubTask_1;

import Programs.Task_8.SubTask_1.Rectangle;

import java.awt.*;

public class Random {
    public static int getInRange(int from, int to){
        return (int) Math.round(Math.random()*(to-from)) + from;
    }
    public static Color getColor(){
        return new Color(getInRange(0,255),getInRange(0,255),getInRange(0,255));
    }
    public static Shape getShape(int minX, int minY, int maxX, int maxY, int minWidth, int minHeight, int maxWidth, int maxHeight){
        int amount = getInRange(1,2);
        switch (amount){
            case 1:
                return getRectangle(minX, minY, maxX, maxY, minWidth, minHeight, maxWidth, maxHeight);
            case 2:
                return getOval(minX, minY, maxX, maxY, minWidth, minHeight, maxWidth, maxHeight);
        }
        return null;
    }
    public static Rectangle getRectangle(int minX, int minY, int maxX, int maxY, int minWidth, int minHeight, int maxWidth, int maxHeight){
        ShapeRectType shapeRectType = getShapeRectType(minX, minY, maxX, maxY, minWidth, minHeight, maxWidth, maxHeight);
        return new Rectangle(shapeRectType.color,new Point(shapeRectType.x, shapeRectType.y), shapeRectType.width, shapeRectType.height);
    }
    public static Oval getOval(int minX, int minY, int maxX, int maxY, int minWidth, int minHeight, int maxWidth, int maxHeight){
        ShapeRectType shapeRectType = getShapeRectType(minX, minY, maxX, maxY, minWidth, minHeight, maxWidth, maxHeight);
        return new Oval(shapeRectType.color,new Point(shapeRectType.x, shapeRectType.y), shapeRectType.width, shapeRectType.height);
    }
    public static ShapeRectType getShapeRectType(int minX, int minY, int maxX, int maxY, int minWidth, int minHeight, int maxWidth, int maxHeight){
        int width = getInRange(minWidth,maxWidth);
        int height = getInRange(minHeight,maxHeight);
        maxX -= width;
        maxY -= height;
        int x = getInRange(minX,maxY);
        int y = getInRange(minY,maxY);
        Color color = getColor();
        return new ShapeRectType(x,y,color,width,height);
    }
}
