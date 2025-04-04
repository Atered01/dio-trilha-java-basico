public class PetMachine {
    private Pet pet;
    private int agua;
    private int shampoo;

    public PetMachine(){
        this.agua = 0;
        this.shampoo = 0;
    }

    public void setPet(Pet pet){
        this.pet = pet;
    }

    public void tomarBanho() {
        if (this.pet == null) {
            System.out.println("Não há um pet na máquina para dar banho. Coloque um pet primeiro (opção 7).");
            return;
        }

        System.out.println("Dando banho no pet " + this.pet.getName());
        this.pet.setClean(true);
    }

    public void colocarAgua(){
        this.agua++;
        System.out.println("Foi colocado 1 litro de água");
    }

    public void colocarShampoo(){
        this.shampoo++;
        System.out.println("Foi colocado 1 litro de shampoo");
    }

    public int getAgua(){
        return this.agua;
    }

    public int getShampoo(){
        return this.shampoo;
    }

    public boolean temPet(){
        return this.pet != null;
    }

    public void tiraPet(){
        if(this.pet != null){
            System.out.println("O pet " + this.pet.getName() + " foi retirado da máquina");
            this.pet = null;
        } else {
            System.out.println("Não tem pet na máquina");
        }
    }

    public void lavarMaquina(){
        System.out.println("A máquina foi lavada");
    }
}