package producto.tipos;
import producto.Producto;

public class ProductoAlimenticio extends Producto {

    private String fecha_expiracion;


    public ProductoAlimenticio(String nombre, double precio, int stock, String fechaExpiracion) {
        super(nombre, precio, stock);
        this.fecha_expiracion= fechaExpiracion;
    }

}
