//exemplo de herença
public abstract class Veiculo {
    private String chassi;
    private String getChassi(){
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    //abstração
    public abstract void ligar();
}
