import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 1600;

        System.out.println("Por favor informe seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor informe o número da Agencia:");
        int agencia = scanner.nextInt();

        System.out.println("Por favor informe o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + " Da " + agencia + " com o numero da conta " + numeroConta + " seu saldo é de " + saldo + " e já esta disponivel para saque");
    }
}
