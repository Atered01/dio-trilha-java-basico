public class Carro extends Veiculo {

    public void ligar() {
        //Se voce retirar o confereCambio e confereCombustivel eles não
        //apareceram no autodromo.java
        confereCombio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }
    private void confereCombustivel(){
        System.out.println("Verificando o combustível...");
    }
    private void confereCombio(){
        System.out.println("Verificando o cambio...");
    }
}
