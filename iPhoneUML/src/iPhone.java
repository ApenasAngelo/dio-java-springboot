public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    Boolean isPaused = true;
    String musicaAtual = "";

    Boolean isInCall = false;

    Integer openTabs = 0;

    // Implementação dos métodos do ReprodutorMusical
    @Override
    public void tocar() {
        if (isPaused) {
            if (musicaAtual.isEmpty()) {
                System.out.println("Nenhuma musica para tocar.");
            } else {
                System.out.println("Reproduzindo música: " + musicaAtual);
                isPaused = !isPaused;
            }
        } else {
            System.out.println("Já existe uma música tocando.");
        }
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
        isPaused = true;
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musicaAtual);
    }

    // Implementação dos métodos do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        if (isInCall) {
            System.out.println("Já existe uma chamada em andamento.");
            return;
        }
        System.out.println("Ligando para " + numero);
        isInCall = true;
    }

    @Override
    public void atender() {
        if (isInCall) {
            System.out.println("Colocando chamada atual em espera...");
        }
        System.out.println("Atendendo chamada...");
        isInCall = true;
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        if (openTabs == 0) {
            System.out.println("Nenhuma aba aberta, por favor abra uma.");
        } else {
            System.out.println("Exibindo página: " + url);
        }
    }

    @Override
    public void adicionarNovaAba() {
        openTabs++;
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
