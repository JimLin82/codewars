package codeWars7;

import java.util.Arrays;

public class SquareDigit {
    public static int squareDigits(int n) {
        String s = "";
        String strNumber =  Integer.toString(n);
        int[] results = new int[n];
        for (int i = 0 ; i <strNumber.length() ;i++){
            results[i] = Character.getNumericValue( strNumber.charAt(i) );
            results[i] = results[i]*results[i];
            s += results[i];
        }
        System.out.println(Integer.parseInt(s));
        return Integer.parseInt(s) ;
    }
}
