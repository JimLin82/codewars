package codeWars6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {
        String[] list = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.toUpperCase().charAt(i);
            if (c != ' ') {
                StringBuilder sb = new StringBuilder(str);
                sb.setCharAt(i, c);
                list[i] = sb.toString();
            }
        }
        List<String> list1 = new ArrayList<>(
                Arrays.asList(list));
        list1.removeAll(Collections.singletonList(null));
        return list1.toArray(new String[0]);

    }
}
