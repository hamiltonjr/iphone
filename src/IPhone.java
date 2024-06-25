public class IPhone implements IPod, Phone, Internet {
    public void ligarTelefone() {
        System.out.println("Ligando...");
    }

    public void desligarTelefone() {
        System.out.println("Desligando...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando núsica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando núsica...");
    }

    @Override
    public void selecionarMusiva() {
        System.out.println("Selecionando núsica...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreiodeVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
