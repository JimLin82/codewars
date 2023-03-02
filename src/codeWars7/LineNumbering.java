package codeWars7;

import java.util.ArrayList;
import java.util.List;

public class LineNumbering {
    //7等題目 :
    public static List<String> number(List<String> lines) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i< lines.size();i++){
            list.add(i+1+": "+lines.get(i));
        }
        return list;
    }
}
