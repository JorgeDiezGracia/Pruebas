import javax.swing.*;
import java.util.Scanner;




public class accesoAplicacion {
    public static void main(String[] args) {



        String clave="Jorge";
        String pass = "";



        while (clave.equals(pass)==false) {

            pass = JOptionPane.showInputDialog("Introduce la clave");


            if (clave.equals(pass)==false) {

                pass = JOptionPane.showInputDialog("Clave Incorrecta");
                //System.out.println("Clave incorrecta");


            }
        }


        System.out.println("Clave correcta");

    }
}
