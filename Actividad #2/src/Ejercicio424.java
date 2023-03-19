import java.util.Scanner;

public class Ejercicio424 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double esfera1;
        double esfera2;
        double esfera3;

        System.out.println("ingrese el peso de la primera esfera ");
        esfera1 = entrada.nextDouble();
        System.out.println("ingrese el peso de la segunda esfera");
        esfera2 = entrada.nextDouble();
        System.out.println("ingrese el peso de la tercera esfera");
        esfera3 = entrada.nextDouble();

        Double mayor = esfera1;
        if (esfera1 > esfera2 && esfera1 > esfera3){
            System.out.println("la esfera de mayor peso es la esfera 1");
        }
        if(esfera2 > esfera1 && esfera2 > esfera3){
            System.out.println("la esfera de mayor peso es la esfera 2");
        }
        if (esfera3 > esfera1 && esfera3>esfera2){
            System.out.println("la esfera de mayor peso es la esfera 3");
        }
        
    } 
}

