import java.util.Arrays;
import java.util.Scanner;
// NO ACABADO
public class numerosDeMenorAMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int primerNumero = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el segundo número: ");
        int segundoNumero = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el tercer número: ");
        int tercerNumero = Integer.parseInt(teclado.nextLine());

        int [] numeros = {primerNumero, segundoNumero, tercerNumero};
        Arrays.sort(numeros);
        for (int numero : numeros) {
            System.out.print(numero + " ");


        }




        //if (num1 <= num2 && num2 <= num3) {
           // System.out.println("Los números de menor a mayor son " + num1 + num2 + num3);
        //}
        //else if (num1<=num3 && num2>=num3) {
            //System.out.println("Los números de menor a mayor son " + num1 + num3 + num2);
        //}
        //else if (num3<=num2 && num2>=num1) {
          //  System.out.println("Los números de menor a mayor son " + num2 + num3 + num1);
        //}
        //else if (num3>=num1) {
          //  System.out.println("Los números de menor a mayor son " + num2 + num1 + num3);
        //}
        //else {
          //  System.out.println("Los números de menor a mayor son" + num3 + num2 + num1);
        //}
    }

}