package service;

import model.Tour;

import java.util.ArrayList;

/**
 * Clase que contiene operaciones sobre los tours. En este caso, buscar los tours por nombre y por tipo.
 */
public class TourService
{
    public Tour busquedaPorNombre(ArrayList<Tour> tours, String nombre)
    {
        for (Tour tour : tours)
        {
            if (tour.getNombre().equalsIgnoreCase(nombre))
            {
                return tour;
            }
        }

        return null;
    }

    /**
     * método para filtrar un tour por tipo.
     */
    public void filtrarPorTipo(ArrayList<Tour> tours, String tipo)
    {
        for (Tour tour : tours)
        {
            if (tour.getTipo().equalsIgnoreCase(tipo))
            {
                System.out.println(tour);
            }
        }
    }

    /**
     * método para filtrar un tour por precio.
     */
    public void filtrarPorPrecio(ArrayList<Tour> tours, int precioMinimo)
    {
        for (Tour tour : tours)
        {
            if (tour.getPrecio() > precioMinimo)
            {
                System.out.println(tour);
            }
        }

    }
}
