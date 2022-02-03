/**
 * @author jcorde2s
 */

//Blatt 8 aufgabe 1

public class Mathe {
    public static int addLoop(int a, int b){

        while( b > 0) {
            b--;
            a++;
        }
        // 7+3= 7+1+1+1
        while(b < 0){
            b++;
            a--;
        }
        return a;
    }

    public static int subLoop(int a, int b) {
        while(b > 0){
            // 7-5=7-1-1-1-1-1
            b--;
            a--;
        }
        while(b < 0){
            // 7-(-5)=7+1+1+1+1+1
            b++;
            a++;
        }
        return a;
    }

    public static int mulLoop(int a, int b) {
        int e=0;
        // 5*3=0+5+5+5
        for(int i=0; i < b; i++) {
            e=addLoop(e,a);
        }
        // 5*(-3)=-5-5-5
        for(int i=0; i > b; i--){
            e=subLoop(e,a);
        }
        return e;
    }

    public static int divLoop(int a, int b) {
        int e=0;
        // 15 / 5=3
        while(a >= b) {
            a=subLoop(a,b);
            e++;
        }
        return e;
    }

    public static int modLoop( int a, int b ) {
        // 8%3 = 2 = 8-3-3
        while ( a >=b ){
            a= subLoop(a,b);
        }
        return a;
    }

    public static int powLoop(int a, int b) {
        int e = 1;
        if(a == 0 && b == 0 )
            return 1;
        if ( a == 0)
            return 0;
        // 5³=5*5*5
        for(int i=0; i<b;i++){
            e=mulLoop(e,a);
        }
        return e;
    }
}

