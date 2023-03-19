import java.util.Scanner;

public class Ejercicio413 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String bolita;
        double compra;

        System.out.println("ingrese el color de la bolita");
        bolita = entrada.nextLine();

        System.out.println("ingrese el valor total de la compra");
        compra = entrada.nextInt();

        double desc = 0;
        if (bolita.equals("blanca")) {
            desc = 0;
        
        }else if (bolita.equals("verde")){
            desc = 10;
        
        }else if (bolita.equals("amarilla")){
            desc = 25;
        
        }else if (bolita.equals("azul")){
             desc =50;
        
        
        }else {
            desc = 100;
        }   
        
                                   
        double valpag;
        valpag = (compra- (desc*compra)/100);
        System.out.println("el cliente debe pagar $" + valpag);
    }
}

