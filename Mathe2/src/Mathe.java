/**
 * @author jcorde2s
 */
//Blatt 3.2
public class Mathe {
    public static void ausgabeVielfache(int a, int n) {
        int z = 0;
        for (int i = 1; i <= n; i++) {
            z = a * i;
            System.out.print(z + " ");
        }
        System.out.println(""); // Zeilenumbruch
    }

    public static void ausgabe1x1 (int n) {
        for ( int i = 1; i<=n; i++){
           ausgabeVielfache(i,n);


        }
    }


}
