


public class Matrix {
    private double[][] daten;

    public Matrix(int z, int s) {
        if (z <= 0 || s <= 0) {
            throw new IllegalArgumentException("z oder s <= 0!");
        }

        this.daten = new double[z][s];
    }

    public Matrix(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n <= 0!");
        }

        this.daten = new double[n][n];
    }

    public Matrix(Matrix m) {
        if (m == null) {
            throw new NullPointerException("m ist null!");
        }


        this.daten = new double[m.daten.length][];
        for (int i = 0; i < m.daten.length; ++i) {
            this.daten[i] = new double[m.daten[i].length];
            for (int j = 0; j < m.daten[i].length; ++j) {
                this.daten[i][j] = m.daten[i][j];
            }
        }
    }

    public int zeilen() {
        return this.daten.length;
    }

    public int spalten() {
        return this.daten[0].length;
    }

    public double get(int z, int s) {
        this.verifyIndex(z, s);

        return this.daten[z][s];
    }

    public Matrix set(int z, int s, double v) {
        this.verifyIndex(z, s);

        this.daten[z][s] = v;
        return this;
    }

    public Matrix setAll(double v) {
        for (int z = 0; z < this.daten.length; ++z) {
            this.setZeile(z, v);
        }

        return this;
    }

    public Matrix setZeile(int i, double v) {
        if (i < 0 || i >= this.zeilen()) {
            throw new IllegalArgumentException("index out of bounds");
        }

        double[] zeile = this.daten[i];
        for (int j = 0; j < zeile.length; ++j) {
            zeile[j] = v;
        }

        return this;
    }

    public Matrix setSpalte(int i, double v) {
        if (i < 0 || i >= this.spalten()) {
            throw new IllegalArgumentException("index out of bounds");
        }

        for (int j = 0; j < this.daten.length; ++j) {
            double[] zeile = this.daten[j];
            zeile[i] = v;
        }

        return this;
    }

    public boolean equals(Matrix m) {
        return false;
    }

    public String toString() {
        String str = "";
        for (int z = 0; z < this.daten.length; ++z) {
            str += this.formatZeile(z);
            str += "\n";
        }

        return str;
    }

    private String formatZeile(int z) {
        if (z < 0 || z >= this.zeilen()) {
            throw new IllegalArgumentException("index out of bounds");
        }

        String str = "( ";

        double[] zeile = this.daten[z];
        for (int s = 0; s < zeile.length; ++s) {
            str += String.valueOf(zeile[s]);
            str += " ";
        }

        str += ")";
        return str;
    }

    private void verifyIndex(int z, int s) {
        if (z < 0 || z >= this.zeilen() || s < 0 || s >= this.spalten()) {
            throw new IllegalArgumentException("index out of bounds");
        }
    }
}