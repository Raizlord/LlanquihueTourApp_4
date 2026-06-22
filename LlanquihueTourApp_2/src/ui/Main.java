package ui;

import data.GestorDatos;
import model.Tour;
import service.TourService;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal del programa Llanquihue tour.
 */
public class Main
{
    public static void main(String[] args)
    {
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> tours = gestor.cargarTours("src/resources/tours.txt");

        TourService service = new TourService();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        /**
         * Muestra opciones de filtrado por consola.
         */
        do
        {
            System.out.println("\n===== MENÚ LLANQUIHUE TOUR =====");
            System.out.println("1. Ver todos los tours");
            System.out.println("2. Filtrar por precio");
            System.out.println("3. Filtrar por tipo");
            System.out.println("4. Buscar por nombre");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion)
            {
                case 1:
                    System.out.println("\n=== TODOS LOS TOURS ===");

                    for (Tour tour : tours)
                    {
                        System.out.println(tour);
                    }
                    break;

                case 2:
                    System.out.print("Ingrese precio mínimo: ");
                    int precio = scanner.nextInt();

                    System.out.println("\n=== TOURS FILTRADOS POR PRECIO ===");
                    service.filtrarPorPrecio(tours, precio);
                    break;

                case 3:
                    System.out.print("Ingrese tipo de tour: ");
                    String tipo = scanner.nextLine();

                    System.out.println("\n=== TOURS FILTRADOS POR TIPO ===");
                    service.filtrarPorTipo(tours, tipo);
                    break;

                case 4:
                    System.out.print("Ingrese nombre del tour: ");
                    String nombre = scanner.nextLine();

                    System.out.println("\n=== RESULTADO DE BÚSQUEDA ===");

                    Tour encontrado = service.busquedaPorNombre(tours, nombre);

                    if (encontrado != null)
                    {
                        System.out.println(encontrado);
                    }
                    else
                    {
                        System.out.println("Tour no encontrado en los registros.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);
    }
}
