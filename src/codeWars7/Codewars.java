package codeWars7;

public class Codewars {
    //7等題目 : Odd or Even?
    public static String oddOrEven (int[] array) {
        int total = 0;
        for (int x:array){
            total +=x;
        }
        if(total %2 ==0) {
            return "even";
        }
        return "odd";
    }
}
