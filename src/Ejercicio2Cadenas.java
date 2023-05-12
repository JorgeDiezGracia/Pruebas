import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2Cadenas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Persona unaPersona = new Persona("Santiago", "Pérez", "su casa");
        //System.out.println(unaPersona.apellidos());
        ArrayList<Persona> personas = new ArrayList<>();
        boolean salir = false;
    do {
        System.out.println("Agenda de contactos en Java");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Buscar contacto (por apellido");
        System.out.println("Opción: x para salir");
        System.out.println("Opción: ");
        String opcion = teclado.nextLine();
        if (opcion.equals("1")) {
            // añadir contacto

            System.out.println("Introduce nombre: ");
            String nombre = teclado.nextLine();
            System.out.println("Introduce apellido: ");
            String apellido = teclado.nextLine();
            System.out.println("Introduce dirección: ");
            String dirección = teclado.nextLine();
            Persona unaPersona = new Persona(nombre, apellido, dirección);
            personas.add(unaPersona);
            System.out.println("Persona añadida (" + personas.size() + ")");

        } else if (opcion.equals("2")) {
            // buscar por apellido
            System.out.println("Qué apellido quieres buscar: ");
            String apellido = teclado.nextLine();
            boolean encontrado = false;
            for (Persona persona : personas) {
                if (persona.apellidos().equals(apellido)) {
                    System.out.println("Encontrado.  Mostrando datos");
                    System.out.println(persona.nombre());
                    System.out.println(persona.apellidos());
                    System.out.println(persona.direccion());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No se ha podido localizar a esa persona");
            }
        } else if (opcion.equals("x")) {
            // salir de la aplicación
            salir = true;

        } else {
            System.out.println("Opción incorrecta");
            }
        }  while (!salir);
        System.out.println("Fin de la aplicación");
    }
    }
