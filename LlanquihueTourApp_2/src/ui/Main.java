package ui;

import data.GestorServicios;

/**
 * Clase principal del programa Llanquihue tour.
 */
public class Main
{
    public static void main(String[] args)
    {
        GestorServicios gestor = new GestorServicios();

        gestor.mostrarServicios();
    }
}
