public class ConfiguracionTienda  {

private String nombre_tienda;
private String direccion;
private double moneda;


public ConfiguracionTienda(String nombre_tienda, String direccion, double moneda) {
    this.nombre_tienda = nombre_tienda;
    this.direccion = direccion;
    this.moneda = moneda;
}


public String getNombre_tienda() {
    return nombre_tienda;
}


public void setNombre_tienda(String nombre_tienda) {
    this.nombre_tienda = nombre_tienda;
}


public String getDireccion() {
    return direccion;
}


public void setDireccion(String direccion) {
    this.direccion = direccion;
}


public double getMoneda() {
    return moneda;
}


public void setMoneda(double moneda) {
    this.moneda = moneda;
}

}
