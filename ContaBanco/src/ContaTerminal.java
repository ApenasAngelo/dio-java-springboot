import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        String agencia;
        String nome;
        double saldo = 0.0;

        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a agência:");
        agencia = scanner.nextLine();
        if (!agencia.contains("-"))
            agencia = new StringBuilder(agencia).insert(agencia.length() - 1, "-").toString();

        System.out.println("Digite o nome do titular:");
        nome = scanner.nextLine();

        System.out.println("Digite o saldo inicial:");
        saldo = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %#.2f já está disponível para saque",
                nome, agencia, numero, saldo));

    }
}