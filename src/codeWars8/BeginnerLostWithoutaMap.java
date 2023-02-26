package codeWars8;

import java.util.Arrays;

public class BeginnerLostWithoutaMap {
    public static int[] map(int[] arr) {
        int[] list = arr ;
        for (int i = 0 ; i < arr.length ; i++){
            list[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(list));
        return list;
    }
}
