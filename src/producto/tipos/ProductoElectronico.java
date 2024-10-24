package producto.tipos;
import producto.Producto;

public class ProductoElectronico extends Producto {
    private String garantia;

    public ProductoElectronico(String nombre, double precio, int stock, String garantia ) {
        super(nombre, precio, stock);
        this.garantia= garantia;
    

}
