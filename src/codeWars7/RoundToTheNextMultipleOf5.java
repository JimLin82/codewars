package codeWars7;

public class RoundToTheNextMultipleOf5 {
    public static int roundToNext5(int number) {
        System.out.println(number % 5);
        if(number>0) {
            if (number % 5 == 0) {
                return number;
            } else {
                return ((number / 5) + 1) * 5;
            }
        }else {
            if (number % 5 == 0) {
                return number;
            } else {
                return (number / 5) * 5;
            }
        }
    }
    //別人解法:
//    while (number % 5 != 0) {
//        number++;
//    }
//    return number;
}
