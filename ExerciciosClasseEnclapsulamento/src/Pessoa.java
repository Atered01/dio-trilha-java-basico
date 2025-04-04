import java.time.OffsetDateTime;

public class Pessoa {

    private final String nome;

    private int idade;

    private int ultimoAnoIncre = OffsetDateTime.now().getYear();

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 1;
    }

    public String getNome() {
        return this.nome;
    }


    public int getIdade() {
        return this.idade;
    }

    public void increAno() {
        if (this.ultimoAnoIncre >= OffsetDateTime.now().getYear()) return;

        this.idade += 1;
        this.ultimoAnoIncre = OffsetDateTime.now().getYear();
    }
}