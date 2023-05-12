import java.util.Scanner;

public class practica9 {
    public static void main(String[] args) {
// Hacer un menú que permita elegir entre cuadrado, rectángulo, triángulo o círculo
// En función de lo que elija, calcular el área (cuadrado:lado x 2, rectángulo:base x altura, triángulo:base x altura / 2,
//círculo: pi x radio al cuadrado)

        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opción \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Redondo");
        int figura = entrada.nextInt();

        switch (figura) {

            case 1:
                System.out.println("Indica cuánto mide la base de cuadrado:");
                int base = entrada.nextInt();
                System.out.println("El área del cuadrado es " + base * base);

            break;

            case 2:
                System.out.println("Indica cuánto mide la base del rectángulo:");
                int baseRectangulo = entrada.nextInt();
                System.out.println("Indica cuánto mide la altura del rectánculo");
                int alturaRectangulo = entrada.nextInt();
                System.out.println("El área del cuadrado es " + baseRectangulo * alturaRectangulo);

            break;

            case 3:
                System.out.println("Indica cuanto mide la base del triángulo");
                int baseTriangulo = entrada.nextInt();
                System.out.println("Indica cuánto mide la altura del triángulo");
                int alturaTriangulo = entrada.nextInt();
                System.out.println("El área del triángulo es " + (baseTriangulo * alturaTriangulo) / 2);

            break;

            case 4:
                System.out.println("Indica cuanto mide el radio del círculo");
                double radio = entrada.nextInt();
                System.out.println("El área del círculo es " + Math.PI * Math.pow(radio,2));

            break;

            default:
                System.out.println("No es ninguno de los números seleccionados");

            break;

        }

    }
}
