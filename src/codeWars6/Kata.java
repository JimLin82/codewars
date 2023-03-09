package codeWars6;

public class Kata {
    //6等題目 : Highest Scoring Word
    public static String high(String s) {
        String[] str = s.split(" ");
        int[] ints = new int[str.length];
        int c = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j <str[i].length(); j++) {
              ints[i] += str[i].codePointAt(j)-96;
            }
            if(ints[c] <ints[i]){
                  c = i;
            }
        }
        return str[c];
    }
}
