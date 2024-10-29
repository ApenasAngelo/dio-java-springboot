public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        iphone.tocar();
        iphone.selecionarMusica("Stairway to Heaven");
        iphone.tocar();
        iphone.pausar();
        iphone.ligar("+5521912345678");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("https://www.apple.com/br/");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://www.apple.com/br/");
        iphone.atualizarPagina();
    }
}