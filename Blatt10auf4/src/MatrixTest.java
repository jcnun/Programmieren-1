public class MatrixTest {
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("\nAufgabe 4:");
        Matrix m1 = new Matrix(2, 3);
        m1.set(0, 0, 1).setZeile(1, 3.5).setSpalte(2, 7);
        System.out.println(m1);
        Matrix m2 = new Matrix(m1);
        System.out.println(m2);
        m1.set(0, 0, 42);
        m2.set(0, 0, 66);
        System.out.println(m1);
        System.out.println(m2);
    }
}