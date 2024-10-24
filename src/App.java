import pedido.Pedido;
import producto.Producto;
import producto.tipos.ProductoAlimenticio;
import producto.tipos.ProductoElectronico;

public class App {
    public static void main(String[] args) throws Exception {

        Pedido pedio = new Pedido();

        ProductoAlimenticio nvopa = new ProductoAlimenticio("pollo", 50, 20, "2029/10/15");
        ProductoElectronico nvopb = new ProductoElectronico("azucar", 20, 15, "garantia hasta 2024/11/18") ;

      Producto pedido[]= { nvopa, nvopb};
       
    


        //recordar el array
        //String a[tipo_a,tipo_b];

/*
for (String string : args) {
    
} */


        System.out.println("Hello, World!");
    }
}
/*o Cree 2 pedidos de cada tipo y almacenelos en un mismo arreglo
o Cree dos pedidos, cada uno con 2 productos uno de cada tipo.
o Mediante un foreach itere sobre el arreglo y muestre de cada pedido el total.
o Muestre la información de la tienda accediendo a sus propiedades */