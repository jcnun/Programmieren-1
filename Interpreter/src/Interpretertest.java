import java.util.Scanner;

public class Interpretertest {
    public static void main (String[] args){
        Scanner sc = new Scanner( System.in);
        System.out.println(Interpreter.verarbeite(sc));
        sc.close();
    }
}
