package codeWars7;

import java.util.regex.Pattern;

public class Solution {
    //7等題目 Regex validate PIN code
    public static boolean validatePin(String pin) {
        Pattern pattern = Pattern.compile("[0-9]*");
        if(pattern.matcher(pin).matches() && pin != ""){
            for (int i = 0; i<pin.length();i++){
                if(pin.charAt(i)>='0' && pin.charAt(i)<='9'
                        && String.valueOf(pin).length()==4 || String.valueOf(pin).length()==6)
                    System.out.println("true");
                    return true;
            }
        };
        return false;
    }
    //7等題目 RCentury From Year
    public static int century(int number) {
        int year = 0;
        if(number % 100 ==0){
            year = number /100;
            return  year;
        }
        return (number/100)+1;
    }
}
