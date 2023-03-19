import java.util.Scanner;

public class Ejercicio411 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double n1;
        double n2;
        double n3;

        System.out.println("ingrese el primer numero");
        n1 = entrada.nextDouble();
        System.out.println("ingrese el segundo numero");
        n2 = entrada.nextDouble();
        System.out.println("ingrese el tercer numero");
        n3 = entrada.nextDouble();

        Double mayor = n1;
        if (n1 > n2 && n1 > n3){
            mayor = n1;
        }
        if(n2 > n1 && n2 > n3){
            mayor = n2;
        }
        if (n3 > n1 && n3>n2){
            mayor = n3;
        }
        System.out.println("el numero mayor entre " +  n1  + " , " + n2 + " y " + n3 + " es: " + mayor);
    } 
}


