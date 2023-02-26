package codeWars7;

public class Accumul {
    //7等題目 : Mumbling
    public static String accum(String s) {
        String str ="";
        String[] string = new String[s.length()];

        for (int i = 0 ;i <s.length();i++){
            str += s.toUpperCase().charAt(i);
            string[i] = String.valueOf(str.charAt(i))
                    +String.valueOf(str.toLowerCase().charAt(i)).repeat(i);
        }
        String total = string[0];
        for (int j = 1 ; j < string.length; j++){
            total += "-"+string[j];
        }
        System.out.println(total);
       return total;
    }
}
