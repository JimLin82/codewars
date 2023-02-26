package codeWars7;

import java.util.Arrays;

public class MinMax {
    // 7等題目 : The highest profit wins!
    public static int[] minMax(int[] arr) {
        if(arr != null){Arrays.sort(arr);}
        for(int i = 0 ; i< arr.length;i++){
           arr = new int[]{arr[0],arr[arr.length-1]};
        }
        return arr;
    }
}
