import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double ladoA;
        double ladoB;
        double ladoC;

        System.out.println("ingrese el valor del lado A");
        ladoA = entrada.nextDouble();
        System.out.println("ingrese el valor del lado B");
        ladoB = entrada.nextDouble();
        System.out.println("Ingrese el valor del lado C");
        ladoC = entrada.nextDouble();

        double perimetro;
        double sp;
       
        perimetro = ladoA + ladoB + ladoC;
        sp = perimetro / 2;
        double area = Math.sqrt(sp * (sp - ladoA) * (sp - ladoB) * (sp - ladoC));

        System.out.println("el perimetro del triangulo es: " + perimetro);
        System.out.println("el semiperimetro del triangulo es: " + sp);
        System.out.println("el area del triangulo es: " + area);
    }
}
