package codeWars7;

public class DescendingOrder {
    //7等題目 : Descending Order
    public static int sortDesc(final int num) {
        String s = String.valueOf(num);
        int[] list = new int[s.length()];
        int temp = 0;
        for (int i=0; i< list.length;i++){
            list[i]= Integer.parseInt(s.substring(i,i+1));
        }
        //泡沫排序法
        for (int i=0; i<list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] < list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        String d ="";
        for (int a : list){
            d += a;
        }
//        System.out.println(Integer.parseInt(d));

//        別人解法:
//        String[] array = String.valueOf(num).split("");
//        Arrays.sort(array, Collections.reverseOrder());
//        return Integer.valueOf(String.join("", array));
        return Integer.parseInt(d);

    }
}
