/**
 * @author jcorde2s
 */

public class Mathe {
    public static void quadOutRueck(int n) {
        int i = n;
        while (i >= 1) {
            System.out.println(i * i);
            i = i - 1;
        }
    }

    public static int fak(int n) {
        int i = 1;
        int x = 1;
        while (i <= n) {
            x = x * i;
            i = i + 1;
        }

        return (x);
    }
}
