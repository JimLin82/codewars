package codeWars7;

public class Vowels {
    //7等題目 : Vowel Count
    public static int getCount(String str) {
        str.replaceAll(" ","");
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i,i+1);
            if(s.matches("[aeiouAEIOU]")){
                total++;
            }
        }
        return total;
    }
}
