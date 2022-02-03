public class FeldTest {
    public static void printArray(int[] a) { // Gibt das Arrays als String aus. Inhalt,damit man sieht.
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {89, 89, 89, 89, 89};
        int[] b = {89, 9, 89, 9, 89};
        System.out.println(Feld.istHomogen(a));
        System.out.println(Feld.istHomogen(b));

        int[] c = {1, 2, 5, 5, 19};
        int[] d = {89, 42, 12, 888, 89};
        System.out.println(Feld.istSortiert(c));
        System.out.println(Feld.istSortiert(d));

        System.out.println(Feld.maxPos(c));
        System.out.println(Feld.maxElement(c));
        System.out.println(Feld.maxPos(d));
        System.out.println(Feld.maxElement(d));

        int[] e = {1, 14, 5, 5, 22,};
        int[] f = {6, 1, 15, 19, 3};
        printArray(Feld.max(e, f));
        printArray(Feld.max( new int[] {}, new int[] {}));

        System.out.println("Aufgabe 2");
        int[] g = {8, 1, 3, 19, 29, 0}; // {0, 29,19,3,1,8}
        printArray(g);
        printArray(Feld.umkehren(g));
        int[] j = {1, 2, 3, 4, 5};
        Feld.umkehrenInPlace(j);
        printArray(j);
    }
}