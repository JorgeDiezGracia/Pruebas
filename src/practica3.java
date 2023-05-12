import java.util.Arrays;
import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] numerosOrdenados = new int[3];
        System.out.println("Introduce un número: ");
        numerosOrdenados[0]= teclado.nextInt();
        System.out.println("Introduce otro número: ");
        numerosOrdenados[1]= teclado.nextInt();
        System.out.println("Introduce otro número: ");
        numerosOrdenados[2]= teclado.nextInt();
        Arrays.sort(numerosOrdenados);
        System.out.println(Arrays.toString(numerosOrdenados));


    }
}
