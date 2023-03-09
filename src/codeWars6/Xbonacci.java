package codeWars6;

import java.util.Arrays;

public class Xbonacci {
    //6等題目 : Tribonacci Sequence
    public static double[] tribonacci(double[] s, int n) {
        double[] tritab=Arrays.copyOf(s, n);
        System.out.println(Arrays.toString(tritab));
        for(int i=3;i<n;i++){
            tritab[i]=tritab[i-1]+tritab[i-2]+tritab[i-3];
        }
        System.out.println(Arrays.toString(tritab));
        return tritab;
    }
}
