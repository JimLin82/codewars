package codeWars8;

public class BeginnerSeries2Clock {

    public static int Past(int h, int m, int s)
    {
       int time = (h*3600+m*60+s)*1000;

        return time;
    }
}
