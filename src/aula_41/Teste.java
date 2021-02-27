package aula_41;

public class Teste {

    public static void main(String[] args) {

        //Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        aluno.setEndereco("Rua 1");
        professor.setEndereco("Rua 2");

        // ambas as classes tem esse método ..mesma assinatura, mesmo nome
        // porem em tempo de execucao o compilador vai saber qual desses métodos chamar
        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();

    }
}
