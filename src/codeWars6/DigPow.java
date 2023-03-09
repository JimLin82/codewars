package codeWars6;

public class DigPow {
    //6等題目 : Playing with digits
    public static long digPow(int n, int p) {
        int total = 0;
        for (int i=0; i<String.valueOf(n).length(); i++) {
            int x = Integer.parseInt(String.valueOf(n).substring(i,i+1));
            total += Math.pow(x,p+i);
        }
        if(total % n == 0){
            return total / n;
        }
        else return -1;
    }
}
