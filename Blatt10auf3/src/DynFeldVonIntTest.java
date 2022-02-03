public class DynFeldVonIntTest {
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("\nAufgabe 3:");
        DynFeldVonInt dyn = new DynFeldVonInt(3);
        System.out.println(dyn);
        dyn.set(0, 1);
        dyn.set(1, 2);
        dyn.set(2, 3);
        System.out.println(dyn);
        System.out.println(dyn.get(1));
        DynFeldVonInt dyn2 = new DynFeldVonInt(3);
        System.out.println(dyn2);
        System.out.println(dyn.equals(dyn2));
        dyn2.set(0, 1);
        dyn2.set(1, 2);
        dyn2.set(2, 3);
        System.out.println(dyn.equals(dyn2));

        System.out.println(dyn);
        dyn.insert(1, 2);
        System.out.println(dyn);
        dyn.remove(1, 2);
        System.out.println(dyn);

        System.out.println("AB HIER BEISPIEL VOM BLATT");
        DynFeldVonInt feld = new DynFeldVonInt(3);
        feld.set(0, 3);
        feld.set(1, 7);
        feld.set(2, -1);
        System.out.println(feld); // [3,7,-1]
        feld.insert(1, 2);
        System.out.println(feld); // [3,0,0,7,-1]
        feld.set(2, 5);
        feld.set(1, -3);
        System.out.println(feld); // [3,-3,5,7,-1]
        feld.remove(2, 3);
        System.out.println(feld); // [3,-3]
        //feld.remove(1, 2); // IllegalArgumentException
    }
}