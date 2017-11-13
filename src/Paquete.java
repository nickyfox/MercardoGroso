/**
 * Created by Nicole on 11/13/17.
 */
public class Paquete {
    Articulo articulo;
    int dni;
    int codigoPostal;

    public Paquete(Articulo articulo, int dni, int codigoPostal) {
        this.articulo = articulo;
        this.codigoPostal = codigoPostal;
        this.dni = dni;
    }
}
