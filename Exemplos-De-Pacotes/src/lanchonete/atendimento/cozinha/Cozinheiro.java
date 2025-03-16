package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICONANDO LANCHE NATAURAL NO BALCAO");

    }
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    public void adicionarComboNoBalcao(){
        adicionarSucoNoBalcao();
        adicionarLancheNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    private void prepararVitamina(){
        System.out.println("PREPARANDO SUCO");
    }

    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIgredientesLanche(){
        System.out.println("SELECIONANDO PÃO, SALADA, OVO E CARNE");
    }
    private void selecionarIgredientesVitamina(){
        System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
    }

    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLidificador(){
        System.out.println("BATENDO VITAMINA LIDIFICADOR");
    }

    public void fritarIngredientesLanche(){
        System.out.println("FRITANDO CARNE E OVO PARA O HAMBURGUER");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
