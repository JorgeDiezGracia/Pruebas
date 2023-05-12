import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class entradaYSalida {
    public static void main(String[] args) {


    System.out.println("Introduce tu nombre, por favor");
        Scanner entrada = new Scanner(System.in);
    String nombre_usuario = entrada.nextLine();
    System.out.println("Introduce tu edad, por favor");
    int edad = entrada.nextInt();
    System.out.println("Hola " + nombre_usuario + ".  Al año que viene tendrás "
            + (edad+1) + " años");




    }
}
