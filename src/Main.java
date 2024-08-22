//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Participantes: ");
        System.out.println("Oscar Dairo Rojas - Cabeza");
        System.out.println("Paula Andrea Zambrano- Cola");
    }
}*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
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

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado Datos Primitivos.");
                    // Lógica para Datos Primitivos
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
                    System.out.println("-          0. Salir                              -");
                    System.out.println("==================================================");
                    break;
                case 2:
                    System.out.println("Has seleccionado String.");
                    // Lógica para String
                    break;
                case 3:
                    System.out.println("Has seleccionado Constantes.");
                    // Lógica para Constantes
                    break;
                case 4:
                    System.out.println("Has seleccionado Tipo de Operadores.");
                    // Lógica para Tipo de Operadores
                    System.out.println("==================================================");
                    System.out.println("-               TIPO DE OPERADORES               -");
                    System.out.println("==================================================");
                    System.out.println("-          1. Aritméticos                        -");
                    System.out.println("-          2. Relacionales                       -");
                    System.out.println("-          3. Lógicos                            -");
                    System.out.println("-          4. Asignación                         -");
                    System.out.println("-          5. Incremento / Decremento            -");
                    System.out.println("-          0. Salir                              -");
                    System.out.println("==================================================");
                    break;
                case 5:
                    System.out.println("Has seleccionado Condicional IF, ELSE IF ELSE.");
                    // Lógica para Condicional IF, ELSE IF ELSE
                    break;
                case 6:
                    System.out.println("Has seleccionado Condicional Switch.");
                    // Lógica para Condicional Switch
                    break;
                case 7:
                    System.out.println("Has seleccionado Condicional Ternaria.");
                    // Ejemplo de condicional ternaria:
                    System.out.print("Digite un número: ");
                    int numero = scanner.nextInt();
                    String resultado = (numero % 2 == 0) ? "El número " + numero + " es Par" : "El número " + numero + " es Impar";
                    System.out.println(resultado);
                    break;
                case 8:
                    System.out.println("Has seleccionado Bucle DO WHILE.");
                    // Lógica para Bucle DO WHILE
                    break;
                case 9:
                    System.out.println("Has seleccionado Bucle WHILE.");
                    // Lógica para Bucle WHILE
                    break;
                case 10:
                    System.out.println("Has seleccionado Bucle FOR.");
                    // Lógica para Bucle FOR
                    break;
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

        scanner.close();
    }
}