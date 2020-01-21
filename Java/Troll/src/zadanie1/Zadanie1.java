package zadanie1;

public class Zadanie1 {

    public static String disemvowel(String str) {
        //str.toLowerCase
        // 2. String[] vowelArr {a,e,i,o,u}
        // forEach( str )
        // if( vowelArr==str[i] { delete vowels }
        // return newStr
        String strArray[] = str.split(" ");
        String newStr="";
        String[] vowelArr = {"a","e","i","o","u"};
        for (int i=0;i<str.length();i++) {
            for (int j=0;j<vowelArr.length;j++) {
            //for (char j : vowelArr) {
                //char oldChar = i;
                //char newChar = "";
                if (strArray[i]==vowelArr[j]) { // tu jest error
                    newStr+="";
                    //str.replace();
                    break; // without --> ttttthhhhhiiii(4)sssss     iiii(4)sssss...
                }
                else {
                    newStr+=str.charAt(i);
                }
            }
        }
        return newStr;
    }
}
