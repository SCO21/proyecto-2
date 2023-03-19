import java.util.Scanner;

public class Ejercicio410 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int codigo;
        String nombre;
        double patrimonio;
        int estrato;
        double matricula;

        System.out.println("ingrese el codigo del estudiante");
        codigo = entrada.nextInt();

        entrada.nextLine();
        System.out.println("ingrese el nombre del estudiante");
        nombre = entrada.nextLine();

        System.out.println("ingrese el patrimonio del estudiante");
        patrimonio = entrada.nextDouble();

        System.out.println("ingrese el estrato social del estudiante");
        estrato = entrada.nextInt();

        matricula = 50000;
        if (patrimonio > 2000000 && estrato > 3){
            matricula += patrimonio*0.03;
        }
        System.out.println("el estudiante con numero de inscripcion " + codigo + " y nombre " + nombre + " debe pagar $" +matricula);
    }
}
