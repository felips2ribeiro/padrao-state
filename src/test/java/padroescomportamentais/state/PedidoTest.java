package padroescomportamentais.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveIniciarComoPendente() {
        Pedido pedido = new Pedido();
        assertEquals("Pendente", pedido.getNomeEstado());
    }

    @Test
    void devePagarPedidoPendente() {
        Pedido pedido = new Pedido();
        assertTrue(pedido.pagar());
        assertEquals("Pago", pedido.getNomeEstado());
    }

    @Test
    void deveCancelarPedidoPendente() {
        Pedido pedido = new Pedido();
        assertTrue(pedido.cancelar());
        assertEquals("Cancelado", pedido.getNomeEstado());
    }

    @Test
    void deveEnviarPedidoPago() {
        Pedido pedido = new Pedido();
        pedido.pagar();
        assertTrue(pedido.enviar());
        assertEquals("Enviado", pedido.getNomeEstado());
    }

    @Test
    void naoDeveEntregarPedidoPendente() {
        Pedido pedido = new Pedido();
        assertFalse(pedido.entregar());
        assertEquals("Pendente", pedido.getNomeEstado());
    }

    @Test
    void deveEntregarPedidoEnviado() {
        Pedido pedido = new Pedido();
        pedido.pagar();
        pedido.enviar();
        assertTrue(pedido.entregar());
        assertEquals("Entregue", pedido.getNomeEstado());
    }

    @Test
    void naoDeveCancelarPedidoEnviado() {
        Pedido pedido = new Pedido();
        pedido.pagar();
        pedido.enviar();
        assertFalse(pedido.cancelar());
        assertEquals("Enviado", pedido.getNomeEstado());
    }
}
