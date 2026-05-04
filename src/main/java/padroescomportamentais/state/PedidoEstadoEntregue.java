package padroescomportamentais.state;

public class PedidoEstadoEntregue extends PedidoEstado {
    private static PedidoEstadoEntregue instance = new PedidoEstadoEntregue();
    private PedidoEstadoEntregue() {}
    public static PedidoEstadoEntregue getInstance() { return instance; }

    public String getEstado() { return "Entregue"; }
}
