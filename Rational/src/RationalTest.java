public class RationalTest {
    static public void main ( String[] args) {
        Rational r = new Rational ( 1,2);
        System.out.println(r.toString());

        Rational r1= new Rational( -3,-2);
        System.out.println(r1.abs());

        Rational r2 = new Rational(7,-3);
        System.out.println(r2.rez());

        Rational r3 = new Rational(-3);
        System.out.println(r3.zaehler());

        Rational r4 = new Rational(0,0);
        System.out.println(r4.toString());
    }
}
