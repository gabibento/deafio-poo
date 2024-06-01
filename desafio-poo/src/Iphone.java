public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String musicaAtual;
    private String numeroAtual;
    private String urlAtual;

    @Override
    public void tocar() {
        System.out.println("Tocando a música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música: " + musicaAtual);
    }

    @Override
    public void selecionarMusica(String musica) {
        musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        numeroAtual = numero;
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        urlAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página: " + urlAtual);
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.selecionarMusica("Lose my breath - Stray Kids");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("123-4567");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
