package codeWars6;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    //7等題目 : Detect Pangram
    public static boolean check(String sentence){
        Set set = new HashSet<>();
        for (int i = 0 ; i <sentence.length(); i++) {
            if (!sentence.substring(i,i+1).equals("")) {
                set.add(sentence.substring(i,i+1).toLowerCase());
            }
        }
        if (set.size()<26) {
            return false;
        }
        return true;
    }
}
