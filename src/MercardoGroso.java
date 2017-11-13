import java.util.ArrayList;
import java.util.List;

public class MercardoGroso {
    List<Articulo> articulos = new ArrayList<>();
    List<Vehiculo> vehiculos = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();
    List<Paquete> paquetes = new ArrayList<>();
    List<Factura> facturas = new ArrayList<>();
    List<OrdenRechazada> ordenesRechazadas = new ArrayList<>();
    List<Paquete> enviosPendientes = new ArrayList<>();

   public void venta(Cliente cliente, String codigoDeArticulo){
      Articulo articulo = getArticulo(codigoDeArticulo);

      int dni = cliente.getDni();
      int codigoPostal = cliente.getCodigoPostal();

      Paquete paquete = new Paquete(articulo, dni, codigoPostal);

      paquetes.add(paquete);
      enviosPendientes.add(paquete);
   }

   public Articulo getArticulo(String codigoDeArticulo) {
       for (Articulo articulo : articulos) {
           articulo.getCodigo().equals(codigoDeArticulo);
           return articulo;
       }
    throw new RuntimeException("No existe el articulo.");
    }

    public void agregarCliente(Cliente cliente){
       clientes.add(cliente);
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }







}
