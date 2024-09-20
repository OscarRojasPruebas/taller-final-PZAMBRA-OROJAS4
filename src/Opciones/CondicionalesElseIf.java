package Opciones;

import java.util.Scanner;
import menus.Menu;
public class CondicionalesElseIf {

    private Scanner scanner = new Scanner(System.in);
    private Menu menu;

    public CondicionalesElseIf(Menu menu){
        this.menu = menu;
    }

    public void mostrar() {

        int opcion;

        do {
            System.out.println("==================================================");
            System.out.println("-               IF, ELSE IF, ELSE                -");
            System.out.println("==================================================");
            System.out.println("-          1. Explicación de IF                  -");
            System.out.println("-          2. Explicación de ELSE IF             -");
            System.out.println("-          3. Explicación de ELSE                -");
            System.out.println("-          4. Programa de IF, ELSE IF, ELSE      -"); // Nueva opción para ejecutar un programa
            System.out.println("-          0. Volver al menú principal           -");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarIf();
                    break;
                case 2:
                    mostrarElseIf();
                    break;
                case 3:
                    mostrarEls();
                    break;
                case 4:
                    mostrarProgramaIf();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    menu.mostrarMenu();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción entre 0 y 4.");
            }

            if (opcion != 0) {
                System.out.println("\nPresione Enter para volver al menú de String...");
                scanner.nextLine(); // Espera por la tecla Enter
            }

        } while (opcion != 0); // Permitir volver al menú principal

        scanner.close(); // Cerrar el escáner al finalizar
    }

                 private void mostrarIf() {
                     System.out.println("===============================================");
                     System.out.println("              Condicional IF                 ");
                     System.out.println("===============================================\n");
                     System.out.println("La declaración IF ejecuta un bloque de código si la condición es verdadera.");
                     System.out.println("Ejemplo:");
                     System.out.println("int numero = 5;");
                     System.out.println("if (numero > 3) {");
                     System.out.println("    System.out.println(\"El número es mayor que 3\");");
                     System.out.println("} // Resultado: El número es mayor que 3\n");
                    }
                 private void mostrarElseIf() {
                     System.out.println("===============================================");
                     System.out.println("            Condicional ELSE IF              ");
                     System.out.println("===============================================\n");
                     System.out.println("Se utiliza para probar otra condición si la primera condición IF es falsa.");
                     System.out.println("Ejemplo:");
                     System.out.println("int numero = 5;");
                     System.out.println("if (numero > 5) {");
                     System.out.println("    System.out.println(\"El número es mayor que 5\");");
                     System.out.println("} else if (numero == 5) {");
                     System.out.println("    System.out.println(\"El número es igual a 5\");");
                     System.out.println("} // Resultado: El número es igual a 5\n");
                 }
                 private void mostrarEls() {
                     System.out.println("===============================================");
                     System.out.println("                Condicional ELSE              ");
                     System.out.println("===============================================\n");
                     System.out.println("Se ejecuta cuando ninguna de las condiciones anteriores es verdadera.");
                     System.out.println("Ejemplo:");
                     System.out.println("int numero = 2;");
                     System.out.println("if (numero > 5) {");
                     System.out.println("    System.out.println(\"El número es mayor que 5\");");
                     System.out.println("} else {");
                     System.out.println("    System.out.println(\"El número es menor o igual a 5\");");
                     System.out.println("} // Resultado: El número es menor o igual a 5\n");
                 }
                private void mostrarProgramaIf() {
                    // Aquí ejecutaremos un programa práctico que usa IF, ELSE IF y ELSE
                    System.out.print("Introduce tu calificación (0-100): ");

                    // Verificamos si la entrada es un número
                    if (scanner.hasNextInt()) {
                        int calificacion = scanner.nextInt();

                        if (calificacion >= 90) {
                            System.out.println("Excelente! Has obtenido una A.");
                        } else if (calificacion >= 80) {
                            System.out.println("Muy bien! Has obtenido una B.");
                        } else if (calificacion >= 70) {
                            System.out.println("Bien! Has obtenido una C.");
                        } else if (calificacion >= 60) {
                            System.out.println("Suficiente! Has obtenido una D.");
                        } else if (calificacion >= 0) {
                            System.out.println("Insuficiente! Has obtenido una F.");
                        } else {
                            System.out.println("Calificación no válida. Debe estar entre 0 y 100.");
                        }
                    } else {
                        System.out.println("Entrada no válida. Debes introducir un número.");
                        scanner.next(); // Limpiar el buffer
                    }
                }
}
