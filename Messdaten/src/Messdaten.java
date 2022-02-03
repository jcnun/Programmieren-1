/**
 * @author jcorde2s
 */

// blatt 4 aufgabe 2
import java.util.Scanner;

public class Messdaten {
    public static double temperaturInDurchschnitt(Scanner sc) {
       int i = 0;
       double v = 0.0;
       double maxTemp = -273.15;
       String maxDatum = "";
       while ( sc.hasNext()) {
           // Lies ein: 2000 12 01 Temperatur 32.2
           int j = sc.nextInt();
           int m = sc.nextInt();
           int t = sc.nextInt();
           String wert = sc.next();
           double messWert = sc.nextDouble();
           if (wert.equals("Temperatur")) {
               v += messWert;
               ++i;

               if (messWert >= maxTemp) {
                   maxTemp = messWert;
                   maxDatum = t + "." + m + "." + j;
               }
           }
       }
       System.out.println("hoechste Temperatur (" + maxTemp + ") am " + maxDatum);
       return v/i;
    }}

    /*2018 10 16 Luftdruck 1014.7
            2018 10 17 Niederschlag 1.3
            2018 10 15 Temperatur 18.2
            2018 10 16 Niederschlag 0.0
            2018 10 17 Temperatur 16.8*/