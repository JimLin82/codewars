package codeWars6;

public class Solution {
    //6等題目 : Two Sum
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0;i< numbers.length;i++) {
            for (int j = i+1;j< numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
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
}
