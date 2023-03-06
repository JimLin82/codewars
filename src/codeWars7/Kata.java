package codeWars7;

public class Kata {
    //7等題目 : How good are you really?
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double total = 0;
        for (int i=0;i<classPoints.length;i++){
            total += (double)classPoints[i]/ classPoints.length;
        }
        if(total>yourPoints){
            return false;
        }
        return true;
    }
    //7等題目 : String ends with?
    public static boolean solution(String str, String ending) {
        int total = str.length()-ending.length();
        if(total >=0){
            String s = str.substring(total,str.length());
            if (s.equals(ending)) {
                return true;
            }
        }
        return false;
    }

    //7等題目 : Binary Addition
    public static String binaryAddition(int a, int b){

        return Integer.toBinaryString(a+b);
    }

    //7等題目 : Get the Middle Character
    public static String getMiddle(String word) {
        if (word.length()%2 == 0){
            return word.substring((word.length()/2)-1,(word.length()/2)+1);
        }
        if(word.length()%2 != 0){
            return word.substring((word.length()/2),(word.length()/2)+1);
        }
        return "";
    }

    //7等題目 : Shortest Word
    public static int findShort(String s) {
       String[]word = s.split(" ");
       String sb = word[0];
        for (int i = 1; i < word.length; i++) {
             if(sb.length() > word[i].length()){
                 sb = word[i];
             }
        }
        System.out.println(sb.length());
        return sb.length();
    }

}
