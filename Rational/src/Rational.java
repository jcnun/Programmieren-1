/**
 * @author jcorde2s
 */
public class Rational {

    private int zaehler = 0;
    private int nenner = 1;

    public Rational() {
        this.zaehler = 0;
        this.nenner = 1;
    }
    public Rational(int zaehler) {
        this.zaehler = zaehler;
    }
    public Rational(int a, int n) {
        if (n < 0) {
            a = -a;
            n = -n;
        }
        zaehler = a;
        nenner = n;
        if (a < 0) {
            a = -a;
        }
        while (n > 0) {
            int t = a % n;
            a = n;
            n = t;
        }
        this.zaehler = zaehler / a;
        this.nenner = nenner / a;
    }
    public Rational(Rational r) {
        this.zaehler = r.zaehler;
        this.nenner = r.nenner;
    }
    public int zaehler() {
        return zaehler;
    }
    public int nenner() {
        return nenner;
    }
    public boolean equals (Rational r) {
        if (zaehler == r.zaehler & nenner == r.nenner) {
            return true;
        }
        return false;
    }
    public boolean istKleiner (Rational r) {
        return (zaehler/nenner) < (r.zaehler/r.nenner);
    }
    public Rational abs() {
        Rational r = new Rational(zaehler, nenner);
        if (zaehler < 0) {
            r.zaehler *= -1;
        }
        return r;
    }
    public Rational rez () {
        Rational r = new Rational(nenner, zaehler);
        return r;
    }
    public Rational add (Rational r) {
        Rational a = new Rational(zaehler * r.nenner + nenner * r.zaehler, nenner * r.nenner);
        return a;
    }
    public Rational sub (Rational r) {
        Rational s = new Rational(zaehler * r.nenner - nenner * r.zaehler, nenner * r.nenner);
        return s;
    }
    public Rational mul (Rational r) {
        Rational m = new Rational(zaehler * r.zaehler, nenner * r.nenner);
        return m;
    }
    public Rational div (Rational r) {
        Rational d = new Rational(zaehler * r.nenner, nenner * r.zaehler);
        return d;
    }
    public String toString() {

        return zaehler + "/" + nenner;
    }
}