public class Troll {
  //  String str = "Lolilulaj";



    public static void disemvowel (String str) {
        String newStr="";
        char[] vowelArr = {'a','e','i','o','u'};
        for (char i : str.toLowerCase().toCharArray()) {
            for (char j :vowelArr)
                if (i != j) {
                    newStr += i;
                    break;
                }
        }
        System.out.println(newStr);
    }


    public static void main(String[] args){
        new Troll()= troll("saddada");
        System.out.println(newStr);
    }
}
