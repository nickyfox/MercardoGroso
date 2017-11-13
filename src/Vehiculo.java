import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicole on 11/13/17.
 */
public abstract class Vehiculo {
    String patente;
    int pesoMinimo;
    int pesoMaximo;
    List<Paquete> paquetes = new ArrayList<>();

    public Vehiculo(String patente, int pesoMinimo, int pesoMaximo) {
        this.patente = patente;
        this.pesoMinimo = pesoMinimo;
        this.pesoMaximo = pesoMaximo;
    }

    public int getPesoMinimo() {
        return pesoMinimo;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }



}
