//Exemplo de encapsulamento
public class Autodromo {
    public static void main(String[] args) {
        Carro uno = new Carro();
        uno.setChassi("20201");
        //uno.ligar();

        Moto titan = new Moto();
        titan.setChassi("2101420");
        //titan.ligar();

        //Polimorfismo
        Veiculo ferrari = uno;
        ferrari.ligar();
    }
}
