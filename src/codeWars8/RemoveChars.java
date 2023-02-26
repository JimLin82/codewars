package codeWars8;

public class RemoveChars {
    public static String remove(String str) {
        StringBuilder MyString = new StringBuilder(str);
        StringBuilder x1 = MyString.deleteCharAt(0);
        StringBuilder x2 = x1.deleteCharAt(x1.length()-1);
        System.out.println(x2.toString());
        return x2.toString();
    }
}
