package Opciones;

import java.util.Scanner;
import menus.Menu;
public class BucleWhile {

    private Scanner scanner = new Scanner(System.in);
    private Menu menu;

    public BucleWhile(Menu menu){
        this.menu = menu;
    }

    public void mostrar() {

        int opcion;

        do {
            System.out.println("==================================================");
            System.out.println("-                   BUCLE WHILE                  -");
            System.out.println("==================================================");
            System.out.println("-          1. Explicación de WHILE               -");
            System.out.println("-          2. Programa de WHILE                  -");
            System.out.println("-          0. Volver al menú principal           -");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarWhile();
                    break;
                case 2:
                    mostrarProgramaWhile();
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

        } while (opcion != 0); // Permitir volver al menú principal

        scanner.close(); // Cerrar el escáner al finalizar
    }

    private void mostrarWhile() {
        System.out.println("===============================================");
        System.out.println("                Bucle WHILE                ");
        System.out.println("===============================================\n");

        System.out.println("El bucle `while` evalúa la condición antes de ejecutar el bloque de código.");
        System.out.println("Se ejecutará el bloque mientras la condición sea verdadera.");

        System.out.println("Ejemplo:");
        System.out.println("int i = 1;");
        System.out.println("while (i <= 5) {");
        System.out.println("    System.out.println(i);");
        System.out.println("    i++;");
        System.out.println("}");
        System.out.println("// Resultado: 1 2 3 4 5");
    }

    private void mostrarProgramaWhile() {
        System.out.println("==================================================");
        System.out.println("-              PROGRAMA CON WHILE                -");
        System.out.println("==================================================");
        System.out.println("Este programa imprimirá números del 1 al 5.");

        int i = 1;
        while (i <= 5) {
            System.out.println("Número: " + i);
            i++; // Incrementa el valor de i en cada iteración
        }
        System.out.println("Fin del bucle WHILE.");
    }
}

