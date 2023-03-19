import java.util.Scanner;

public class Ejercicio415 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int pesoA;
        int pesoB;
        int pesoC;
        int pesoD;

        System.out.println("Ingrese el peso de la esfera A: ");
        pesoA = entrada.nextInt();

        System.out.println("Ingrese el peso de la esfera B: ");
        pesoB = entrada.nextInt();

        System.out.println("Ingrese el peso de la esfera C: ");
        pesoC = entrada.nextInt();

        System.out.println("Ingrese el peso de la esfera D: ");
        pesoD = entrada.nextInt();

        
        if (pesoA != pesoB && pesoA != pesoC && pesoA != pesoD) {   
            if (pesoA > pesoD) {
                System.out.println("La esfera A es diferente y es la de mayor peso.");
            } else {
                System.out.println("La esfera A es diferente y es la de menor peso.");
            }
        }    
        else if (pesoB != pesoA && pesoB != pesoC && pesoB != pesoD) {           
            if (pesoB > pesoD) {
                System.out.println("La esfera A es diferente y es la de mayor peso.");
            } else {
               System.out.println("La esfera A es diferente y es la de menor peso.");
            }
        }
        else if (pesoC != pesoA && pesoC != pesoB && pesoC != pesoD) {          
            if (pesoC > pesoD) {
                System.out.println("La esfera A es diferente y es la de mayor peso.");
            } else {
                System.out.println("La esfera A es diferente y es la de menor peso.");
            }
        }
        else {          
            if (pesoD > pesoA) {
                System.out.println("La esfera A es diferente y es la de mayor peso.");
            } else {
                System.out.println("La esfera A es diferente y es la de menor peso.");
            }
        }
    }
}
