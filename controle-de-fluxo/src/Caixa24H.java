public class Caixa24H {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSacado = 29.0;

        if(valorSacado < saldo){ //condição se for verdadeiro ou não
            saldo = saldo - valorSacado;   
        System.out.println("Novo saldo " + saldo);
        }

        else 
            System.out.println("Saldo vazio " + saldo);


        
    }
}