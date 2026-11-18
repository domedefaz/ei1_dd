package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.extensiones.DescuentoExtension;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped 
public class DescuentoService {

    private final Instance<DescuentoExtension> descuentos;

    @Inject 
    public DescuentoService(@Any Instance<DescuentoExtension> descuentos){
        this.descuentos = descuentos;

    }

    public double calcular (Pedido pedido) {
        for (DescuentoExtension descuento : descuentos) {
            if (descuento.aplica(pedido)){
                return descuento.calcularTotal(pedido);
            }
        }
        return pedido.getValorOriginal();
    }

}
