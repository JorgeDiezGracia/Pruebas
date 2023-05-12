import java.util.Scanner;

public class practica4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        do {
            System.out.println("Introduzca un número del 1 al 1000: ");
            int numero = entrada.nextInt();
            boolean numCorrecto;

            if (numero >=1 && numero <=1000){
                numCorrecto=true;
                System.out.println("El número es correcto");
                System.out.println("El número contiene ");
                break;
            } else {
                numCorrecto=false;
                System.out.println("El número no es correcto");
            }

        } while (numCorrecto);




    }
}


        
    
