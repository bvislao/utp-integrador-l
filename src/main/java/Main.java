import bussiness.Venta;
import domain.Linea;

public class Main {

    public static void main(String[] args) {
        // Create a new sale
        Venta venta = new Venta();

        // Add lines to the sale
        venta.addLinea(new Linea("001", "Product 1", 10.0, 2));
        venta.addLinea(new Linea("002", "Product 2", 20.0, 1));

        // Print the lines in the sale
        /*System.out.println("Lines in the sale:");
         venta.getListLinea().forEach(linea -> {
            System.out.println("Codigo: " + linea.getCodigo());
            System.out.println("Nombre: " + linea.getNombre());
            System.out.println("Precio: " + linea.getPrecio());
            System.out.println("Cantidad: " + linea.getCantidad());
        });*/


        for(Linea linea : venta.getListLinea()){
            System.out.println("Codigo: " + linea.getCodigo() + " - " + "Nombre: " + linea.getNombre() + " - " + "Precio: " + linea.getPrecio() + " - " + "Cantidad: " + linea.getCantidad());
            System.out.println("************************************************************************");

        }

        // Calculate total
        System.out.println("Total: " + venta.getTotal());

      /*  // Remove a line
        venta.removeLinea(venta.getListLinea().get(0));
*/
        // Calculate total again
        //System.out.println("Total after removal: " + venta.getTotal());
    }
}
