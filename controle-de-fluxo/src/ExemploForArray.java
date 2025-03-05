public class ExemploForArray{
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	for(String aluno : alunos ){
        //String aluno : alunos -> De forma abreviada é criada uma variável nome obtendo um elemento do vetor a cada ocorrência.
        //A impressão de cada aluno é realizada.
        System.out.println("Nome do aluno é: " + aluno);
	}
    }
}