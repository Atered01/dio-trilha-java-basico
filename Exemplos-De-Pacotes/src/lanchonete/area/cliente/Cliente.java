package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("Escolha um lanche");
    }

    public void fazerPedido() {
        System.out.println("Fazendo um pedido");
    }

    public void pagarConta() {
        consultarSaldoAplicativo();
        System.out.println("Pagando uma conta");
    }

    private void consultarSaldoAplicativo (){
        System.out.println("Consultando saldo aplicativo");
    }

}
