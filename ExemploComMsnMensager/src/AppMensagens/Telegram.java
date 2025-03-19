package AppMensagens;

public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram");
    }

    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando historico da mensagem pelo Telegram");
    }

}
