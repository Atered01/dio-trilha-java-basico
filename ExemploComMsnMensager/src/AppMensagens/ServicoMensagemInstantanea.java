package AppMensagens;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected abstract void salvarHistoricoMensagem();

    protected void validarInternet(){
        System.out.println("Validando a conexão com a internete");
    }



}
