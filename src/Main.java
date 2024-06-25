public class Main {
    public static void main(String[] args) {
        // novo iPhone
        IPhone phone = new IPhone();

        // ligando o telefone
        phone.ligarTelefone();

        // usando o telefone
        phone.ligar();
        phone.atender();
        phone.iniciarCorreiodeVoz();

        // ouvindo música
        phone.tocar();
        phone.pausar();
        phone.selecionarMusiva();

        // navegando na Internet
        phone.exibirPagina();
        phone.adicionarNovaAba();
        phone.atualizarPagina();

        // desligando o telefone
        phone.desligarTelefone();
    }
}
