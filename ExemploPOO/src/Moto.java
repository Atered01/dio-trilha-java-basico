//exemplo de herença usa o "extends"
public class Moto extends Veiculo{
    @Override
    public void ligar() {
        confereGuidao();
        conferePedals();
        System.out.println("Moto ligada");
    }

    private void confereGuidao(){
        System.out.println("conferindo guidao");
    }

    private void conferePedals(){
        System.out.println("conferindo pedals");
    }
}
