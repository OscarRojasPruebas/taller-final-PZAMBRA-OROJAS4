package Opciones;

import java.util.Scanner;
import menus.Menu;
public class CondicionalSwitch {

    private Scanner scanner = new Scanner(System.in);
    private Menu menu;

    public CondicionalSwitch(Menu menu){
        this.menu = menu;
    }

    public void mostrar() {

        int opcion;

        do {
            System.out.println("==================================================");
            System.out.println("-                    SWITCH                      -");
            System.out.println("==================================================");
            System.out.println("-          1. Explicación de Switch              -");
            System.out.println("-          2. Programa de Switch                 -");
            System.out.println("-          0. Volver al menú principal           -");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarSwitch();
                    break;
                case 2:
                    mostrarProgramaSwitch();
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

        scanner.close();
    }

                    private void mostrarSwitch() {
                        System.out.println("===============================================");
                        System.out.println("                Condicional Switch            ");
                        System.out.println("===============================================\n");
                        System.out.println("    La declaración `switch` permite seleccionar entre múltiples opciones.");
                        System.out.println("    Se utiliza cuando hay varias alternativas para una misma variable.\n");
                        System.out.println("    Ejemplo:");
                        System.out.println("    int dia = 3;");
                        System.out.println("    switch (dia) {");
                        System.out.println("    case 1:");
                        System.out.println("        System.out.println(\"Lunes\");");
                        System.out.println("        break;");
                        System.out.println("    case 2:");
                        System.out.println("        System.out.println(\"Martes\");");
                        System.out.println("        break;");
                        System.out.println("    case 3:");
                        System.out.println("        System.out.println(\"Miércoles\");");
                        System.out.println("        break;");
                        System.out.println("    default:");
                        System.out.println("        System.out.println(\"Día no válido\");");
                        System.out.println("    // Resultado: Miércoles");
                    }
                    private void mostrarProgramaSwitch() {
                        System.out.println("===============================================");
                        System.out.println("            Programa de Switch                ");
                        System.out.println("===============================================\n");

                        System.out.print("Introduce un número del 1 al 7 para saber el día de la semana: ");
                        int dia = scanner.nextInt();

                        switch (dia) {
                            case 1:
                                System.out.println("Lunes");
                                break;
                            case 2:
                                System.out.println("Martes");
                                break;
                            case 3:
                                System.out.println("Miércoles");
                                break;
                            case 4:
                                System.out.println("Jueves");
                                break;
                            case 5:
                                System.out.println("Viernes");
                                break;
                            case 6:
                                System.out.println("Sábado");
                                break;
                            case 7:
                                System.out.println("Domingo");
                                break;
                            default:
                                System.out.println("Día no válido. Debe estar entre 1 y 7.");
                                break;
                        }
                    }
        }