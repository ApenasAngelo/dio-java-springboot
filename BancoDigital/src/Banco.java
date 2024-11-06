import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final String codigo;
    private List<Cliente> clientes;

    public Banco(String codigo) {
        this.codigo = codigo;
        this.clientes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public ContaCorrente abrirContaCorrente(Cliente pessoa) {
        if (!clientes.contains(pessoa)) clientes.add(pessoa);

        return new ContaCorrente(pessoa, this.codigo);
    }

    public ContaPoupanca abrirContaPoupanca(Cliente pessoa) {
        if (!clientes.contains(pessoa)) clientes.add(pessoa);

        return new ContaPoupanca(pessoa, this.codigo);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }
}