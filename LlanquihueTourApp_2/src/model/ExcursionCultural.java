package model;

/**
 * Clase que representa una excursión cultural.
 */
public class ExcursionCultural extends ServicioTuristico
{
    /**
     * Variables de una excursión cultural.
     */
    private String lugarHistorico;

    /**
     * Constructor que inicializa las variables.
     */
    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico)
    {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    /**
     * Constructor vacío.
     */
    public ExcursionCultural()
    {

    }

    /**
     * Get y Set de las variables.
     */
    public String getLugarHistorico()
    {
        return lugarHistorico;
    }
    public void setLugarHistorico(String lugarHistorico)
    {
        this.lugarHistorico = lugarHistorico;
    }

    /**
     * Devuelve la información de una excursión cultural.
     */
    @Override
    public String toString()
    {
        return "Excursión Cultural\n" +
                super.toString() +
                "\nLugar histórico = " + lugarHistorico;
    }
}
