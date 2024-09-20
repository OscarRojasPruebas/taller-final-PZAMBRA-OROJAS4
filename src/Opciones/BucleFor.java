package Opciones;

import java.util.Scanner;
import menus.Menu;
public class BucleFor {

    private Scanner scanner = new Scanner(System.in);
    private Menu menu;

    public BucleFor(Menu menu){
        this.menu = menu;
    }

    public void mostrar() {

        int opcion;

        do {
            System.out.println("==================================================");
            System.out.println("-                   BUCLE FOR                    -");
            System.out.println("==================================================");
            System.out.println("-          1. Explicación de FOR                 -");
            System.out.println("-          2. Programa de FOR                    -");
            System.out.println("-          0. Volver al menú principal           -");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarFor();
                    break;
                case 2:
                    mostrarProgramaFor();
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
                scanner.nextLine(); // Espera por la tecla Enter
            }

        } while (opcion != 0); // Permitir volver al menú principal

        scanner.close(); // Cerrar el escáner al finalizar
    }

            private void mostrarFor() {
                System.out.println("===============================================");
                System.out.println("                Bucle FOR                ");
                System.out.println("===============================================\n");

                System.out.println("El bucle `for` permite iterar un número determinado de veces.");
                System.out.println("Está compuesto por tres partes: inicialización, condición, e incremento.");

                System.out.println("Ejemplo:");
                System.out.println("for (int i = 1; i <= 5; i++) {");
                System.out.println("    System.out.println(i);");
                System.out.println("}");
                System.out.println("// Resultado: 1 2 3 4 5");
    }

            private void mostrarProgramaFor() {
                System.out.println("==================================================");
                System.out.println("-              PROGRAMA CON FOR                  -");
                System.out.println("==================================================");
                System.out.println("Este programa imprimirá números del 1 al 10.");

                for (int i = 1; i <= 10; i++) {
                    System.out.println("Número: " + i);
                }
                System.out.println("Fin del bucle FOR.");
            }
        }
