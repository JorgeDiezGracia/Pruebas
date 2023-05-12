import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {

Scanner entrada=new Scanner(System.in);
System.out.println("Introduzca un número, por favor:");
int x=entrada.nextInt();
System.out.println("Introduzca otro número, por favor");
int y=entrada.nextInt();
if (x==y) {
    System.out.println("Los dos números son iguales");
        }
else {
    System.out.println("Los dos números no son iguales");

}
    }
}