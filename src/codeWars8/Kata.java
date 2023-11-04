package codeWars8;

import java.util.Arrays;

public class Kata {
    public int min(int[] list) {
        int s = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < s) {
                s = list[i];
            }
        }
        return s;
    }

    public int max(int[] list) {
        int x = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > x) {
                x = list[i];
            }
        }
        return x;
    }

    public static int makeNegative(final int x) {

        if (x < 0) {
            return x;
        } else {
            return -x;
        }
    }

    public static int opposite(int number) {
        return -number;
    }

    public static int sum(int[] numbers) {
        int total = 0;
        if (numbers != null) {
            Arrays.sort(numbers);
            for (int i = 1; i < numbers.length - 1; i++) {
                total += numbers[i];
            }
            System.out.println(total);
            return total;
        } else {
            return 0;
        }
    }

    //8等題目 : Reversed Strings
    public static String solution(String str) {
        StringBuffer sb = new StringBuffer();
        sb.append(str);
//        System.out.println(sb.reverse());
        return sb.reverse().toString();
    }

    public static int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int num = (int) Math.sqrt(array[i]);
            if (array[i] == num*num ){
                array[i] = num;
            }else {
                array[i] = (int) Math.pow(array[i],2);
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}