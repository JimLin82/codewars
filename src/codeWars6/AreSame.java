package codeWars6;

public class AreSame {
    //6等題目 : Take a Ten Minutes Walk
    public static boolean comp(int[] a, int[] b) {

        int x = 0;
        if(a != null && b !=null) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (b[j] == Math.pow(a[i], 2)) {
                        b[j] = 0;
                        ++x;j++;
                        System.out.println(a[i]);
                        System.out.println(x);
                    }
                }
            }
            if (a.length == x && b.length == x) {
                return true;
            }
        }
        return false;
    }

}
