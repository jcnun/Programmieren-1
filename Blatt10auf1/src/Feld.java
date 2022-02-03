/*
 * @author jcorde2s
 */

public class Feld {
    private static void verifyArray(int[] f, boolean allowEmpty) {
        if (f == null) // Bedeutet ,dass die Referenz auf kein Objekt verweist, Array == Null
            throw new NullPointerException("Null nix gut");

        if (!allowEmpty && f.length == 0)
            throw new IllegalArgumentException("Leeres Array");
    }

    /* Aufgabe 1 */

    public static boolean istHomogen(int[] f) {
        verifyArray(f, true);

        for (int i = 0; i < f.length - 1; ++i) {
            int aktuell = f[i];
            int nachbar = f[i+1];

            if (aktuell != nachbar) {
                return false;
            }
        }

        return true;
    }

    public static boolean istSortiert(int[] f) {
        verifyArray(f, true);

        for (int i = 0; i < f.length - 1; ++i) {
            int aktuell = f[i];
            int nachbar = f[i+1];
            //a1>=a2...>=an
            if (aktuell > nachbar) { // prüf ob Aktuell größer ist als Nachbar
                return false;
            }
        }

        return true;
    }

    public static int maxPos(int[] f) {
        verifyArray(f, false);

        int max = 0;
        int pos = -1;

        for (int i = 0; i < f.length; ++i) {
            if (pos == -1 || f[i] > max) {
                max = f[i];
                pos = i;
            }
        }

        return pos;
    }

    public static int maxElement(int[] f) {
        verifyArray(f, false);

        return f[maxPos(f)];
    }

    public static int[] max(int[] f1, int[] f2) {
        verifyArray(f1, true);
        verifyArray(f2, true);

        if (f1.length != f2.length)
            throw new IllegalArgumentException("Arraylängen sind nicht gleich :(");

        int laenge = f1.length;
        int[] fmax = new int[laenge];
        for (int i = 0; i < laenge; ++i) {
            fmax[i] = f1[i] > f2[i] ? f1[i] : f2[i];
        }
        return fmax;
    }

    /* Aufgabe 2 */

    public static int[] umkehren(int[] f) {
        verifyArray(f, true);

        int[] fneu = new int[f.length];
        int j = 0;
        for (int i = f.length - 1; i >= 0; --i, ++j) {
            fneu[j] = f[i];
        }

        return fneu;
    }

    public static void umkehrenInPlace(int[] f) {
        verifyArray(f, true);


        for (int i = 0; i < f.length / 2; ++i) {
            int wertLinks = f[i];
            int wertRechts = f[f.length - 1 - i];

            f[i] = wertRechts;
            f[f.length - 1 - i] = wertLinks;
        }
    }
}


