
package exposicion_composicion;

public class text_expo {
    public static void main (String [] args ) {
        EXPOSICION_COMPOSICION p = new EXPOSICION_COMPOSICION();
        p.setFecha("10/06/2003");
        p.setNombre("Jorge Sierra");
        AsignarDatos(p);
    }
        
    public static void AsignarDatos(EXPOSICION_COMPOSICION p) {
        System.out.println(p.getNombre()+" nacio el "+ p.getFecha()); 
    }
        
 }




