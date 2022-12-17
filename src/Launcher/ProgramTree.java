package Launcher;

import java.util.ArrayList;

public class ProgramTree {
    public static ArrayList<ArrayList<String>> get(){
        return programTree;
    }
    private static final ArrayList<ArrayList<String>> programTree = new ArrayList<ArrayList<String>>() {
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
            add (new ArrayList<>()
                 {
                     {
                         add("3");
                         add(".1");
                         add(".2");
                         add(".3");
                     }
                 }
            );
            add (new ArrayList<>()
                 {
                     {
                         add("4");
                         add(".1");
                     }
                 }
            );
            add (new ArrayList<>()
                 {
                     {
                         add("5");
                         add(".1");
                     }
                 }
            );
            add (new ArrayList<>()
                 {
                     {
                         add("6");
                         add(".1");
                         add(".2");
                     }
                 }
            );
            add (new ArrayList<>()
                 {
                     {
                         add("7");
                         add(".1");
                         add(".2");
                         add(".3");
                     }
                 }
            );
            add (new ArrayList<>()
                 {
                     {
                         add("8");
                         add(".1");
                         add(".2");
                         add(".3");
                     }
                 }
            );
            add (new ArrayList<>()
                 {
                     {
                         add("9");
                         add(".1");
                     }
                 }
            );
            add (new ArrayList<>()
                 {
                     {
                         add("10");
                         add(".1");
                     }
                 }
            );
            add (new ArrayList<>()
                 {
                     {
                         add("16");
                         add(".1");
                     }
                 }
            );
        }
    };
}
