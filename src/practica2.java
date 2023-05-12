import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
 Scanner entrada=new Scanner(System.in);
 System.out.println("Introduzca un número, por favor");
 int x= entrada.nextInt();
 if (x>=0) {
     System.out.println("El número es positivo");
 }
 else {
     System.out.println("El número es negativo");

 }
    }
}
