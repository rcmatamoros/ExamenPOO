package pagos;
import myinterface.IMetodoPago;

public class PagoPayPal implements IMetodoPago{

    @Override
    public double procesar_pago(double monto) {

        System.out.println("Procesando pago mediante PaypPal");

        System.out.println("Estableciendo conexion mediante el correo electronico.......................................");
        System.out.println("Conexion Establecida");

        if (monto >= total) {
            
            System.out.println("Fondos Suficientes);"
            
            return monto - total;
        } else {
              System.out.println("Fondos Insuficientes");
        }
      


        //System.out.println("Error de Conexion ");
        //procesa pagos paypal y simula conexion a cuenta paypal


        throw new UnsupportedOperationException("Unimplemented method 'procesarPago'");
    }

}
