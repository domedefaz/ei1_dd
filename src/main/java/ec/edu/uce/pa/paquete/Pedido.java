package ec.edu.uce.pa.paquete;

public class Pedido {

    private String codigo;
    private String producto;
    private double valorOriginal;
    private TipoCliente tipoCliente;

    public Pedido(String codigo, String producto, double valorOriginal, TipoCliente tipoCliente) {
        this.codigo = codigo;
        this.producto = producto;
        this.tipoCliente = tipoCliente;
        this.valorOriginal = valorOriginal;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProducto() {
        return producto;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }


    

}
