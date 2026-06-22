package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase encargada de leer los datos desde el archivo de texto.
 */
public class GestorDatos
{
    public ArrayList<Tour> cargarTours(String rutaArchivo)
    {
        /**
         * Lista que almacena los tours creados.
         */
        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo)))
        {
            String linea;

            while ((linea = br.readLine()) != null)
            {
                String[] datos = linea.split(";");

                if (datos.length < 3)
                {
                    System.out.println("Línea ingresada incompleta: " + linea);
                    continue;
                }

                try
                {
                    String nombre = datos[0];
                    String tipo = datos[1];
                    int precio = Integer.parseInt(datos[2]);

                    Tour tour = new Tour(nombre, tipo, precio);
                    tours.add(tour);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Precio inválido en línea: " + linea);
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }


        return tours;
    }
}
