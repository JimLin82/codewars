package codeWars7;

public class Troll {
    public static String disemvowel(String str) {
        String s ="";
        for (int i=0;i<str.length();i++){
           s +=  str.substring(i,i+1).replace("a","")
                   .replace("A","")
                   .replace("e","")
                   .replace("E","")
                   .replace("I","")
                   .replace("i","")
                   .replace("O","")
                   .replace("o","")
                   .replace("U","")
                   .replace("u","");
        }
        return s;
//        別人解法:
//        System.out.println(str.replaceAll("[aAeEiIoOuU]", ""));

    }
}
