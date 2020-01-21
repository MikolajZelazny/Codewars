package zadanie1;

public class Zadanie1 {

    public void rozwiazanie(){
        // Creating Outside method for searching vowels in strArray[i]
        // Only first letter upperCase, others even if vowel remain the same, and if upperCase, then stay upperCase
        String newStr="";
        String str = "Java String to String Array Example";
        String strArray[] = str.split(" ");
        for(int i=0; i < strArray.length; i++){
            newStr+=" "+strArray[i];
        }
        System.out.println(newStr);
        System.out.println("/***************************************************************/");
    }
}
