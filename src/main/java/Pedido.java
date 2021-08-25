

public class Pedido {

    private float total;
    private String nomeCliente;
    private String endereco;
    private Pedido() {};
    private static Pedido instance =  new Pedido();

    public static Pedido getInstance(){
        return instance;
    }

    public float calcularPedido(float valor, int quant)
    {
        int frete = 5;
        return this.total = valor * quant + frete;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getTotal() {
        return total;
    }

}
