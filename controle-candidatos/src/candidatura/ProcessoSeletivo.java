package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"JOÃO", "ZICO", "SOCRATES", "BEBETO", "ROMARIO"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato (String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = antender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }
            else{
                System.out.println("Contato realizado com sucesso");
            }

        }
        while (continuarTentando && tentativasRealizadas < 3);
           
        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " NA " + tentativasRealizadas + " Tentativas");    
        }
        else{
            System.out.println("Não conseguimos contato com " + candidato + ", Numero maximo de tentativas " + tentativasRealizadas);
        }
    }

    static boolean antender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"JOÃO", "ZICO", "SOCRATES", "BEBETO", "ROMARIO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++ ){
            System.out.println("O candidato de n° " + (indice+1) + " é " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"JOÃO", "ZICO", "SOCRATES", "BEBETO", "ROMARIO", "EDMUNDO", "RONALDO", "RENATO GAUCHO", "CANTONA", "PELE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de sálario " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }
        else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }
        else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}