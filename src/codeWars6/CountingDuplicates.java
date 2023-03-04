package codeWars6;

import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {
    //6等題目 : Counting Duplicates
    public static int duplicateCount(String text) {
        Set set = new HashSet<>();
        Set set1 = new HashSet<>();
        for (int i = 0; i < text.length(); i++) {
            if (set.add(text.substring(i, i + 1).toLowerCase()) == text.matches(set.toString())) {
                set1.add(text.substring(i, i + 1).toLowerCase());
            }
        }
        System.out.println(set1.size());
        return set1.size();
    }
}
