import java.util.Scanner;

public class Main {

    private final static Scanner  scanner =  new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

        var option = -1;

        do {
            System.out.println("====Escolha uma das opções====");
            System.out.println("1- dar banho no pet");
            System.out.println("2- Abstecer a maquina com água");
            System.out.println("3- Abstecer a maquina com shampoo");
            System.out.println("4- Verifica água da máquina");
            System.out.println("5- Verifica shampoo da máquina");
            System.out.println("6- Verificar se tem um pet no banho");
            System.out.println("7- Colocar um pet na máquina");
            System.out.println("8- Tirar um pet da máquina");
            System.out.println("9- Limpar a máquina");
            System.out.println("0- Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.tomarBanho();
                case 2 -> setAgua();
                case 3 -> setShampoo();
                case 4 -> verificarAgua();
                case 5 -> verificarShampoo();
                case 6 -> verificarSePetNaMaquina();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.tiraPet();
                case 9 -> petMachine.lavarMaquina();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção invalida!");
            }
        } while (true);
    }


    private static void setAgua(){
        System.out.println("Tentando colocar agua");
        petMachine.colocarAgua();
    }

    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo");
        petMachine.colocarShampoo();
    }

    private static void verificarAgua() {
        var vAgua = petMachine.getAgua();
        System.out.println("A maquina está no momento com " + vAgua + " litro(s) de agua.");
    }

    private static void verificarShampoo() {
        var vShampoo = petMachine.getShampoo();
        System.out.println("A maquina está no momento com " + vShampoo + " litro(s) de shampoo.");
    }

    private static void verificarSePetNaMaquina() {
       var temPet = petMachine.temPet();
        System.out.println(temPet ? "Tem pet na máquina" : "Não tem pet" );
    }

    public static void setPetInPetMachine(){
        var name = "";
        while(name == null || name.isEmpty()){
            System.out.println("Digite o nome do pet: ");
            name = scanner.nextLine();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na maquina");
    }
}