/*
 */
 
 //blatt 5 aufgabe 4


public class Zeichenkette {

    public static String verkuerze(String s, int n) {
        if (s.length() <= 2 * n + 5) {
            return s;
        } else {
            return s.substring(0, n) + "[...]" + s.substring(s.length() - n, s.length());
        }
    }
}