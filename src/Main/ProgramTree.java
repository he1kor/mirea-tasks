package Main;

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
                         add(".2 coming soon");
                         add(".3 coming soon");
                         add(".4 coming soon");
                         add(".5 coming soon");
                     }
                 }
            );
            add (new ArrayList<>()
                 {
                     {
                         add("2");
                         add(".1 coming soon");
                         add(".2 coming soon");
                     }
                 }
            );
        }
    };
}
