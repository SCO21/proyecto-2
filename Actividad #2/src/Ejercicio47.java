import java.net.Socket;
import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double a;
        System.out.println("ingrese el primer numero");
        a = entrada.nextDouble();

        double b;
        System.out.println("ingrese el segundo numero");
        b = entrada.nextDouble();

        if (a>b){
            System.out.println( a + " es mayor que " + b);
        }
        else {
            System.out.println(b + " es mayor que " + a);
        }
    
    }
}
