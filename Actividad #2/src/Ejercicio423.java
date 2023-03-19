import java.util.Scanner;

public class Ejercicio423 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A;
        double B;
        double C;

        System.out.println("Ingrese el valor de A:");
        A = entrada.nextDouble();

        System.out.println("Ingrese el valor de B:");
        B = entrada.nextDouble();

        System.out.println("Ingrese el valor de C:");
        C = entrada.nextDouble();

        double D;
        D = B * B - 4 * A * C;


        if (D < 0) {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
        
        else if (D == 0) {
            double solucion = -B / (2 * A);
            System.out.println("La ecuación tiene una única solución: " + solucion);
        }
       
        else {
            double solucion1;
            double solucion2; 
            solucion1 = (-B + Math.sqrt(D)) / (2 * A);          
            solucion2 = (-B - Math.sqrt(D)) / (2 * A);
            
            System.out.println("La ecuación tiene dos soluciones: " + solucion1 + " y " + solucion2);
        }
    }
}

