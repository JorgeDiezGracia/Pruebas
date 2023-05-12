import java.util.Scanner;

public class solicita2numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = entrada.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = entrada.nextInt();

        if (num1 == num2) {
            System.out.println("Los dos números son iguales");
        }
        else {
            System.out.println("Los dos números son diferentes");
        }

    }
}