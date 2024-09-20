package Opciones;

import java.util.Scanner;
import menus.Menu;
public class CondicionalTernaria {

    private Scanner scanner = new Scanner(System.in);
    private Menu menu;

    public CondicionalTernaria(Menu menu){
        this.menu = menu;
    }

    public void mostrar() {

        int opcion;

        do {
            System.out.println("==================================================");
            System.out.println("-              CONDICIONAL TERNARIA              -");
            System.out.println("==================================================");
            System.out.println("-          1. Explicación de Ternaria            -");
            System.out.println("-          2. Programa con Ternaria              -");
            System.out.println("-          0. Volver al menú principal           -");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción: ");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarernaria();
                    break;
                case 2:
                    mostrarProgramaTernaria();
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
                private void mostrarernaria() {
                    System.out.println("===============================================");
                    System.out.println("               Operador Ternario              ");
                    System.out.println("===============================================\n");
                    System.out.println("La operación ternaria es una forma simplificada de escribir un `if-else`.");
                    System.out.println("Su sintaxis es: `condicion ? valor_si_true : valor_si_false`.");
                    System.out.println("Ejemplo:");
                    System.out.println("int numero = 10;");
                    System.out.println("String resultado = (numero > 5) ? \"Mayor a 5\" : \"Menor o igual a 5\";");
                    System.out.println("System.out.println(resultado); // Resultado: Mayor a 5\n");
                }
                private void mostrarProgramaTernaria() {
                    System.out.println("===============================================");
                    System.out.println("            Programa de Ternario               ");
                    System.out.println("===============================================\n");

                    System.out.print("Introduce un número: ");
                    int numero = scanner.nextInt();

                    // Usamos el operador ternario para determinar el resultado
                    String resultado = (numero > 5) ? "Mayor a 5" : "Menor o igual a 5";

                    System.out.println("El resultado es: " + resultado);
                }


        }
