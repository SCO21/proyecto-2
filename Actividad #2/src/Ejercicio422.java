import java.util.Scanner;

public class Ejercicio422 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int horas;
        int valor;

        System.out.println("ingrese el nombre del empleado");
        nombre = entrada.nextLine();

        System.out.println("ingrese el numero de horas trabajadas");
        horas = entrada.nextInt();

        System.out.println("ingrese el valor de cada hora trabajada");
        valor = entrada.nextInt();

        int sueldo;
        sueldo = horas * valor;

        if (sueldo >= 450000){
            System.out.println("El empleado de nombre " + nombre + " tiene un sueldo de $" + sueldo );
        }else if (sueldo < 450000){
            System.out.println("el nombre del empleado es " + nombre);
        }
    }
}
