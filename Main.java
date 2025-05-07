package proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<CredencialEvento> credenciales = new ArrayList<>();
    private static CredencialEvento plantillaBase = new CredencialEvento();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConfiguracionEvento config = ConfiguracionEvento.getInstancia();

        int opcion;
        do {
            mostrarMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next(); // Limpiar entrada inválida
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    crearCredencial(scanner);
                    break;
                case 2:
                    mostrarCredenciales();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=== Generador de Credenciales de Evento ===");
        System.out.println("1. Crear nueva credencial");
        System.out.println("2. Ver credenciales creadas");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opcion: ");
    }

    private static void crearCredencial(Scanner scanner) {
        System.out.print("Ingrese el nombre del asistente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Ingrese el RUT: ");
        String rut = scanner.nextLine();

        CredencialEvento nuevaCredencial = plantillaBase.clone();
        nuevaCredencial.setNombreAsistente(nombre);
        nuevaCredencial.setCargo(cargo);
        nuevaCredencial.setRut(rut);

        credenciales.add(nuevaCredencial);
        System.out.println("Credencial creada exitosamente.");
    }

    private static void mostrarCredenciales() {
        if (credenciales.isEmpty()) {
            System.out.println("No hay credenciales creadas.");
        } else {
            System.out.println("\n=== Lista de Credenciales ===");
            for (int i = 0; i < credenciales.size(); i++) {
                System.out.println((i + 1) + ". " + credenciales.get(i));
            }
        }
    }
}
