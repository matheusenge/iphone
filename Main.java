// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}


// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}


// Interface para o Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe iPhone que implementa todas as interfaces
class main implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean musicaTocando = false;
    private boolean emChamada = false;
    private boolean correioDeVoz = false;
    private String paginaAtual = "";

    public void tocar() {
        if (!musicaTocando) {
            System.out.println("Tocando música.");
            musicaTocando = true;
        } else {
            System.out.println("A música já está tocando.");
        }
    }

    public void pausar() {
        if (musicaTocando) {
            System.out.println("Pausando música.");
            musicaTocando = false;
        } else {
            System.out.println("A música já está pausada.");
        }
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    public void ligar(String numero) {
        if (!emChamada) {
            System.out.println("Ligando para " + numero);
            emChamada = true;
        } else {
            System.out.println("Já está em uma chamada.");
        }
    }

    public void atender() {
        if (emChamada) {
            System.out.println("Atendendo chamada.");
            emChamada = false;
        } else {
            System.out.println("Não há chamada para atender.");
        }
    }

    public void iniciarCorreioVoz() {
        if (emChamada) {
            System.out.println("Iniciando correio de voz.");
            correioDeVoz = true;
        } else {
            System.out.println("Não é possível iniciar o correio de voz sem uma chamada.");
        }
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web: " + url);
        paginaAtual = url;
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador: " + paginaAtual);
    }
}

public class Main {
    public static void main(String[] args) {
        main iphone = new main();

        // Testando as funcionalidades do iPhone
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Música 1");

        iphone.ligar("123-456-789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}