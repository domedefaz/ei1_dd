
package ec.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.Locale;

import ec.edu.uce.pa.paquete.extensiones.NotificacionExtension;
import ec.edu.uce.pa.paquete.interceptors.MedirTiempo;

@ApplicationScoped
public class PedidoService {

    @Inject
    DescuentoService descuentoService;

    private NotificacionExtension notificacion;

    @Inject
    public void configurarNotificacion(
            @Named("correo") NotificacionExtension notificacion) {

        this.notificacion = notificacion;
    }

    @MedirTiempo
    public void procesar(Pedido pedido) {

        double total = descuentoService.calcular(pedido);

        System.out.println(
                "PEDIDO:" + pedido.getCodigo()
                        + "|TOTAL:" + String.format(Locale.US, "%.2f", total));

        notificacion.enviar(
                "NOTIFICACION:" + pedido.getCodigo(),
                "cliente@correo.com");
    }
}
