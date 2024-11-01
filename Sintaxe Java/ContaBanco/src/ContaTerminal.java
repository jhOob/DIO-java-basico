import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criação do objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();  // `next()` para leitura de texto sem espaços

        System.out.println("Por favor, digite seu nome!");
        scanner.nextLine();  // Limpa o buffer do `nextInt()` anterior
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo!");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem final usando concatenação
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                           "sua agência é " + agencia + ", conta " + numero + 
                           " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
