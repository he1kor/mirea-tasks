package Launcher;

import java.util.ArrayList;

public class ProgramTree {
    public static ArrayList<ArrayList<String>> get(){
        return programTree;
    }
    private static ArrayList<ArrayList<String>> programTree = new ArrayList<ArrayList<String>>() {
        {
            add (new ArrayList<>()
                 {
                     {
                         add("1");
                         add(".1");
                         add(".2");
                         add(".3");
                         add(".4");
                         add(".5");
                     }
                 }
            );
            add (new ArrayList<>()
                 {
                     {
                         add("2");
                         add(".1");
                         add(".2");
                     }
                 }
            );
        }
    };
}