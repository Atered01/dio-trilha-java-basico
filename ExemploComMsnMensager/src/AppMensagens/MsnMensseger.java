package AppMensagens;

public class MsnMensseger extends ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarInternet();
        System.out.println("Enviando mensagem pelo MSN");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN");
    }

    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando historico da mensagem pelo MSN");
    }

}
