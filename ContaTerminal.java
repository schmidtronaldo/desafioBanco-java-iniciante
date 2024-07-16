import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Por favor, digite o número da Agência (4 dígitos): ");
        String agencia = scanner.nextLine();

        if (agencia.length() != 4 || !agencia.matches("[0-9]+")) {
            System.out.println("Número de agência inválido. Digite exatamente 4 dígitos numéricos.");
            scanner.close();
            return;
        }

        System.out.print("Digite o número da conta (6 dígitos): ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        if (numero < 100000 || numero > 999999) {
            System.out.println("Número de conta inválido. Digite exatamente 6 dígitos numéricos.");
            scanner.close();
            return;
        }

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Gerando saldo aleatório...");
        double saldo = random.nextDouble() * 500; // Saldo entre 0 e 500

        System.out.println("\nOlá " + nomeCliente.toUpperCase() + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo + ".");
        System.out.println("Seu saldo já está disponível para saque.");

        scanner.close();
    }
}
