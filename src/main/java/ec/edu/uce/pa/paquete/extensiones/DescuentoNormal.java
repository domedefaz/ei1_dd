package ec.edu.uce.pa.paquete.extensiones;

import ec.edu.uce.pa.paquete.Pedido;
import ec.edu.uce.pa.paquete.TipoCliente;

public class DescuentoNormal implements DescuentoExtension{

    @Override
    public boolean aplica(Pedido pedido) {
       return pedido.getTipoCliente() == TipoCliente.NORMAL;
    }

    @Override
    public double calcularTotal(Pedido pedido) {
       return pedido.getValorOriginal();
    }

}
