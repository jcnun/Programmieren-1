/**
 * @author jcorde2s
 */
// blat 4.5
public class DatumTest {

    public static boolean istSchaltjahrCheck(int j, boolean erw) {
        boolean erg = Datum.istSchaltjahr(j);
        if (erg != erw) {

            System.out.println("FEHLER fuer istSchaltjahr(" + j + "): "
                    + erg + " statt " + erw);
        }
        return erg == erw;
    }
    public static boolean istSchaltjahrTest() {
        return istSchaltjahrCheck(2016, true)
                & istSchaltjahrCheck(2018, false)
                & istSchaltjahrCheck(1583, false)
                & istSchaltjahrCheck(2060, true)
                & istSchaltjahrCheck(2308, true)
                & istSchaltjahrCheck(2000, true)
                & istSchaltjahrCheck(1400, true)
                & istSchaltjahrCheck(1100, true)
                & istSchaltjahrCheck(1212, true)
                & istSchaltjahrCheck(1221, false)
                & istSchaltjahrCheck(2100, false)
                & istSchaltjahrCheck(2400, true);

    }
    public static boolean test() {
        return istSchaltjahrTest();
    }
}