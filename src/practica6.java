import java.util.Scanner;

public class practica6 {
    public static void main(String[] args) {
//Realiza un programa que pida un número por teclado y nos indique si es par o impar
Scanner entrada=new Scanner(System.in);
System.out.println("Introduzca un número, por favor:");
int x=entrada.nextInt();
if (x%2==0) {
    System.out.println("El número es par");
}
else {
    System.out.println("El número es impar");

}
    }
}
