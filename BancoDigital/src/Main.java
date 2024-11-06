public class Main {
    public static void main(String[] args) {
        Banco BB = new Banco("001");
        Banco Inter = new Banco("077");
        Banco Caixa = new Banco("104");

        Cliente Miguel = new Cliente("Miguel");

        Conta corrente = Inter.abrirContaCorrente(Miguel);
        Conta correnteBB = BB.abrirContaCorrente(Miguel);
        Conta poupanca = Inter.abrirContaPoupanca(Miguel);

        corrente.depositar(200);
        corrente.transferir(poupanca, 100);
        corrente.transferir(correnteBB, 50);
    }
}