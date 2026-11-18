package ec.edu.uce.pa.paquete.extensiones;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("correo")
public class NotificacionExtensionMail implements NotificacionExtension {

    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println(mensaje);
    }
}