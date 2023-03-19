import java.util.Scanner;

public class Ejercicio414 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double ventas1;
        double ventas2;
        double ventas3;
        double salario;

        System.out.println("ingrese las ventas del departamento 1");
        ventas1 = entrada.nextDouble();

        System.out.println("ingrese las ventas del departamento 2");
        ventas2 = entrada.nextDouble();

        System.out.println("ingrese las ventas del departamento 3");
        ventas3 = entrada.nextDouble();

        System.out.println("ingrese el salario de los vendedores");
        salario = entrada.nextDouble();

        double ventasTotales;
        ventasTotales = ventas1 + ventas2 + ventas3;

        double porven;
        porven = ventasTotales * 0.33;

        double sueldo1 = 0;
        double sueldo2 = 0;
        double sueldo3 = 0;
        if (ventas1 >= porven){
            sueldo1 = (salario + ( salario * 0.2));

        }else{
            sueldo1 = salario;
        }
        if (ventas2 >= porven){
            sueldo2 = (salario + ( salario * 0.2));

        }else{
            sueldo2 = salario;

        }
        if (ventas3 >= porven){
            sueldo3 = (salario + ( salario * 0.2));

        }else{
            sueldo3 = salario;   
        }
        System.out.println("El sueldo de los vendedores del depto 1 es " + sueldo1 + ", El sueldo de los vendedores del depto 2 es " + sueldo2 + ", El sueldo de los vendedores del depto 3 es: " + sueldo3);



    }
}
