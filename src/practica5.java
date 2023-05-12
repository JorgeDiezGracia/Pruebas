import java.util.Scanner;
public class practica5 {
    public static void main(String[] args) {
   //Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales

   Scanner entrada=new Scanner(System.in);
   System.out.println("Introduzca un número, por favor:");
   int x=entrada.nextInt();
   System.out.println("Introduzca otro número, por favor:");
   int y=entrada.nextInt();

   if (x>y) {
       System.out.println("El número " + x + " es mayor que " + "el número " + y);
   }
   else if (x==y) {
       System.out.println("El número " + x + " es igual que " + "el número " + y);
   }
   else {
       System.out.println("El número " + y + " es mayor que" + "el número " + x);

   }
    }
}
