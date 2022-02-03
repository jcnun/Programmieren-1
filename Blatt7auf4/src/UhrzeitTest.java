public class UhrzeitTest {
    private static void testUhrzeit(Uhrzeit u) {
        System.out.println(u.toString());

        Uhrzeit uKopie = new Uhrzeit(u);
        System.out.println(u.equals(uKopie));

    }

    public static void main(String[] args) {
        Uhrzeit u1 = new Uhrzeit();
        testUhrzeit(u1);

        Uhrzeit u2 = new Uhrzeit(10);
        testUhrzeit(u2);

        Uhrzeit u3 = new Uhrzeit(12, 23);
        testUhrzeit(u3);

        Uhrzeit uKopie = new Uhrzeit(u1);
        System.out.println(u1.equals(uKopie));
        System.out.println(u1 == uKopie); //Vergleich die Adresse, sag dass die Referenzen gleich sind
    }
}
