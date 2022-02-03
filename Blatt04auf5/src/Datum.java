/**
 * @author jcorde2s
 */

// blatt 3 aufgabe 4

public class Datum {
    public static boolean istSchaltjahr (int jahr){
        boolean istSchaltjahr;
        if (jahr < 1583) {
            istSchaltjahr = (jahr % 4 == 0);}
        else{
            istSchaltjahr = ((( jahr % 4) == 0) && ((!((jahr % 100) == 0)) || (( jahr % 400) ==0)));
        }
        return istSchaltjahr;
    }


}
