/**
 */

public class RechteckXYPerEcke {


    private Punkt2D lu;
    private Punkt2D ro;

    public RechteckXYPerEcke(double xl, double xr, double yu, double yo) {
        this.ro = new Punkt2D(xr, yo);
        this.lu = new Punkt2D(xl, yu);
    }

    public RechteckXYPerEcke(Punkt2D punkt1, Punkt2D punkt2) {

        double xl, xr, yu, yo;
        if (punkt1.x() < punkt2.x()) {
            xl = punkt1.x();
            xr = punkt2.x();
        }
        else {
            xl = punkt2.x();
            xr = punkt1.x();

        }


        if (punkt1.y() < punkt2.y()) {
            yu = punkt1.y();
            yo = punkt2.y();
        }
        else {
            yu = punkt2.y();
            yo = punkt1.y();
        }


        this.lu = new Punkt2D(xl, yu);

        this.ro = new Punkt2D(xr, yo);
    }

    // hier einfach den oberen Konstruktor anrufen
    public RechteckXYPerEcke(RechteckXYPerEcke r) {
        this(r.lu, r.ro);
    }

    public boolean equals(RechteckXYPerEcke r) {
        return (this.lu.equals(r.lu) && this.ro.equals(r.ro));
    }

    public double hoehe() {
        return ro.y() - lu.y();
    }

    public double breite() {

        return ro.x() - lu.x();

    }

    public Punkt2D ecke(boolean istRechts, boolean istOben) {
        return new Punkt2D(istRechts ? this.ro.x() : this.lu.x(), istOben ? this.ro.y() : this.lu.y());
    }

    public Punkt2D ecke(int number) {

        switch (number) {

            case 0:
                return this.ecke(false, false);
            case 1:
                return this.ecke(true, false);
            case 2:
                return this.ecke(true, true);
            case 3:
                return this.ecke(false, true);
            default:
                return this.ecke(false, false);

        }

    }



    public Punkt2D mitte() {
        return new Punkt2D(lu.x() + breite() / 2, + lu.y() + hoehe() / 2);
    }

    public double flaeche() {
        return hoehe() * breite();
    }

    public double durchmesser() {
        return this.lu.abstand(this.ro);
    }

    public double umfang() {

        return 2 * breite() + 2 * hoehe();
    }



    public RechteckXYPerEcke verschiebe(double x, double y) {
        this.ro.verschiebe(x, y);
        this.lu.verschiebe(x, y);
        return this;
    }

    public String toString() {

        return "[" + this.lu + "," + this.ro + "]";
    }

}