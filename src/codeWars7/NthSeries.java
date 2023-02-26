package codeWars7;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class NthSeries {
    public static String seriesSum(int n) {
//        1 --> 1 --> "1.00"
//        2 --> 1 + 1/4 --> "1.25"
//        5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"
        double s =0;
        for (int i = 0; i < n; i++){
           s += (double) 1/(1+(i*3));
        }
//        String x = String.valueOf(BigDecimal.valueOf(s)
//                .setScale(2,BigDecimal.ROUND_HALF_DOWN)
//                .floatValue());
        String str = String.format("%.2f",s);
      return str;
    }
}
