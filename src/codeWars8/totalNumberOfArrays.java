package codeWars8;
public class totalNumberOfArrays {
    public static double sum(double[] numbers) {
        double totle = 0;
        for(int i = 0 ; i < numbers.length ; i++) {
            totle += numbers[i];
        }
        System.out.println(totle);
        return totle;

    }
}
