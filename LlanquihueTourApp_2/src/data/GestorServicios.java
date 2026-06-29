package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

/**
 * Clase encargada de crear y mostrar servicios turísticos a través del método mostrarServicios.
 */
public class GestorServicios
{
    public void mostrarServicios()
    {
        /**
         * Crea al menos dos instancias de cada tipo de servicio turístico
         * y las muestra por consola.
         */
        RutaGastronomica ruta1 =
                new RutaGastronomica("Ruta de los Quesos", 5, 6);

        RutaGastronomica ruta2 =
                new RutaGastronomica("Sabores del Sur", 4, 5);

        PaseoLacustre paseo1 =
                new PaseoLacustre("Lago Llanquihue", 3, "Catamarán");

        PaseoLacustre paseo2 =
                new PaseoLacustre("Todos los Santos", 2, "Lancha");

        ExcursionCultural excursion1 =
                new ExcursionCultural("Puerto Varas", 4, "Museo Pablo Fierro");

        ExcursionCultural excursion2 =
                new ExcursionCultural("Frutillar", 3, "Teatro del Lago");

        System.out.println(ruta1);
        System.out.println();

        System.out.println(ruta2);
        System.out.println();

        System.out.println(paseo1);
        System.out.println();

        System.out.println(paseo2);
        System.out.println();

        System.out.println(excursion1);
        System.out.println();

        System.out.println(excursion2);
    }
}
