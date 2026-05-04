package padroescomportamentais.state;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        System.out.println("Estado inicial: " + pedido.getNomeEstado());

        System.out.println("Tentando pagar...");
        if (pedido.pagar()) {
            System.out.println("Sucesso! Novo estado: " + pedido.getNomeEstado());
        }

        System.out.println("Tentando enviar...");
        if (pedido.enviar()) {
            System.out.println("Sucesso! Novo estado: " + pedido.getNomeEstado());
        }

        System.out.println("Tentando cancelar (após enviado)...");
        if (!pedido.cancelar()) {
            System.out.println("Falha ao cancelar: Pedido já está enviado.");
        }

        System.out.println("Tentando entregar...");
        if (pedido.entregar()) {
            System.out.println("Sucesso! Novo estado: " + pedido.getNomeEstado());
        }
    }
}
