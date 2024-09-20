package Opciones;

import java.util.Scanner;
import menus.Menu;
public class DatosPrimitivos {

    private Scanner scanner = new Scanner(System.in);

    private Menu menu;

    public DatosPrimitivos(Menu menu){
        this.menu = menu;
    }
    public void mostrar() {

        int opcion;

        do {

            System.out.println("==================================================");
            System.out.println("-                DATOS PRIMITIVOS                -");
            System.out.println("==================================================");
            System.out.println("-          1. Explicación Byte                   -");
            System.out.println("-          2. Explicación Short                  -");
            System.out.println("-          3. Explicación Int                    -");
            System.out.println("-          4. Explicación Long                   -");
            System.out.println("-          5. Explicación Float                  -");
            System.out.println("-          6. Explicación Double                 -");
            System.out.println("-          7. Explicación Char                   -");
            System.out.println("-          8. Explicación Boolean                -");
            System.out.println("-          0. Volver al menú principal           -");
            System.out.println("==================================================");
            System.out.print("Seleccione un tipo de dato: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarByte();
                    break;
                case 2:
                    mostrarShort();
                    break;
                case 3:
                    mostrarInt();
                    break;
                case 4:
                    mostrarLong();
                    break;
                case 5:
                    mostrarFloat();
                    break;
                case 6:
                    mostrarDouble();
                    break;
                case 7:
                    mostrarChar();
                    break;
                case 8:
                    mostrarBoolean();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    menu.mostrarMenu();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción entre 0 y 8.");
            }

            if (opcion != 0) {
                System.out.println("\nPresione Enter para volver al menú de datos primitivos...");
                scanner.nextLine();
            }

        } while (opcion != 0);

        scanner.close(); // Cerrar el escáner al finalizar
    }

            private void mostrarByte() {
                System.out.println("Byte:");
                System.out.println("  Un tipo de dato que puede almacenar números enteros de 8 bits.");
                System.out.println("  Rango: -128 a 127.");
                System.out.println("  Ejemplo:");
                System.out.println("  byte numeroByte = 100;");
                System.out.println();
            }

            private void mostrarShort() {
                System.out.println("Short:");
                System.out.println("  Un tipo de dato que puede almacenar números enteros de 16 bits.");
                System.out.println("  Rango: -32,768 a 32,767.");
                System.out.println("  Ejemplo:");
                System.out.println("  short numeroShort = 30000;");
                System.out.println();
            }

            private void mostrarInt() {
                System.out.println("Int:");
                System.out.println("  Un tipo de dato que puede almacenar números enteros de 32 bits.");
                System.out.println("  Rango: -2^31 a 2^31-1.");
                System.out.println("  Ejemplo:");
                System.out.println("  int numeroInt = 100000;");
                System.out.println();
            }

            private void mostrarLong() {
                System.out.println("Long:");
                System.out.println("  Un tipo de dato que puede almacenar números enteros de 64 bits.");
                System.out.println("  Rango: -2^63 a 2^63-1.");
                System.out.println("  Ejemplo:");
                System.out.println("  long numeroLong = 10000000000L;");
                System.out.println();
            }

            private void mostrarFloat() {
                System.out.println("Float:");
                System.out.println("  Un tipo de dato que puede almacenar números en punto flotante de precisión simple (32 bits).");
                System.out.println("  Rango aproximado: 1.4e-45 a 3.4e+38.");
                System.out.println("  Ejemplo:");
                System.out.println("  float numeroFloat = 3.14f;");
                System.out.println();
            }

            private void mostrarDouble() {
                System.out.println("Double:");
                System.out.println("  Un tipo de dato que puede almacenar números en punto flotante de doble precisión (64 bits).");
                System.out.println("  Rango aproximado: 4.9e-324 a 1.7e+308.");
                System.out.println("  Ejemplo:");
                System.out.println("  double numeroDouble = 3.14159265359;");
                System.out.println();
            }

            private void mostrarChar() {
                System.out.println("Char:");
                System.out.println("  Un tipo de dato que puede almacenar un solo carácter en formato Unicode.");
                System.out.println("  Ejemplo:");
                System.out.println("  char letra = 'A';");
                System.out.println();
            }

            private void mostrarBoolean() {
                System.out.println("Boolean:");
                System.out.println("  Un tipo de dato que puede almacenar solo dos valores: true o false.");
                System.out.println("  Ejemplo:");
                System.out.println("  boolean esVerdadero = true;");
                System.out.println();
            }
}
