package zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Zadanie1 {

    public static void disemvowel(String str) {

        ArrayList<Character> strCharArr = new ArrayList<>();

        for(int i=0;i<str.length();i++) {
            strCharArr.add(str.charAt(i));

        }

        strCharArr.removeIf(n -> (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u'));
        strCharArr.removeIf(n -> (n == 'A' || n == 'E' || n == 'I' || n == 'O' || n == 'U'));

        String retStr = "";

        for(int j=0;j<strCharArr.size();j++) {
            retStr+=strCharArr.get(j).toString();

        }

        //Iterator<Character> it = strCharArr.iterator();
        //while(it.hasNext()) {
        //    Character value = it.next();
        //    retStr+=it.toString();
        //}


        System.out.println(retStr);
    }
}