public class Operadores {
    
    public static void main(String[] args) {

        // O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.
        
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao); // vai ser 31 porque está contando assim: 1+1+1 = 3. Pos isso ele detecta o caracter "1" e concatena ficando 31

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao); //Continua sendo aplicada a mesma logica de antes mas com a diferença de onde está o caracter o que impede a a soma dos numeros

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1+1+1);
        System.out.println(concatenacao); //Aconteçeu uma mudaça porque o caracter "1" está fora do parentese mas logo apos a conta do paratese ser efetuada ele concatena.
    }
    
}
