import java.util.Scanner;

public class numeroPositivoONegativo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        // String lecturaTeclado=teclado.nextLine();
        //int numero = Integer.parseInt(lecturaTeclado); // Cast de tipos (convierte dato string en int)
        int num = entrada.nextInt();
        if (num < 0) {
            System.out.println("El número es negativo");
        }
        else {
            System.out.println("El número es positivo");

        }
    }
}
