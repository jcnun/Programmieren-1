/**
 * @author jcorde2s
 */

//Blatt 8 aufgabe 2

public class Mathe {

    public static int addRek(int a, int b){
        if(b < 0){
            // 5 + (-3) = 2
            // -5 +3 -> -4 +2 -> -3 +1 -> -2 +0 -> 2
            return -addRekHilf(-a,-b);
        }
        return addRekHilf(a,b);
    }

    public static int addRekHilf(int a, int b){
        // Abbrechbedingung
        if(b==0) {
            return a;
        }
        return addRekHilf(++a,--b); // Endrekursion
    }

    public static int subRek(int a, int b){
        if(b < 0){
            return -subRekHilf(-a,-b);
        }
        return subRekHilf(a,b);
    }

    public static int subRekHilf(int a, int b){
        if(b==0) {
            return a;
        }
        return subRekHilf(--a, --b);
    }

    public static int mulRek(int a, int b){
        if(b < 0){
            return -mulRekHilf(a,-b);
        }
        return mulRekHilf(a,b);
    }

    public static int mulRekHilf(int a, int b){

        // Abbruchbedingung
        if(b==0){
            return 0;
        }
        // 5*3=5+5+5
        return addRek(a,mulRek(a,--b));
    }

    public static int divRek(int a, int b){
        if(b<0){
            //6/(-3) -> 6/3 = 2 -> -2
            return -divRekHilf(a, -b);
        }

        return divRekHilf(a,b);

    }

    public static int divRekHilf(int a, int b){
        // Abbrechbedingung
        if(a<b) {
            return 0;
        }
        // 5/5=1
        return addRek(1, divRekHilf( subRek(a,b), b ) );
    }

    public static int modRek(int a, int b) {
        //Abbruchbedingung
        if(a<b) {
            return a;
        }
        return modRek(subRek(a,b),b);
    }

    public static int powRek(int a, int b){
        //Abbruchbedingung
        if(a==0 && b==0) {
            return 1;
        }
        if ( b == 0){
            return 1;
        }
        if(a==0) {
            return 0;
        }
        return mulRek(a,powRek(a,--b));
    }
   
}