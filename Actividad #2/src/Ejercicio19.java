import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double lado;
        System.out.println("Ingrese el valor de un lado");
        lado = entrada.nextDouble();

        double perimetro;
        perimetro = lado * 3;

        double cuadrado = 2;
        double altura;
        double a;
        double b;
        double c;
        double d;
        a = Math.pow(lado, cuadrado);
        b = lado / 2;
        c = Math.pow(b, cuadrado);
        d = a + c;
        altura = Math.sqrt(d);

        double area;
        area = (lado * altura)/2;

        System.out.println("el perimetro es " + perimetro);
        System.out.println( "La altura es:  " + altura);
        System.out.println("El area total del triangulo es " + area);
    }
}
