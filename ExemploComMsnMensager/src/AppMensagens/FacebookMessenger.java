package AppMensagens;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarInternet();
        System.out.println("Enviando mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
    }

    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando historico da mensagem pelo Facebook");
    }

}
