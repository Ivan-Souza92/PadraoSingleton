import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    public void calculoPedido(){
        Pedido.getInstance().calcularPedido(3,2);
        assertEquals(11,Pedido.getInstance().getTotal());
    }

    @Test
    public void clienteNome(){
        Pedido.getInstance().setNomeCliente("Teste do Nome");
        assertEquals("Teste do Nome", Pedido.getInstance().getNomeCliente());
    }

    @Test
    public void enderecoCliente(){

        Pedido.getInstance().setEndereco("Rua X");
        assertEquals("Rua X", Pedido.getInstance().getEndereco());
    }

}
