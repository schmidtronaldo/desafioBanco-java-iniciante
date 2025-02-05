
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    private static final int AGENCIA_LENGTH = 4;
    private static final int CONTA_LENGTH = 6;
    private static final double SALDO_MAXIMO = 500.0;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            String agencia = solicitarAgencia(scanner);
            int numeroConta = solicitarNumeroConta(scanner);
            String nomeCliente = solicitarNomeCliente(scanner);
            double saldo = gerarSaldoAleatorio(random);

            exibirMensagemFinal(nomeCliente, agencia, numeroConta, saldo);
        }
    }

    private static String solicitarAgencia(Scanner scanner) {
        while (true) {
            System.out.print("Por favor, digite o número da Agência (" + AGENCIA_LENGTH + " dígitos): ");
            String agencia = scanner.nextLine();

            if (agencia.length() == AGENCIA_LENGTH && agencia.matches("[0-9]+")) {
                return agencia;
            } else {
                System.out.println("Número de agência inválido. Digite exatamente " + AGENCIA_LENGTH + " dígitos numéricos.");
            }
        }
    }

    private static int solicitarNumeroConta(Scanner scanner) {
        while (true) {
            System.out.print("Digite o número da conta (" + CONTA_LENGTH + " dígitos): ");
            String input = scanner.nextLine();

            if (input.length() == CONTA_LENGTH && input.matches("[0-9]+")) {
                return Integer.parseInt(input);
            } else {
                System.out.println("Número de conta inválido. Digite exatamente " + CONTA_LENGTH + " dígitos numéricos.");
            }
        }
    }

    private static String solicitarNomeCliente(Scanner scanner) {
        System.out.print("Digite o nome do cliente: ");
        return scanner.nextLine();
    }

    private static double gerarSaldoAleatorio(Random random) {
        System.out.println("Verificando saldo ...");
        return random.nextDouble() * SALDO_MAXIMO;
    }

    private static void exibirMensagemFinal(String nomeCliente, String agencia, int numeroConta, double saldo) {
        System.out.println("\nOlá " + nomeCliente.toUpperCase() + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo é R$" + String.format("%.2f", saldo) + ".");
        System.out.println("Seu saldo já está disponível para saque.");
    }
}