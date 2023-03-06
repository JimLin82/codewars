package codeWars7;

public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int total = 0;
        int yr = 0;
        while (total < p){
            total = (int)(p0 + (p0 * (percent/100)+ aug));
            yr++;
            p0 = total;
        }
        return yr;
    }
}
