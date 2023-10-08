import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc1 = new Scanner(System.in); // Conhecer e importar a classe Scanner.

        System.out.println(""); // Pula uma linha

        System.out.print("Por favor, digite o número da agência (ex:067-8): "); // Exibir as mensagens para o usuário.
        String agency = sc1.nextLine(); // Obter pelo Scanner os valores digitados no terminal.

        System.out.print("Agora, digite o número da conta (ex:1021): "); // Exibir as mensagens para o usuário.
        int account = sc1.nextInt(); // Obter pelo Scanner os valores digitados no terminal.
        sc1.nextLine(); // Executa a próxima linha

        System.out.print("Agora, digite o seu nome: "); // Exibir as mensagens para o usuário.
        String name = sc1.nextLine(); // Obter pelo Scanner os valores digitados no terminal.

        System.out.print("Agora, digite seu saldo: "); // Exibir as mensagens para o usuário.
        Double balance = sc1.nextDouble(); // Obter pelo Scanner os valores digitados no terminal.

        // Exibir a mensagem conta criada.
        System.out.printf("\nOlá %s obrigado por criar uma conta em nosso banco.\n", name);
        System.out.printf("Sua agência é %s, e a conta: %d\n", agency, account);
        System.out.printf("Seu saldo de %.2f já está disponível para saque.", balance);

        sc1.close();

    }
}
