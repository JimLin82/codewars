package codeWars8;

public class ReversedSequence {
    public static int[] reverse(int n){
        int[] list = new int[n];
        int i = n;
        int x = 0;
        while (x < n) {
            if (i > 0) {
                list[x] = i;
            }
            x++;i--;
        }
        return list;
    }
}
