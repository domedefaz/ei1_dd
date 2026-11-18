package ec.edu.uce.pa.paquete.extensiones;

import ec.edu.uce.pa.paquete.Pedido;

public interface DescuentoExtension {

    boolean aplica (Pedido pedido);

    double calcularTotal(Pedido pedido);

}
