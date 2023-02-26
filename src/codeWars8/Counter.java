package codeWars8;

public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int total = 0;
        for (int i = 0; i <arrayOfSheeps.length ; i++){
            if(arrayOfSheeps[i]==null) {
                arrayOfSheeps[i] = false;
            }
            if(arrayOfSheeps[i] ==true){
                total++;
            }
      }
        return total;
    }
}
