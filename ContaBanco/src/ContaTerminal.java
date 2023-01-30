import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String agencia;
        agencia = " ";
        int numeroConta;
        String nomeCliente = "Anderson Santos";
        double saldo = 2500.00;

        System.out.println("Por favor, para prosseguir com o cadastramento informe o numero da agência: ");
        agencia = sc.next();

        System.out.println("Informe o numero da sua conta: ");
        numeroConta = sc.nextInt();

        System.out.println("Olá " + nomeCliente + " ! " + "Obrigado por criar uma conta em nosso banco. Sua agência é a " + agencia + "," + "sua conta é a "
                + numeroConta + " " + "e seu saldo atual é " + saldo + " , " + "já disponível para saque!");

        System.out.println("Fim");
    }
}