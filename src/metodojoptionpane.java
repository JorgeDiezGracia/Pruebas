import javax.swing.JOptionPane;
import java.net.SocketOption;

public class metodojoptionpane {
    public static void main(String[] args) {
        String Nombre_usuario = JOptionPane.showInputDialog("Introduzca nombre");
        String edad = JOptionPane.showInputDialog("Introduzca su edad");
        int edad_usuario = Integer.parseInt(edad);
        System.out.println("Hola " + Nombre_usuario + ".  Al año que viene tendrás " + (edad_usuario + 1) + " años.");


    }
}
