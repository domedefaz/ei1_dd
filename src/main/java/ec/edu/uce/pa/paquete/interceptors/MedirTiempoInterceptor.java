package ec.edu.uce.pa.paquete.interceptors;

import ec.edu.uce.pa.paquete.Pedido;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor 
@Priority (Interceptor.Priority.APPLICATION +10)
public class MedirTiempoInterceptor {

    @AroundInvoke
    public Object medir(InvocationContext context) throws Exception {
        long inicio = System.currentTimeMillis();
        Object resultado = context.proceed();
        long fin = System.currentTimeMillis();
        long duracion = fin - inicio;
        
        Pedido pedido = (Pedido) context.getParameters()[0];
        System.out.println("DURACION: " + pedido.getCodigo() + "[MS]: " + duracion);
        System.out.println("TIMEMPO: " + pedido.getCodigo() + "[OK]");

        return resultado;
    }
    
    

}
