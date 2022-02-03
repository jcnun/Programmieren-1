/*
 * @author jcorde2s
 */
public class DynFeldVonInt {
    private int[] feld = null;

    public DynFeldVonInt(int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("Array muss mindestens ein Element groß sein");
        }

        this.feld = new int[k];
    }

    public int length() {
        return this.feld.length;
    }

    public int get(int i) {
        verifyIndex(i);
        return this.feld[i];
    }

    public void set(int i, int v) {
        verifyIndex(i);
        this.feld[i] = v;
    }

    public boolean equals(DynFeldVonInt f) {
        if (f == null) {
            throw new IllegalArgumentException("equals mit null aufgerufen");
        }

        if (this.length() != f.length()) {
            return false;
        }

        for (int i = 0; i < this.length(); ++i) {
            if (this.get(i) != f.get(i)) {
                return false;
            }
        }

        return true;
    }

    public String toString() {
        String s = "[";

        for (int i = 0; i < this.length(); ++i) {
            if (i > 0) {
                s += ",";
            }
            s += String.valueOf(this.get(i));
        }

        s += "]";
        return s;
    }

    public void insert(int i, int k) {
        // verifyIndex geht nicht, da der Index this.length() gültig ist: Anfügen ans Ende
        if (i < 0 || i > this.length()) {
            throw new IndexOutOfBoundsException("insert: Index nicht gültig");
        }

        if (k < 0) {
            throw new IllegalArgumentException("k muss >= 0 sein");
        } else if (k == 0) {
            return;
        }

        // 1 2 ^ 0 0 ^  3 4 (Werte) i = 2, k = 2
        // 0 1          2 3 (Position)
        int[] feldNeu = new int[this.length() + k];
        for (int j = 0; j < this.length(); ++j) {
            if (j < i) {
                feldNeu[j] = this.get(j);
            } else { // Ab Position i
                feldNeu[j + k] = this.get(j);
            }
        }

        this.feld = feldNeu;
    }

    public void remove(int i, int k) {
        verifyIndex(i);

        if (k < 0) {
            throw new IllegalArgumentException("k muss >= 0 sein");
        } else if (k > this.length() - i) {
            throw new IllegalArgumentException("keine k Elemente mehr ab i entfernbar");
        } else if (k == 0) {
            return;
        }

        int[] feldNeu = new int[this.length() - k];
        for (int j = 0; j < feldNeu.length; ++j) {
            if (j < i) {
                feldNeu[j] = this.get(j);
            } else { // Ab Position i
                feldNeu[j] = this.get(j + k);
            }
        }

        this.feld = feldNeu;
    }

    private void verifyIndex(int i) {
        if (i < 0 || i >= this.length()) {
            throw new IndexOutOfBoundsException("get: Index nicht gültig");
        }
    }
}