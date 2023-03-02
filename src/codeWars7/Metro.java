package codeWars7;

import java.util.ArrayList;

public class Metro {
    //7等題目 : Number of People in the Bus
    public static int countPassengers (ArrayList<int[]> stops){
        int[]list ;
        int total = 0;
        for (int i = 0;i<stops.size();i++){
           list =  stops.get(i);
           total += list[0]-list[1];
        }
        System.out.println(stops.get(0)[0]);
        return total;
    }
}
