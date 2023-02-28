package codeWars7;

public class Square {
    //7等題目 :
    public static boolean isSquare(int n) {
        int x = (int) Math.sqrt(n);
//        System.out.println(Math.sqrt(n) % 1);
        if(n >= 0 && (x*x)==n){
            return true;
        }
         return false;
    }
}
