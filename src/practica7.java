import java.util.Scanner;

public class practica7 {
    public static void main(String[] args) {
        // Crea un programa que pida al usuario dos números y muestre el resultado de su división.
        //Si el segundo número es 0, debe mostrar un mensaje de error

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número, por favor");
        int x=entrada.nextInt();
        System.out.println("Introduce otro número, por favor");
        int y=entrada.nextInt();
        if (y!=0) {
            int z=x/y;
            System.out.println("El resultado de la división de los dos números es " + z );

        }
        else {
            System.out.println("Lo siento reinice el programa e introduzca un segundo número distinto a 0");



        }

    }
}
