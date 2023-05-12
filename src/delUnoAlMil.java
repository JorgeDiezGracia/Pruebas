import java.util.Scanner;

public class delUnoAlMil {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = Integer.parseInt(teclado.nextLine());

        if ((numero >=0) && (numero <= 1000)) {
            String numeroEnTexto = String.valueOf(numero);
            System.out.println("El número tiene " + numeroEnTexto.length() + " dígitos");

        } else {
            System.out.println("El número es erróneo");

        }

    }
}
