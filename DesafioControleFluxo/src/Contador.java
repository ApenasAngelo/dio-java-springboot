import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();
        scanner.nextLine();

        try {
            contar(parametroUm, parametroDois);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        scanner.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}