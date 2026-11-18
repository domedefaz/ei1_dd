package ec.edu.uce.pa.paquete.extensiones;

import ec.edu.uce.pa.paquete.Pedido;
import ec.edu.uce.pa.paquete.TipoCliente;

public class DescuentoFrecuente implements DescuentoExtension{

    @Override
    public boolean aplica(Pedido pedido) {
       return pedido.getTipoCliente() == TipoCliente.FRECUENTE;
    }

    @Override
    public double calcularTotal(Pedido pedido) {
       return pedido.getValorOriginal() * 0.95;
    }

}
