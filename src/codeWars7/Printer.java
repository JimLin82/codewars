package codeWars7;

public class Printer {
    public static String printerError(String s) {
        int total = 0;
        for (int i=0;i<s.length();i++){
           if(s.substring(i,i+1).matches("[N-Zn-z]")){
               total++;
           };
        }
//        System.out.printf(total+"/"+s.length());
        return total+"/"+s.length();
        //別人解答:
//        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
}
