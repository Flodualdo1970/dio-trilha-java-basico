import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        // Criar um Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler o número da conta
        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        // Solicitar e ler a agência
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        // Solicitar e ler o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        // Solicitar e ler o saldo
        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        // Fechar o scanner
        scanner.close();

        // Formatar e exibir a mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
                          + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
    }
}
INSERT INTO `tributacoes` (`nroloja`, `codigo`, `percentual`, `Identificacao`, `descricao`, `ativa`, `sittrib`, `flgpaf_anexoV_P2`, `md5`) VALUES ('1', 'E', '22.50', '?', '22.5 %', '1', '014', '0', '7dfcda4bc19e68a8039bcc9efda91dc5'); 

INSERT INTO `converteTributacao` (`nroloja`, `codTrib`, `reducao`, `tributacao`, `tiporetag`) VALUES ('1', 'T2250', '', 'E', '16');