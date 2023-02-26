
package codeWars8;
public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        int x = l*2+ w*2;
        int y = l*w;
            if(l == w){
                return y;
            }else {
                return x;
            }

    }
}
