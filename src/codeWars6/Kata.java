package codeWars6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

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
    //6等題目 : Array.diff
    public static int[] arrayDiff(int[] a, int[] b) {
        if(a.length ==0 || b.length == 0){
            return a;
        }
        LinkedList s1 = new LinkedList();
        Set b2 = new HashSet<>();
        for (int i = 0; i <b.length; i++) {
            b2.add(b[i]);
        }
        System.out.println(b2.toString());
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < b2.size(); j++) {

            }
        }
        int[] a2 = new int[s1.size()];
        for (int i = 0; i < s1.size(); i++) {
            a2[i] = (int) s1.get(i);
        }
        System.out.println(Arrays.toString(a2));
        return a2;
    }
}
