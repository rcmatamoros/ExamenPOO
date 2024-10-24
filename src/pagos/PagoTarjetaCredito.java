package pagos;
import myinterface.IMetodoPago;

public class PagoTarjetaCredito  implements IMetodoPago{

    @Override
    public double procesar_pago(double monto) {

      //  monto = nombre precio 
System.out.println("Procesando pago con Tarjeta de Credito");
System.out.println("Estableciendo conexion con la base de datos para verificar fondos .......................................");

//Aqui va un else
System.out.println("Fondos Suficientes");
//System.out.println("Fondos insuficientes");


      //PagoTarjetaCredito: procesa pagos con tarjeta de crédito y simula la verificación de fondos
       //monto = producto.calcular_total();
      //puedo agregar propiedades y metodos?
        throw new UnsupportedOperationException("Unimplemented method 'procesarPago'");
    }

}
