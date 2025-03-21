// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
    PIAUI ("PI", "Piauí", 13),
    MARANHAO ("MA","Maranhão", 14),
    MINAS_GERAIS("MG","Minas Gerais", 15)
    ;

    private String nome;
    private String sigla;
    private int ibge;

    //Dizemos que todo o estado precisa de uma sigla, um nome e um ibge
    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }

    public int getIbge() {
        return ibge;
    }

    //Este metodo pega o nome do estado e o deixa me maiusculo
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}