package model;

/**
 * Clase que representa un paseo Lacustre.
 */
public class PaseoLacustre extends ServicioTuristico
{
    /**
     * Variables de Paseo Lacustre.
     */
    private String tipoEmbarcacion;

    /**
     * Constructor que inicializa las variables.
     */
    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion)
    {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    /**
     * Constructor vacío.
     */
    public PaseoLacustre()
    {

    }

    /**
     * Get y Set de las variables.
     */
    public String getTipoEmbarcacion()
    {
        return tipoEmbarcacion;
    }
    public void setTipoEmbarcacion(String tipoEmbarcacion)
    {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    /**
     * Override que devuelve la información del Paseo Lacustre.
     */
    @Override
    public String toString()
    {
        return "Paseo Lacustre\n" +
                super.toString() +
                "\nTipo de embarcación = " + tipoEmbarcacion;
    }
}
