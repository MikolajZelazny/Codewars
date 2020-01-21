package zadanie2;

import java.util.ArrayList;
import java.util.List;

public class LineNumbering {

    public static List<String> number(List<String> lines) {
        //TODO przeczytaj o kolekcjach w java
        List<String> doReturna = new ArrayList<>();
         doReturna.add("a");
         doReturna.add("b");
         doReturna.add("c");
        /****************/
        doReturna.add(0,"0");
            for (int i=0;i<doReturna.size();i++){
                // doReturna.get(i); // i = index, get = letter
                String pozition = i + ": " + doReturna.get(i); ;
                doReturna.add(i, pozition);
                doReturna.remove(i+1);
            }
            doReturna.remove(0);

        // int x = doReturna.size(); // return --> 4


        //doReturna.get(2); //sout -> 3: c
        //System.out.println(doReturna.toString());
        return doReturna;
    }
}


