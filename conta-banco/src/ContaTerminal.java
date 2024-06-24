import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Recolhendo as informações do cliente
        System.out.println("Digite o numero da conta ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite sua agência ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu saldo");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem para o cliente com as informações dadas

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}
