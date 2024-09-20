package Opciones;

import java.util.Scanner;
import menus.Menu;
public class OpcionConstantes {

    private Scanner scanner = new Scanner(System.in);
    private Menu menu;

    public OpcionConstantes(Menu menu){
        this.menu = menu;
    }

    public void mostrar() {

        int opcion;

        do {
            System.out.println("==================================================");
            System.out.println("-                  CONSTANTES                    -");
            System.out.println("==================================================");
            System.out.println("-          1. Explicación de Constantes          -");
            System.out.println("-          2. Programa con Constantes            -");
            System.out.println("-          0. Volver al menú principal           -");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    explicacionConstante();
                    break;
                case 2:
                    programaConstantes();
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

        } while (opcion != 0);


    }

                private void  explicacionConstante (){
                    System.out.println("Constantes en Java:");
                    System.out.println();
                    System.out.println("Una constante es un valor que no cambia durante la ejecución del programa.");
                    System.out.println("Se declaran usando la palabra clave `final`.");
                    System.out.println();
                    System.out.println("Ejemplo:");
                    System.out.println("final double PI = 3.14159;");
                    System.out.println();
                    System.out.println("Nota: PI no puede ser cambiado después de ser asignado.");
                    System.out.println();  // Espacio adicional para separación

                }
                private void  programaConstantes (){
                    System.out.println("Ejemplo de programa con constantes:");

                    final double PI = 3.14159;

                    System.out.print("Introduce el radio del círculo: ");
                    double radio = scanner.nextDouble();

                    double area = PI * radio * radio;

                    System.out.printf("El área del círculo con radio %.2f es: %.2f%n", radio, area);
                }

        }
