public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo o correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecinando a música: " + musica);
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Goodbye Yellow Brick Road");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("2199658745");
        iphone.iniciarCorreioVoz();
        iphone.atender();

        iphone.exibirPagina("https://www.minhapaginaonline.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
