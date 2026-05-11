package a11;

import java.util.*;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> stockRepuestos = new TreeMap<>();

        stockRepuestos.put("BUJ-001", 50);
        stockRepuestos.put("ACE-020", 15);
        stockRepuestos.put("FIL-102", 30);
        stockRepuestos.put("BAT-005", 10);

        for (Map.Entry<String, Integer> producto : stockRepuestos.entrySet()) {
            System.out.println("Producto: " + producto.getKey() +
                    " | Unidades: " + producto.getValue());
        }

        boolean salir = false;

        while (!salir) {

            System.out.println("\nMenu de selección de acciones");
            System.out.println("1. Dar de alta");
            System.out.println("2. Dar de baja");
            System.out.println("3. Actualizar stock");
            System.out.println("4. Listar");
            System.out.println("5. Salir");
            System.out.print("Escriba la opción deseada: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1 -> {
                    System.out.print("Ingrese el código del producto: ");
                    String clave1 = sc.nextLine();

                    if (stockRepuestos.containsKey(clave1)) {
                        System.out.println("Error: ya existe.");
                    } else {
                        System.out.print("Ingrese las unidades: ");
                        int valor1 = sc.nextInt();
                        sc.nextLine();

                        stockRepuestos.put(clave1, valor1);
                        System.out.println("Alta realizada con éxito.");
                    }
                }

                case 2 -> {
                    System.out.print("Ingrese el código del producto: ");
                    String clave1 = sc.nextLine();

                    if (stockRepuestos.containsKey(clave1)) {
                        stockRepuestos.remove(clave1);
                        System.out.println("Eliminado con éxito.");
                    } else {
                        System.out.println("No existe ese producto.");
                    }
                }

                case 3 -> {
                    System.out.print("Ingrese el código del producto: ");
                    String clave1 = sc.nextLine();

                    if (stockRepuestos.containsKey(clave1)) {
                        System.out.print("Nuevas unidades: ");
                        int valor1 = sc.nextInt();
                        sc.nextLine();

                        stockRepuestos.put(clave1, valor1);
                    } else {
                        System.out.println("No existe ese producto.");
                    }
                }

                case 4 -> {
                    System.out.println("Listado de existencias:");

                    for (Map.Entry<String, Integer> producto : stockRepuestos.entrySet()) {
                        System.out.println("Código: " + producto.getKey() +
                                " | Unidades: " + producto.getValue());
                    }
                }

                case 5 -> {
                    System.out.println("Saliendo del programa...");
                    salir = true;
                }

                default -> System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}