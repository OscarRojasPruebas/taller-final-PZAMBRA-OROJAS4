package utilidades; // Indica que esta clase pertenece al paquete utilidades

import java.util.Scanner;

public class Opciones {
    private Scanner scanner = new Scanner(System.in); // Para manejar entradas adicionales del usuario

    public void mostrarDatosPrimitivos() {
        int opcion;

        // Muestra el submenú de datos primitivos
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

        // Proporciona la información correspondiente según la opción seleccionada
        switch (opcion) {
            case 1:
                System.out.println("Byte:");
                System.out.println("Un tipo de dato que puede almacenar números enteros de 8 bits.");
                System.out.println("Rango: -128 a 127.");
                System.out.println("Ejemplo:");
                System.out.println("byte numeroByte = 100;");
                break;
            case 2:
                System.out.println("Short:");
                System.out.println("Un tipo de dato que puede almacenar números enteros de 16 bits.");
                System.out.println("Rango: -32,768 a 32,767.");
                System.out.println("Ejemplo:");
                System.out.println("short numeroShort = 30000;");
                break;
            case 3:
                System.out.println("Int:");
                System.out.println("Un tipo de dato que puede almacenar números enteros de 32 bits.");
                System.out.println("Rango: -2^31 a 2^31-1.");
                System.out.println("Ejemplo:");
                System.out.println("int numeroInt = 100000;");
                break;
            case 4:
                System.out.println("Long:");
                System.out.println("Un tipo de dato que puede almacenar números enteros de 64 bits.");
                System.out.println("Rango: -2^63 a 2^63-1.");
                System.out.println("Ejemplo:");
                System.out.println("long numeroLong = 10000000000L;");
                break;
            case 5:
                System.out.println("Float:");
                System.out.println("Un tipo de dato que puede almacenar números en punto flotante de precisión simple (32 bits).");
                System.out.println("Rango aproximado: 1.4e-45 a 3.4e+38.");
                System.out.println("Ejemplo:");
                System.out.println("float numeroFloat = 3.14f;");
                break;
            case 6:
                System.out.println("Double:");
                System.out.println("Un tipo de dato que puede almacenar números en punto flotante de doble precisión (64 bits).");
                System.out.println("Rango aproximado: 4.9e-324 a 1.7e+308.");
                System.out.println("Ejemplo:");
                System.out.println("double numeroDouble = 3.14159265359;");
                break;
            case 7:
                System.out.println("Char:");
                System.out.println("Un tipo de dato que puede almacenar un solo carácter en formato Unicode.");
                System.out.println("Ejemplo:");
                System.out.println("char letra = 'A';");
                break;
            case 8:
                System.out.println("Boolean:");
                System.out.println("Un tipo de dato que puede almacenar solo dos valores: true o false.");
                System.out.println("Ejemplo:");
                System.out.println("boolean esVerdadero = true;");
                break;
            case 0:
                System.out.println("Volviendo al menú principal...");
                return; // Salir del método para regresar al menú principal
            default:
                System.out.println("Opción no válida. Por favor, elija una opción entre 0 y 8.");
        }

        // Espera a que el usuario presione Enter para regresar al menú principal
        System.out.println("\nPresione Enter para volver al menú principal...");
        scanner.nextLine(); // Captura el salto de línea
        scanner.nextLine(); // Espera por la tecla Enter
    }

    public void mostrarString() {
        int desicion;

        // Muestra el submenú de String
        System.out.println("==================================================");
        System.out.println("-                    STRING                      -");
        System.out.println("==================================================");
        System.out.println("-          1. Explicación de String              -");
        System.out.println("-          2. Programa con String                -");
        System.out.println("-          0. Volver al menú principal           -");
        System.out.println("==================================================");
        System.out.print("Seleccione una opción: ");
        desicion = scanner.nextInt();

        // Proporciona la información correspondiente según la opción seleccionada
        switch (desicion) {
            case 1:
                System.out.println("String en Java:");
                System.out.println("Una cadena de texto (String) es un objeto que representa una secuencia de caracteres.");
                System.out.println("Las cadenas son inmutables, lo que significa que no pueden ser modificadas una vez creadas.");
                System.out.println("Ejemplo:");
                System.out.println("String nombre = \"Juan\";");
                System.out.println("System.out.println(nombre); // Resultado: Juan");
                break;
            case 2:
                // Aquí ejecutaremos un programa práctico que usa String
                ejecutarProgramaString();
                break;
            case 0:
                System.out.println("Volviendo al menú principal...");
                return; // Salir del método para regresar al menú principal
            default:
                System.out.println("Opción no válida. Por favor, elija una opción entre 0 y 2.");
        }

        // Espera a que el usuario presione Enter para regresar al menú principal
        System.out.println("\nPresione Enter para volver al menú principal...");
        scanner.nextLine(); // Captura el salto de línea
        scanner.nextLine(); // Espera por la tecla Enter
    }

    // Programa sencillo que utiliza String
    public void ejecutarProgramaString() {
        System.out.println("==================================================");
        System.out.println("-              PROGRAMA CON STRING               -");
        System.out.println("==================================================");

        // Solicita al usuario que introduzca un texto
        System.out.print("Introduce un texto: ");
        scanner.nextLine(); // Captura el salto de línea
        String texto = scanner.nextLine();

        // Realizamos algunas operaciones básicas con la cadena
        System.out.println("\nOperaciones con la cadena:");
        System.out.println("Texto introducido: " + texto);
        System.out.println("Longitud del texto: " + texto.length());
        System.out.println("Texto en mayúsculas: " + texto.toUpperCase());
        System.out.println("Texto en minúsculas: " + texto.toLowerCase());

        // Comprobamos si el texto contiene una palabra específica
        System.out.print("\nIntroduce una palabra para buscar en el texto: ");
        String palabra = scanner.nextLine();
        if (texto.contains(palabra)) {
            System.out.println("La palabra \"" + palabra + "\" está presente en el texto.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no está presente en el texto.");
        }

        System.out.println("Fin del programa con String.");
    }
    public void mostrarConstantes() {
        int desicion;

        // Muestra el submenú de Constantes
        System.out.println("==================================================");
        System.out.println("-                  CONSTANTES                    -");
        System.out.println("==================================================");
        System.out.println("-          1. Explicación de Constantes          -");
        System.out.println("-          2. Programa con Constantes            -");
        System.out.println("-          0. Volver al menú principal           -");
        System.out.println("==================================================");
        System.out.print("Seleccione una opción: ");
        desicion = scanner.nextInt(); // Usamos 'desicion' aquí

        // Proporciona la información correspondiente según la opción seleccionada
        switch (desicion) {
            case 1:
                System.out.println("Constantes en Java:");
                System.out.println("Una constante es un valor que no cambia durante la ejecución del programa.");
                System.out.println("Se declaran usando la palabra clave `final`.");
                System.out.println("Ejemplo:");
                System.out.println("final double PI = 3.14159;");
                System.out.println("PI no puede ser cambiado después de ser asignado.");
                break;
            case 2:
                // Aquí ejecutaremos un programa práctico que usa Constantes
                ejecutarProgramaConstantes();
                break;
            case 0:
                System.out.println("Volviendo al menú principal...");
                return; // Salir del método para regresar al menú principal
            default:
                System.out.println("Opción no válida. Por favor, elija una opción entre 0 y 2.");
        }

        // Espera a que el usuario presione Enter para regresar al menú principal
        System.out.println("\nPresione Enter para volver al menú principal...");
        scanner.nextLine(); // Captura el salto de línea
        scanner.nextLine(); // Espera por la tecla Enter
    }

    // Programa sencillo que utiliza Constantes
    public void ejecutarProgramaConstantes() {
        System.out.println("==================================================");
        System.out.println("-           PROGRAMA CON CONSTANTES              -");
        System.out.println("==================================================");

        // Declaramos una constante
        final double PI = 3.14159;

        // Solicita al usuario que introduzca el radio de un círculo
        System.out.print("Introduce el radio de un círculo: ");
        double radio = scanner.nextDouble();

        // Calculamos el área y la circunferencia usando la constante PI
        double area = PI * radio * radio;
        double circunferencia = 2 * PI * radio;

        // Mostramos los resultados
        System.out.println("\nResultados:");
        System.out.println("Área del círculo: " + area);
        System.out.println("Circunferencia del círculo: " + circunferencia);

        System.out.println("Fin del programa con Constantes.");
    }
    public void mostrarOperadores() {
        int desicion;

        // Muestra el submenú de operadores
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
        desicion = scanner.nextInt(); // Usamos 'desicion' aquí

        // Proporciona la información correspondiente según el tipo de operador seleccionado
        switch (desicion) {
            case 1:
                System.out.println("Operadores Aritméticos:");
                System.out.println("Se utilizan para realizar operaciones matemáticas.");
                System.out.println("Ejemplo:");
                System.out.println("int suma = 5 + 3;   // Resultado: 8");
                System.out.println("int resta = 5 - 3;  // Resultado: 2");
                System.out.println("int producto = 5 * 3;  // Resultado: 15");
                System.out.println("int division = 5 / 3;  // Resultado: 1");
                System.out.println("int modulo = 5 % 3;   // Resultado: 2");
                break;
            case 2:
                System.out.println("Operadores Relacionales:");
                System.out.println("Se utilizan para comparar dos valores.");
                System.out.println("Ejemplo:");
                System.out.println("int a = 5, b = 3;");
                System.out.println("boolean resultado = a > b;  // true");
                System.out.println("resultado = a < b;  // false");
                System.out.println("resultado = a == b; // false");
                System.out.println("resultado = a != b; // true");
                break;
            case 3:
                System.out.println("Operadores Lógicos:");
                System.out.println("Se utilizan para realizar operaciones lógicas.");
                System.out.println("Ejemplo:");
                System.out.println("boolean a = true, b = false;");
                System.out.println("boolean resultado = a && b;  // false");
                System.out.println("resultado = a || b;  // true");
                System.out.println("resultado = !a;  // false");
                break;
            case 4:
                System.out.println("Operadores de Asignación:");
                System.out.println("Se utilizan para asignar valores a las variables.");
                System.out.println("Ejemplo:");
                System.out.println("int x = 5;");
                System.out.println("x += 3;  // x = x + 3;  Resultado: 8");
                System.out.println("x -= 2;  // x = x - 2;  Resultado: 6");
                System.out.println("x *= 2;  // x = x * 2;  Resultado: 12");
                System.out.println("x /= 3;  // x = x / 3;  Resultado: 4");
                break;
            case 5:
                System.out.println("Operadores de Incremento/Decremento:");
                System.out.println("Se utilizan para incrementar o decrementar el valor de una variable.");
                System.out.println("Ejemplo:");
                System.out.println("int x = 5;");
                System.out.println("x++;  // Incrementa en 1: Resultado: 6");
                System.out.println("x--;  // Decrementa en 1: Resultado: 5");
                break;
            case 0:
                System.out.println("Volviendo al menú principal...");
                return; // Salir del método para regresar al menú principal
            default:
                System.out.println("Opción no válida. Por favor, elija una opción entre 0 y 5.");
        }

        // Espera a que el usuario presione Enter para regresar al menú principal
        System.out.println("\nPresione Enter para volver al menú principal...");
        scanner.nextLine(); // Captura el salto de línea
        scanner.nextLine(); // Espera por la tecla Enter
    }

    public void mostrarIfElse() {
        int desicion;

        // Muestra el submenú de condicionales IF, ELSE IF, ELSE
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
        desicion = scanner.nextInt(); // Usamos 'desicion' aquí

        // Proporciona la información correspondiente según la opción seleccionada
        switch (desicion) {
            case 1:
                System.out.println("Condicional IF:");
                System.out.println("La declaración IF ejecuta un bloque de código si la condición es verdadera.");
                System.out.println("Ejemplo:");
                System.out.println("int numero = 5;");
                System.out.println("if (numero > 3) {");
                System.out.println("    System.out.println(\"El número es mayor que 3\");");
                System.out.println("} // Resultado: El número es mayor que 3");
                break;
            case 2:
                System.out.println("Condicional ELSE IF:");
                System.out.println("Se utiliza para probar otra condición si la primera condición IF es falsa.");
                System.out.println("Ejemplo:");
                System.out.println("int numero = 5;");
                System.out.println("if (numero > 5) {");
                System.out.println("    System.out.println(\"El número es mayor que 5\");");
                System.out.println("} else if (numero == 5) {");
                System.out.println("    System.out.println(\"El número es igual a 5\");");
                System.out.println("} // Resultado: El número es igual a 5");
                break;
            case 3:
                System.out.println("Condicional ELSE:");
                System.out.println("Se ejecuta cuando ninguna de las condiciones anteriores es verdadera.");
                System.out.println("Ejemplo:");
                System.out.println("int numero = 2;");
                System.out.println("if (numero > 5) {");
                System.out.println("    System.out.println(\"El número es mayor que 5\");");
                System.out.println("} else {");
                System.out.println("    System.out.println(\"El número es menor o igual a 5\");");
                System.out.println("} // Resultado: El número es menor o igual a 5");
                break;
            case 4:
                // Aquí ejecutaremos un programa práctico que usa IF, ELSE IF y ELSE
                ejecutarProgramaIfElse();
                break;
            case 0:
                System.out.println("Volviendo al menú principal...");
                return; // Salir del método para regresar al menú principal
            default:
                System.out.println("Opción no válida. Por favor, elija una opción entre 0 y 4.");
        }

        // Espera a que el usuario presione Enter para regresar al menú principal
        System.out.println("\nPresione Enter para volver al menú principal...");
        scanner.nextLine(); // Captura el salto de línea
        scanner.nextLine(); // Espera por la tecla Enter
    }

    // Programa sencillo que utiliza IF, ELSE IF, ELSE
    public void ejecutarProgramaIfElse() {
        System.out.println("==================================================");
        System.out.println("-        PROGRAMA IF, ELSE IF, ELSE              -");
        System.out.println("==================================================");
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        // Estructura condicional para evaluar el número
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
    public void mostrarSwitch() {
        int desicion;

        // Muestra el submenú de condicional Switch
        System.out.println("==================================================");
        System.out.println("-                    SWITCH                      -");
        System.out.println("==================================================");
        System.out.println("-          1. Explicación de Switch              -");
        System.out.println("-          2. Programa de Switch                 -");
        System.out.println("-          0. Volver al menú principal           -");
        System.out.println("==================================================");
        System.out.print("Seleccione una opción: ");
        desicion = scanner.nextInt(); // Usamos 'desicion' aquí

        // Proporciona la información correspondiente según la opción seleccionada
        switch (desicion) {
            case 1:
                System.out.println("Condicional Switch:");
                System.out.println("La declaración `switch` permite seleccionar entre múltiples opciones.");
                System.out.println("Se utiliza cuando hay varias alternativas para una misma variable.");
                System.out.println("Ejemplo:");
                System.out.println("int dia = 3;");
                System.out.println("switch (dia) {");
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
                System.out.println("} // Resultado: Miércoles");
                break;
            case 2:
                // Aquí ejecutaremos un programa práctico que usa Switch
                ejecutarProgramaSwitch();
                break;
            case 0:
                System.out.println("Volviendo al menú principal...");
                return; // Salir del método para regresar al menú principal
            default:
                System.out.println("Opción no válida. Por favor, elija una opción entre 0 y 2.");
        }

        // Espera a que el usuario presione Enter para regresar al menú principal
        System.out.println("\nPresione Enter para volver al menú principal...");
        scanner.nextLine(); // Captura el salto de línea
        scanner.nextLine(); // Espera por la tecla Enter
    }

    // Programa sencillo que utiliza Switch
    public void ejecutarProgramaSwitch() {
        System.out.println("==================================================");
        System.out.println("-              PROGRAMA CON SWITCH               -");
        System.out.println("==================================================");
        System.out.print("Introduce un número del 1 al 5: ");
        int numero = scanner.nextInt();

        // Estructura switch para evaluar el número
        switch (numero) {
            case 1:
                System.out.println("El número es 1.");
                break;
            case 2:
                System.out.println("El número es 2.");
                break;
            case 3:
                System.out.println("El número es 3.");
                break;
            case 4:
                System.out.println("El número es 4.");
                break;
            case 5:
                System.out.println("El número es 5.");
                break;
            default:
                System.out.println("Número no válido. Introduce un número entre 1 y 5.");
        }
    }
    public void mostrarTernaria() {
        int desicion;

        // Muestra el submenú de Condicional Ternaria
        System.out.println("==================================================");
        System.out.println("-              CONDICIONAL TERNARIA              -");
        System.out.println("==================================================");
        System.out.println("-          1. Explicación de Ternaria            -");
        System.out.println("-          2. Programa con Ternaria              -");
        System.out.println("-          0. Volver al menú principal           -");
        System.out.println("==================================================");
        System.out.print("Seleccione una opción: ");
        desicion = scanner.nextInt(); // Usamos 'desicion' aquí

        // Proporciona la información correspondiente según la opción seleccionada
        switch (desicion) {
            case 1:
                System.out.println("Operador Ternario:");
                System.out.println("La operación ternaria es una forma simplificada de escribir un `if-else`.");
                System.out.println("Su sintaxis es: `condicion ? valor_si_true : valor_si_false`.");
                System.out.println("Ejemplo:");
                System.out.println("int numero = 10;");
                System.out.println("String resultado = (numero > 5) ? \"Mayor a 5\" : \"Menor o igual a 5\";");
                System.out.println("System.out.println(resultado); // Resultado: Mayor a 5");
                break;
            case 2:
                // Aquí ejecutaremos un programa práctico que usa la Operación Ternaria
                ejecutarProgramaTernaria();
                break;
            case 0:
                System.out.println("Volviendo al menú principal...");
                return; // Salir del método para regresar al menú principal
            default:
                System.out.println("Opción no válida. Por favor, elija una opción entre 0 y 2.");
        }

        // Espera a que el usuario presione Enter para regresar al menú principal
        System.out.println("\nPresione Enter para volver al menú principal...");
        scanner.nextLine(); // Captura el salto de línea
        scanner.nextLine(); // Espera por la tecla Enter
    }

    // Programa sencillo que utiliza la operación ternaria
    public void ejecutarProgramaTernaria() {
        System.out.println("==================================================");
        System.out.println("-            PROGRAMA CON TERNARIA               -");
        System.out.println("==================================================");

        // Solicita al usuario que introduzca un número
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        // Usamos la operación ternaria para determinar si el número es par o impar
        String resultado = (numero % 2 == 0) ? "El número es Par" : "El número es Impar";

        // Mostramos el resultado
        System.out.println("\nResultado:");
        System.out.println(resultado);

        System.out.println("Fin del programa con Ternaria.");
    }
    public void mostrarDoWhile() {
        int desicion;

        // Muestra el submenú de Bucle DO WHILE
        System.out.println("==================================================");
        System.out.println("-                   DO WHILE                     -");
        System.out.println("==================================================");
        System.out.println("-          1. Explicación de DO WHILE            -");
        System.out.println("-          2. Programa de DO WHILE               -");
        System.out.println("-          0. Volver al menú principal           -");
        System.out.println("==================================================");
        System.out.print("Seleccione una opción: ");
        desicion = scanner.nextInt(); // Usamos 'desicion' aquí

        // Proporciona la información correspondiente según la opción seleccionada
        switch (desicion) {
            case 1:
                System.out.println("Bucle DO WHILE:");
                System.out.println("El bucle `do-while` ejecuta un bloque de código al menos una vez, y luego repite");
                System.out.println("la ejecución mientras la condición sea verdadera.");
                System.out.println("Ejemplo:");
                System.out.println("int i = 1;");
                System.out.println("do {");
                System.out.println("    System.out.println(i);");
                System.out.println("    i++;");
                System.out.println("} while (i <= 5);");
                System.out.println("// Resultado: 1 2 3 4 5");
                break;
            case 2:
                // Aquí ejecutaremos un programa práctico que usa DO WHILE
                ejecutarProgramaDoWhile();
                break;
            case 0:
                System.out.println("Volviendo al menú principal...");
                return; // Salir del método para regresar al menú principal
            default:
                System.out.println("Opción no válida. Por favor, elija una opción entre 0 y 2.");
        }

        // Espera a que el usuario presione Enter para regresar al menú principal
        System.out.println("\nPresione Enter para volver al menú principal...");
        scanner.nextLine(); // Captura el salto de línea
        scanner.nextLine(); // Espera por la tecla Enter
    }

    // Programa sencillo que utiliza DO WHILE
    public void ejecutarProgramaDoWhile() {
        System.out.println("==================================================");
        System.out.println("-              PROGRAMA CON DO WHILE             -");
        System.out.println("==================================================");
        System.out.println("El programa finalizará cuando el número ingresado sea 0.");
        int numero;
        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();
            System.out.println("Has introducido: " + numero);
        } while (numero != 0);
        System.out.println("Fin del bucle DO WHILE.");
    }
    public void mostrarWhile() {
        int desicion;

        // Muestra el submenú de Bucle WHILE
        System.out.println("==================================================");
        System.out.println("-                   BUCLE WHILE                  -");
        System.out.println("==================================================");
        System.out.println("-          1. Explicación de WHILE               -");
        System.out.println("-          2. Programa de WHILE                  -");
        System.out.println("-          0. Volver al menú principal           -");
        System.out.println("==================================================");
        System.out.print("Seleccione una opción: ");
        desicion = scanner.nextInt(); // Usamos 'desicion' aquí

        // Proporciona la información correspondiente según la opción seleccionada
        switch (desicion) {
            case 1:
                System.out.println("Bucle WHILE:");
                System.out.println("El bucle `while` evalúa la condición antes de ejecutar el bloque de código.");
                System.out.println("Se ejecutará el bloque mientras la condición sea verdadera.");
                System.out.println("Ejemplo:");
                System.out.println("int i = 1;");
                System.out.println("while (i <= 5) {");
                System.out.println("    System.out.println(i);");
                System.out.println("    i++;");
                System.out.println("}");
                System.out.println("// Resultado: 1 2 3 4 5");
                break;
            case 2:
                // Aquí ejecutaremos un programa práctico que usa WHILE
                ejecutarProgramaWhile();
                break;
            case 0:
                System.out.println("Volviendo al menú principal...");
                return; // Salir del método para regresar al menú principal
            default:
                System.out.println("Opción no válida. Por favor, elija una opción entre 0 y 2.");
        }

        // Espera a que el usuario presione Enter para regresar al menú principal
        System.out.println("\nPresione Enter para volver al menú principal...");
        scanner.nextLine(); // Captura el salto de línea
        scanner.nextLine(); // Espera por la tecla Enter
    }

    // Programa sencillo que utiliza WHILE
    public void ejecutarProgramaWhile() {
        System.out.println("==================================================");
        System.out.println("-              PROGRAMA CON WHILE                -");
        System.out.println("==================================================");
        System.out.println("Este programa imprimirá números del 1 al 5.");

        int i = 1;
        while (i <= 5) {
            System.out.println("Número: " + i);
            i++; // Incrementa el valor de i en cada iteración
        }
        System.out.println("Fin del bucle WHILE.");
    }

    // Otros métodos como mostrarDatosPrimitivos(), mostrarDoWhile(), etc.

    public void mostrarFor() {
        int desicion; // Usamos 'desicion' en lugar de 'opcion'

        // Muestra el submenú de Bucle FOR
        System.out.println("==================================================");
        System.out.println("-                   BUCLE FOR                    -");
        System.out.println("==================================================");
        System.out.println("-          1. Explicación de FOR                 -");
        System.out.println("-          2. Programa de FOR                    -");
        System.out.println("-          0. Volver al menú principal           -");
        System.out.println("==================================================");
        System.out.print("Seleccione una opción: ");
        desicion = scanner.nextInt(); // Usamos 'desicion' aquí

        // Proporciona la información correspondiente según la opción seleccionada
        switch (desicion) {
            case 1:
                System.out.println("Bucle FOR:");
                System.out.println("El bucle `for` permite iterar un número determinado de veces.");
                System.out.println("Está compuesto por tres partes: inicialización, condición, e incremento.");
                System.out.println("Ejemplo:");
                System.out.println("for (int i = 1; i <= 5; i++) {");
                System.out.println("    System.out.println(i);");
                System.out.println("}");
                System.out.println("// Resultado: 1 2 3 4 5");
                break;
            case 2:
                // Aquí ejecutaremos un programa práctico que usa FOR
                ejecutarProgramaFor();
                break;
            case 0:
                System.out.println("Volviendo al menú principal...");
                return; // Salir del método para regresar al menú principal
            default:
                System.out.println("Opción no válida. Por favor, elija una opción entre 0 y 2.");
        }

        // Espera a que el usuario presione Enter para regresar al menú principal
        System.out.println("\nPresione Enter para volver al menú principal...");
        scanner.nextLine(); // Captura el salto de línea
        scanner.nextLine(); // Espera por la tecla Enter
    }

    // Programa sencillo que utiliza FOR
    public void ejecutarProgramaFor() {
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

