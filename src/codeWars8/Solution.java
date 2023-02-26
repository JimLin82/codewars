package codeWars8;

public class Solution {
    //8等題目
    public static  String removeExclamationMarks(String s) {
        String x ="";
        for (String retval: s.split("!")){
           x += retval;
        }
        return x;
    }

}
