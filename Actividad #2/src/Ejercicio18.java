
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        System.out.println("Ingrese el nombre");
        nombre=entrada.nextLine();

        double codigo;
        System.out.println("Porfavor ingrese el codigo del empleado");
        codigo = entrada.nextDouble();

        double horas;
        System.out.println("Ingrese el numero de horas trabajadas");
        horas = entrada.nextDouble();

        double precio;
        System.out.println("ingrese el valor de la hora trabajada");
        precio = entrada.nextDouble();

        double retencion;
        System.out.println("Ingrese el porcentaje de retencion de fuente");
        retencion = entrada.nextDouble();

        System.out.println("El nombre del empleado es: " + nombre);
        System.out.println("El codigo del empleado es: " + codigo);
        
        Double bruto;
        bruto = horas * precio;
        System.out.println("El sueldo bruto es " + bruto + "COP");

        double porcentaje;
        porcentaje = retencion / 100;
        double descuento;
        descuento = bruto * porcentaje;
        double neto;
        neto = bruto - descuento;
        System.out.println("El sueldo neto es " + neto);




    }
}
