package model;

/**
 * Clase que representa un tour turístico.
 */
public class Tour
{

    /**
     * Atributos de un tour turístico.
     */
    private String nombre;
    private String tipo;
    private int precio;

    /**
     * Constructor que inicializa los atributos.
     */
    public Tour(String nombre, String tipo, int precio)
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    /**
     * Constructor vacio.
     */
    public Tour()
    {

    }

    /**
     * Métodos getters y setters de los atributos.
     */
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTipo()
    {
        return tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public int getPrecio()
    {
        return precio;
    }
    public void setPrecio(int precio)
    {
        this.precio = precio;
    }

    /**
     * Método para devolver la información del tour turístico como texto.
     */
    @Override
    public String toString()
    {
        return "Tour {" +
                "nombre = '" + nombre + '\'' +
                ", tipo = '" + tipo + '\'' +
                ", precio = $" + precio +
                '}';
    }
}
