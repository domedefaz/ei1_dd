package ec.edu.uce.pa.paquete.extensiones;

import ec.edu.uce.pa.paquete.Pedido;
import ec.edu.uce.pa.paquete.TipoCliente;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoVIP implements DescuentoExtension{

    @Override
    public boolean aplica(Pedido pedido) {
        
        return pedido.getTipoCliente() == TipoCliente.VIP;
    }

    @Override
    public double calcularTotal(Pedido pedido) {
        
        return pedido.getValorOriginal() * 0.90;
    }

}
