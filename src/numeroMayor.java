import java.util.Arrays;
import java.util.Scanner;
public class numeroMayor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int primerNumero = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el segundo número: ");
        int segundoNumero = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el tercer número: ");
        int tercerNumero = Integer.parseInt(teclado.nextLine());

        int [] numeros = {primerNumero, segundoNumero, tercerNumero};
        Arrays.sort(numeros);
            System.out.print("El número más alto es el " + numeros[numeros.length - 1]);

    }
}
