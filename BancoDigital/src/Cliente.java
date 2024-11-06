import java.util.ArrayList;
import java.util.Objects;

public class Cliente {
    private final String nome;
    private ArrayList<Conta> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<Conta>();
    }

    public String getNome() {
        return nome;
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public Conta getConta(int numero) {
        return contas.stream()
                .filter(conta -> conta.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }
}