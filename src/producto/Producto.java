package producto;
public abstract class Producto {
protected String nombre;
protected double precio;
protected int stock;

public Producto(String nombre, double precio, int stock) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
}

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public double getPrecio() {
    return precio;
}
public void setPrecio(double precio) {
    this.precio = precio;
}
public int getStok() {
    return stock;
}
public void setStok(int stock) {
    this.stock = stock;
}

}
