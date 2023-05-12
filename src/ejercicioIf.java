import java.util.Scanner;
public class ejercicioIf {
    public static void main(String[] args) {

    System.out.print("Introduce un número: ");
    Scanner entrada = new Scanner(System.in);
    int num1 = entrada.nextInt();

    if (num1 < 100) {
        System.out.println("El número es menor que 100");

    }
      else if (num1 > 100) {
          System.out.println("El número es mayor que 100");

    }
        else
            System.out.println("El número es igual que 100");

    }

}
