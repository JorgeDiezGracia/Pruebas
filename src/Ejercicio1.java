import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //TODO COMPROBAR SI EL USUARIO INTRODUCE CORRECTAMENTE UN NÚMERO Y SI NO, AVISARLE
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int x = entrada.nextInt();
        // int x = Integer.parseInt(teclado.nextLine()); ** más recomendado

        System.out.println("Introduce otro número: ");
        int y = entrada.nextInt();
        //int y = Integer.parseInt(teclado.nextLine()); ** más recomendado

        if (x==y) {

            System.out.println("Los números " + x + " y " + y + " son iguales");
        } else {
            System.out.println("Los números introducidos no son iguales");
        }
    }
}