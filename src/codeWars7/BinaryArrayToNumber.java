package codeWars7;

import java.util.List;

public class BinaryArrayToNumber {
    //7等題目 : Ones and Zeros
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int total = 0, a=2, b= binary.size();
        for (int i = 0; i < b; i++) {
            if(binary.get(i) == 1){
            total += (int) Math.pow(a,b-i-1);
            }
        }
        System.out.println(total);
        return  total ;
    }
}
