package pedido;
import java.util.ArrayList;
import java.util.List;

import pagos.PagoPayPal;
import pagos.PagoTarjetaCredito;
import producto.Producto;

public class Pedido {

    PagoPayPal paypal= new PagoPayPal();
    PagoTarjetaCredito tarjeta_credito = new PagoTarjetaCredito();
    List<Producto> productos = new ArrayList<>();

    public void agregar_producto(String producto, int cantidad){
        

        //int salario=cantidad;
    }
    public void calcular_total(){

        double total =0 ;
        

    }
    public void procesar_pedido(String metodo_pago){
        if () {
            
            
        }else{


        }

       /*  Un método procesar_pedido(metodo_pago) que procese el pago del total
utilizando un objeto(TC y Paypal) que implemente MetodoPago. */

    }
}
/*Una lista de productos.
▪ Un método agregar_producto(producto, cantidad) que agregue productos al
pedido.
▪ Un método calcular_total() que calcule el costo total de los productos en el
pedido.
▪ Un método procesar_pedido(metodo_pago) que procese el pago del total
utilizando un objeto que implemente MetodoPago. 


. Consideraciones en la lógica de pédidos:
o Si uno de los productos en el pedido es de tipo ProductoAlimenticio y su
fecha_expiracion es anterior a la fecha actual, debe enviar un mensaje que indique que el
producto está vencido y no puede ser agregado al pedido.
o En la clase Pedido, valida si hay suficiente stock de cada producto antes de agregarlo al
carrito. Si no hay suficiente, se debe lanzar una excepción.


o En el método procesar_pedido(), si el método de pago devuelve un error (por ejemplo,
fondos insuficientes), el pedido no debe completarse y se debe lanzar una excepción de
error de pago.
*/