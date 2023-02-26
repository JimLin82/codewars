package codeWars8;

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        int a = args[0];
        for (int i = 0 ; i < args.length; i++){
            if (args[i]< a){
                a = args[i];
            }
        }
        return a;
    }
}
