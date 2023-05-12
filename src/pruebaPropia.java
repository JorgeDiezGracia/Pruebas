import javax.swing.*;
import java.util.Scanner;

public class pruebaPropia {

    public static void main(String[] args) {
        String clave="Jorge";
        Scanner entrada = new Scanner (System.in);
        String pass = entrada.nextLine();

    System.out.println("Introduce la clave");
        do
         {



          pass = entrada.nextLine();
            //pass = JOptionPane.showInputDialog("Introduce la clave");


            if (clave.equals(pass)==false) {

                System.out.println("Clave incorrecta");




            }
        }while (clave.equals(pass)==false);

        System.out.println("Clave correcta");

    }
}
