import java.util.Scanner;

public class Ejercicio412 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("ingrese el nombre del trabajador");
        nombre = entrada.nextLine();
        int horas;
        System.out.println("ingrese el numero de horas trabajadas");
        horas = entrada.nextInt();
        int valor;
        System.out.println("ingrese el valor de la hora trabajada");
        valor = entrada.nextInt();

        int sueldo = horas * valor;
        if (horas < 40){
            System.out.println("El trabajador " + nombre + " devengó " + sueldo);     
        }
        int horase = horas;
        int horasex = horas;
        if (horas > 40){
            horase = horas - 40;
            horas -= horase;
            if (horase <= 8){
                sueldo = (horas * valor) + (horase *(valor*2));
                System.out.println("El trabajador " + nombre + " devengó " + sueldo); 
            }
            if (horase > 8){
                 horasex = horase - 8;
                 horase -= horasex;
                 sueldo = (horas * valor) + (horase * 2 * valor) + (horasex *3 * valor);
                 System.out.println("El trabajador " + nombre + " devengó " + sueldo); 

            }
            
        }
    }
    
}
