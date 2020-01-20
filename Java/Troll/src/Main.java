public class Main {

    public static void main(String[] args) {
        // Creating Outside method for searching vowels in strArray[i]
        String newStr="";
        String str = "Java String to String Array Example";
        String strArray[] = str.split(" ");
        for(int i=0; i < strArray.length; i++){
            newStr+=" "+strArray[i];
        }
        System.out.println(newStr);
    }
}


