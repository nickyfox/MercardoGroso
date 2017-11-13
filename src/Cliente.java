import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicole on 11/13/17.
 */
public class Cliente {
    int dni;
    int codigoPostal;
    String nombre;
    List<Articulo> articulosEnEspera = new ArrayList<>();
    List<Articulo> articulosRecibidos = new ArrayList<>();

    public Cliente(int dni, int codigoPostal, String nombre) {
        this.dni = dni;
        this.codigoPostal = codigoPostal;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public List<Articulo> getArticulosEnEspera() {
        return articulosEnEspera;
    }

    public List<Articulo> getArticulosRecibidos() {
        return articulosRecibidos;
    }
}
