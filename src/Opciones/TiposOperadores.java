package Opciones;

import java.util.Scanner;
import menus.Menu;
public class TiposOperadores {

    private Scanner scanner = new Scanner(System.in);
    private Menu menu;

    public TiposOperadores(Menu menu){
        this.menu = menu;
    }

    public void mostrar() {

        int opcion;

        do {

            System.out.println("==================================================");
            System.out.println("-               TIPOS DE OPERADORES              -");
            System.out.println("==================================================");
            System.out.println("-          1. Operadores Aritméticos             -");
            System.out.println("-          2. Operadores Relacionales            -");
            System.out.println("-          3. Operadores Lógicos                 -");
            System.out.println("-          4. Operadores de Asignación           -");
            System.out.println("-          5. Operadores de Incremento/Decremento-");
            System.out.println("-          0. Volver al menú principal           -");
            System.out.println("==================================================");
            System.out.print("Seleccione un tipo de operador: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarAritmeticos();
                    break;
                case 2:
                    mostrarRelacionales();
                    break;
                case 3:
                    mostrarLogicos();
                    break;
                case 4:
                    mostrarAsignacion();
                    break;
                case 5:
                    mostrarIncrementoDecremento();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    menu.mostrarMenu();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción entre 0 y 5.");
            }

            if (opcion != 0) {
                System.out.println("\nPresione Enter para volver al menú de String...");
                scanner.nextLine();
            }

        } while (opcion != 0);

        scanner.close();
    }
                    private void mostrarAritmeticos() {
                        System.out.println("Operadores Aritméticos:");
                        System.out.println("Se utilizan para realizar operaciones matemáticas.");
                        System.out.println("Ejemplo:");
                        System.out.println("int suma = 5 + 3;   // Resultado: 8");
                        System.out.println("int resta = 5 - 3;  // Resultado: 2");
                        System.out.println("int producto = 5 * 3;  // Resultado: 15");
                        System.out.println("int division = 5 / 3;  // Resultado: 1");
                        System.out.println("int modulo = 5 % 3;   // Resultado: 2");
                    }
                    private void mostrarRelacionales() {
                        System.out.println("Operadores Relacionales:");
                        System.out.println("Se utilizan para comparar dos valores.");
                        System.out.println("Ejemplo:");
                        System.out.println("int a = 5, b = 3;");
                        System.out.println("boolean resultado = a > b;  // true");
                        System.out.println("resultado = a < b;  // false");
                        System.out.println("resultado = a == b; // false");
                        System.out.println("resultado = a != b; // true");
                    }
                    private void mostrarLogicos() {
                        System.out.println("Operadores Lógicos:");
                        System.out.println("Se utilizan para realizar operaciones lógicas.");
                        System.out.println("Ejemplo:");
                        System.out.println("boolean a = true, b = false;");
                        System.out.println("boolean resultado = a && b;  // false");
                        System.out.println("resultado = a || b;  // true");
                        System.out.println("resultado = !a;  // false");
                    }

                    private void mostrarAsignacion() {
                        System.out.println("Operadores de Asignación:");
                        System.out.println("Se utilizan para asignar valores a las variables.");
                        System.out.println("Ejemplo:");
                        System.out.println("int x = 5;");
                        System.out.println("x += 3;  // x = x + 3;  Resultado: 8");
                        System.out.println("x -= 2;  // x = x - 2;  Resultado: 6");
                        System.out.println("x *= 2;  // x = x * 2;  Resultado: 12");
                        System.out.println("x /= 3;  // x = x / 3;  Resultado: 4");
                    }
                    private void mostrarIncrementoDecremento() {
                        System.out.println("Operadores de Incremento/Decremento:");
                        System.out.println("Se utilizan para incrementar o decrementar el valor de una variable.");
                        System.out.println("Ejemplo:");
                        System.out.println("int x = 5;");
                        System.out.println("x++;  // Incrementa en 1: Resultado: 6");
                        System.out.println("x--;  // Decrementa en 1: Resultado: 5");
                    }

        }