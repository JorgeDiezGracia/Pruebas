import java.util.Scanner;

public class introduce_tu_edad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        int edad = entrada.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");

        } else {
            System.out.println("Eres menor de edad");


        }
    }
}