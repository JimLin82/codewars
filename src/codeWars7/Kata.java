package codeWars7;

public class Kata {
    //7等題目 : How good are you really?
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double total = 0;
        for (int i=0;i<classPoints.length;i++){
            total += (double)classPoints[i]/ classPoints.length;
        }
        if(total>yourPoints){
            return false;
        }
        return true;
    }
}
