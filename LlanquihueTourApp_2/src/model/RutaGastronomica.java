package model;

/**
 * Clase que representa una ruta gastronómica que hereda de ServicioTuristico.
 */
public class RutaGastronomica extends ServicioTuristico
{
    /**
     * Variables de una ruta gastronómica.
     */
    private int numeroDeParadas;

    /**
     * Constructor que inicializa las variables.
     */
    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas)
    {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    /**
     * Constructor vacío.
     */
    public RutaGastronomica()
    {

    }

    /**
     * Get y Set de las variables.
     */
    public int getNumeroDeParadas()
    {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas)
    {
        this.numeroDeParadas = numeroDeParadas;
    }

    /**
     * Override que devuelve la información de la ruta gastronómica.
     */
    @Override
    public String toString()
    {
        return "Ruta Gastronómica\n" +
                super.toString() +
                "\nNúmero de paradas = " + numeroDeParadas;
    }
}
