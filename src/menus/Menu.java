package menus; // Indica que esta clase pertenece al paquete menus

 // Importa la clase Opciones del paquete utilidades
import java.util.Scanner;
import Opciones.CondicionalTernaria;
import Opciones.BucleDoWhile;
import Opciones.*;

public class Menu {
    private Scanner scanner = new Scanner(System.in); // Para capturar la entrada del usuario
    private int opcion; // Opción seleccionada por el usuario

    public void mostrarMenu() {

        int opcion;

        do {
            // Muestra el menú principal
            System.out.println("==================================================");
            System.out.println("-        MENÚ CAPÍTULO DE PROGRAMACIÓN           -");
            System.out.println("-          PAULA ZAMBRANO/OSCAR ROJAS            -");
            System.out.println("-                 PZAMBRA/OROJAS4                -");
            System.out.println("==================================================");
            System.out.println("-          1. Datos Primitivos.                  -");
            System.out.println("-          2. String.                            -");
            System.out.println("-          3. Constantes.                        -");
            System.out.println("-          4. Tipo de operadores.                -");
            System.out.println("-          5. Condicional IF, ELSE IF ELSE.      -");
            System.out.println("-          6. Condicional Switch.                -");
            System.out.println("-          7. Condicional Ternaria.              -");
            System.out.println("-          8. Bucle DO WHILE.                    -");
            System.out.println("-          9. Bucle WHILE.                       -");
            System.out.println("-          10. Bucle FOR.                        -");
            System.out.println("-          11. Salir.                            -");
            System.out.println("==================================================");
            System.out.print("Digite su opción: ");
            opcion = scanner.nextInt();


            // Llama al método correspondiente según la opción seleccionada
            switch (opcion) {
                case 1:
                    new DatosPrimitivos(this).mostrar();
                    break;
                case 2:
                    new OpcionString(this).mostrar();
                    break;
                case 3:
                    new OpcionConstantes(this).mostrar();
                    break;
                case 4:
                    new TiposOperadores(this).mostrar();
                    break;
                case 5:
                    new CondicionalesElseIf(this).mostrar();
                    break;
                case 6:
                    new CondicionalSwitch(this).mostrar();
                    break;
                case 7:
                    new CondicionalTernaria(this).mostrar();
                    break;
                case 8:
                    new BucleDoWhile(this).mostrar();
                    break;
                /*case 9:
                    opciones.mostrarWhile();
                    break;
                case 10:
                    opciones.mostrarFor();
                    break;*/
                case 11:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción entre 1 y 11.");
            }

            if (opcion != 11) {
                System.out.println("\nPresione Enter para continuar...");
                scanner.nextLine(); // Captura el salto de línea
                scanner.nextLine(); // Espera por la tecla Enter
            }

        } while (opcion != 11);

       // scanner.close(); // Cierra el escáner al finalizar
    }
}

