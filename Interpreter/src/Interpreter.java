/**
 * @author jcorde2s
 */

import java.util.Scanner;

public class Interpreter {
    public static String verarbeite ( Scanner sc){
        // vor| nach Z in Wort
        // nach s in Durstiger = tiger
        // vor s in Durstiger = Dur
        String position = sc.next();
        char s = sc.next().charAt(0);
        String in = sc.next();
        String folge = sc.next();
        if ( folge.lastIndexOf(s)== -1) {
            if (position.equals("vor")) {
                return "";
            }
            return folge;
        }
        if ( position.equals("vor")) {
            return folge.substring(0, folge.lastIndexOf(s));
        }
        else{
             return folge.substring((folge.indexOf(s)+1),folge.length());
             }
        }



    }

