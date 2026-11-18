package ec.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

public class MainPedidos implements QuarkusApplication{

    @Inject 
    PedidoService pedidoService;

    public static void main(String[] args) {
        Quarkus.run(MainPedidos.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Inicio Evaluacion");

        Pedido pedido1 = new Pedido("POO1", "Laptop", 1000.00, TipoCliente.VIP);

        Pedido pedido2 = new Pedido("POO2", "Mouse", 100.00, TipoCliente.NORMAL);

        Pedido pedido3 = new Pedido("POO3", "Teclado", 200.00, TipoCliente.VIP);

        pedidoService.procesar(pedido1);
        pedidoService.procesar(pedido2);
        pedidoService.procesar(pedido3);

        System.out.println("172219-dd");

        return 0;
    }

}
