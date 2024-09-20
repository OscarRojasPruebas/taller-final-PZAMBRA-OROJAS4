package Opciones;

import java.util.Scanner;
import menus.Menu;
public class OpcionString {

    private Scanner scanner = new Scanner(System.in);
    private Menu menu;

    public OpcionString(Menu menu){
        this.menu = menu;
    }

    public void mostrar() {

        int opcion;

        do {

            System.out.println("==================================================");
            System.out.println("-                    STRING                      -");
            System.out.println("==================================================");
            System.out.println("-          1. Explicación de String              -");
            System.out.println("-          2. Programa con String                -");
            System.out.println("-          0. Volver al menú principal           -");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarExplicacion();
                    break;
                case 2:
                    mostrarPrograma();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    menu.mostrarMenu();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción entre 0 y 2.");
            }

            if (opcion != 0) {
                System.out.println("\nPresione Enter para volver al menú de String...");
                scanner.nextLine();
            }

        } while (opcion != 0);

        scanner.close(); // Cerrar el escáner al finalizar
    }

            private void mostrarExplicacion() {
                System.out.println("    String en Java: ");
                System.out.println("    Una cadena de texto (String) es un objeto que representa una secuencia de caracteres."  );
                System.out.println("    Las cadenas son inmutables, lo que significa que no pueden ser modificadas una vez creadas."    );
                System.out.println("    Ejemplo:"  );
                System.out.println("    String nombre = \"Juan\";" );
                System.out.println("    System.out.println(nombre); // Resultado: Juan"    );
                System.out.println();
            }

            private void mostrarPrograma() {
                System.out.println("Este es un programa simple que usa String:");
                System.out.print("Introduce un texto: ");
                String texto = scanner.nextLine();

                System.out.println("Texto introducido: " + texto);
                System.out.println("Longitud del texto: " + texto.length());
                System.out.println("Texto en mayúsculas: " + texto.toUpperCase());
                System.out.println("Texto en minúsculas: " + texto.toLowerCase());
            }

}


