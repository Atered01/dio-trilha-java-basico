public class OperadoresSequencia {
    public static void main(String[] args) {
     int numero = 5;
     //x repetição
     numero++; // mesma coisa que: "numero = numero + 1; "
     //System.out.println(numero);



     boolean variavel = true;

     System.out.println(!variavel); // inverte o valor do boleano de "true" para "false"

     System.out.println(variavel);


        //operador ternario
        int a, b;

        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "Falso";

        System.out.println(resultado);
        
        //OPERADORES RELACIONAIS
        String nomeUm = "Luiz";
        String nomeDois =  new String("Luiz");

        System.out.println(nomeUm.equals(nomeDois)); //Quando estamos usando objetos ou textos utilizamos o metodo "equals".

        int nuemero1 = 1;
        int nuemero2 = 2;
        
        boolean simNao = nuemero1 == nuemero2; //Igual a

        System.out.println("numero é igual ao numero 2? "+ simNao);

        simNao = nuemero1 != nuemero2; //Diferente de

        System.out.println("numero é diferente do numero 2? "+ simNao);

        simNao = nuemero1 > nuemero2; // Maior que

        System.out.println("numero é maior que numero 2? "+ simNao);

        simNao = nuemero1 < nuemero2; //Menor que

        System.out.println("numero é menor que numero 2? "+ simNao);

        simNao = nuemero1 >= nuemero2; // Maior ou igual a

        System.out.println("numero é maior ou igual ao numero 2? "+ simNao);

        simNao = nuemero1 <= nuemero2; //Menor ou igual a

        System.out.println("numero é menor ou igual ao numero 2? "+ simNao);

        //OPERADORES LOGICOS
        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2){ //&& = duas condições são verdadeiras
            System.out.println("as duas condições são verdadeiras");
        }

        System.out.println("fim");

        if(condicao1 || condicao2){// || = uma das condições são verdadeiras
            System.out.println("Uma das condições são verdadeiras");
        }

        System.out.println("fim");
    }
    
}
