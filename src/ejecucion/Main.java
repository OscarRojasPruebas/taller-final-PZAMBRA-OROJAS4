package ejecucion; // Indica que esta clase pertenece al paquete ejecucion

import menus.Menu; // Importa la clase Menu del paquete menus

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();  // Instancia la clase Menu
        menu.mostrarMenu();      // Llama al método para mostrar el menú
    }
}
