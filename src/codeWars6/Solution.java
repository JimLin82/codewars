package codeWars6;

import java.util.Arrays;

public class Solution {
    //6等題目 : Two Sum
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0;i< numbers.length;i++) {
            for (int j = i+1;j< numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    System.out.println(Arrays.toString(new int[]{i, j}));
                    return new int[]{i,j};
                }
            }
        }

       return null;
    }

    //6等題目 : Break camelCase
    public static String camelCase(String input) {
        String s ="" ;
        for (int i = 0; i < input.length(); i++) {
            String sub = input.substring(i, i + 1);
            if(sub == sub.toUpperCase()){
               s+=" ";
            }
            s+= input.substring(i, i + 1);
        }
        System.out.println(s);
        return s;
        //別人解法 :
//        return input.replaceAll("([A-Z])", " $1");
    }
    //6等題目 : Multiples of 3 or 5
    public static int solution(int number) {
        int total = 0;
        for (int i = 0; i<number; i++){
            if(i % 3 == 0 || i % 5 == 0){
                total = total + i;
            }
        }
        System.out.println(total);
        return total;
    }
}
