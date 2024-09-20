package Opciones;

import java.util.Scanner;
import menus.Menu;
public class BucleDoWhile {

    private Scanner scanner = new Scanner(System.in);
    private Menu menu;

    public BucleDoWhile(Menu menu){
        this.menu = menu;
    }

    public void mostrar() {

        int opcion;

        do {
            System.out.println("==================================================");
            System.out.println("-                   DO WHILE                     -");
            System.out.println("==================================================");
            System.out.println("-          1. Explicación de DO WHILE            -");
            System.out.println("-          2. Programa de DO WHILE               -");
            System.out.println("-          0. Volver al menú principal           -");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarDoWhile();
                    break;
                case 2:
                    mostrarProgramaDoWhile();
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

    private void mostrarDoWhile() {
        System.out.println("===============================================");
        System.out.println("                Bucle DO WHILE                ");
        System.out.println("===============================================\n");
        System.out.println("El bucle `do-while` ejecuta un bloque de código al menos una vez, y luego repite");
        System.out.println("la ejecución mientras la condición sea verdadera.");
        System.out.println("Ejemplo:");
        System.out.println("int i = 1;");
        System.out.println("do {");
        System.out.println("    System.out.println(i);");
        System.out.println("    i++;");
        System.out.println("} while (i <= 5);");
        System.out.println("// Resultado: 1 2 3 4 5\n");
    }

    private void mostrarProgramaDoWhile() {
        System.out.println("===============================================");
        System.out.println("            Programa de Do While               ");
        System.out.println("===============================================\n");

        int numero;
        do {
            System.out.print("Introduce un número positivo (0 para salir): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("Has introducido: " + numero);
            } else if (numero < 0) {
                System.out.println("Por favor, introduce un número positivo.");
            }

        } while (numero != 0); // Salir si se introduce 0

        System.out.println("Fin del programa.");
    }

        }