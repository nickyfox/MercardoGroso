/**
 * Created by Nicole on 11/13/17.
 */
public class Articulo {
    private String codigo;
    private String nombre;
    private double precio;
    private double peso;

    public Articulo(String codigo, String nombre, double precio, double peso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }
}
