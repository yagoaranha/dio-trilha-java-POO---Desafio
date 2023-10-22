// Interface para Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface para Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina();
}

// Classe iPhone que implementa as interfaces
class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando música no iPhone.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iPhone.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " no iPhone.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada no iPhone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iPhone.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url + " no navegador do iPhone.");
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando uma nova aba para: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página no navegador do iPhone.");
    }
}

public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();
        meuIPhone.tocar();
        meuIPhone.ligar("123456-7890");
        meuIPhone.exibirPagina("https://www.examplo.com.br");
    }
}
