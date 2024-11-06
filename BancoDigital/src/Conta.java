public abstract class Conta {
    private static int agencia = 1;
    private static int numeroConta = 1;

    protected Cliente pessoa;
    protected final String codigoBanco;
    protected int numero;
    protected double saldo;

    public Conta(Cliente pessoa, String codigoBanco) {
        this.pessoa = pessoa;
        this.codigoBanco = codigoBanco;
        pessoa.addConta(this);
        this.numero = numeroConta++;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void transferir(Conta destino, double valor) {
        try {
            if (!codigoBanco.equals(destino.codigoBanco))
                throw new BancoDiferenteException(
                        "Transferência entre instituições diferentes não são permitidas.");

            if (sacar(valor)) {
                destino.depositar(valor);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}