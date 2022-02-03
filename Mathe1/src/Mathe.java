/**
 * @author jcorde2s
 */

public class Mathe {
    public static int abs (int b) {
        if (b <= 0) {
            return -b;
        } else {
            return b;
        }
    }

    public static int max3( int a, int b, int c) {
        if (a>=b && a>=c) {
            return a;}
        else if ( b > a && b > c) {
            return b;}

        else { return c;

        }
    }
}