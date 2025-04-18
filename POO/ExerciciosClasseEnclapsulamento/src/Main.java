public class Main {
    public static void main(String[] args) {
        var macho = new Pessoa("Fernando");
        macho.increAno();

       var femea  = new Pessoa("Gabi");
        femea.increAno();

        System.out.println("Nome do macho: " + macho.getNome() + "Idade: " + macho.getIdade());
        System.out.println("Nome do femea: " + femea.getNome() + "Idade: " + femea.getIdade());
    }
}