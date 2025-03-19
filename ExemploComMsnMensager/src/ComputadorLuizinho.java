import AppMensagens.FacebookMessenger;
import AppMensagens.MsnMensseger;
import AppMensagens.ServicoMensagemInstantanea;
import AppMensagens.Telegram;

public class ComputadorLuizinho {
    public static void main(String[] args) {
      ServicoMensagemInstantanea smi = null;
      /*
        Não se sabe qual APP
        Mas qualquer um deverá enviar e receber mensagem
       */
        String appEscolhido = "tele";

        if(appEscolhido.equals ("msn")){
            smi = new MsnMensseger();
        } else if (appEscolhido.equals("face")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tele")) {
            smi = new Telegram();
        }
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
