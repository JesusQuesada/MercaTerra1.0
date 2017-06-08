
package mercaterra;


import basedatos.Metodos;
import login.Intro;
/**
 *
 * @author jquesadaabeijon
 */
public class MercaTerra {
    
    public static void main(String[] args) {
        
        Metodos met = new Metodos();
        met.conectar();
        met.crearClientes();
        met.crearCarrito();
        met.crearProductos();
        
        Intro ven = new Intro();
        ven.setVisible(true);
        
        
    }
    
}
