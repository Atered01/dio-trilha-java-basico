package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("CONTROLANDO ENTRADA DOS ITENS");
    }

    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIADA DOS ITENS");
    }

    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTE");
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANO O GÁS");
    }
}

