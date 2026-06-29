package model;

/**
 * Clase que representa un servicio turístico.
 */
public class ServicioTuristico
{
    /**
     * Variables de un servicio turístico.
     */
    private String nombre;
    private int duracionHoras;

    /**
     * Constructor que inicializa los atributos.
     */
    public ServicioTuristico(String nombre, int duracionHoras)
    {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    /**
     * Constructor vacío.
     */
    public ServicioTuristico()
    {

    }

    /**
     * Get y Set de las variables .
     */
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getDuracionHoras()
    {
        return duracionHoras;
    }
    public void setDuracionHoras(int duracionHoras)
    {
        this.duracionHoras = duracionHoras;
    }

    /**
     * Override que devuelve la información de un servicio turístico.
     */
    @Override
    public String toString()
    {
        return "Nombre = '" + nombre + '\'' +
                "\nDuración = " + duracionHoras + " horas";
    }
}
