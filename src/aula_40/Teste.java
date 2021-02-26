package aula_40;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua a, n 3");
        aluno.setEndereco("Rua b, n 2");
        professor.setEndereco("Rua c, n 1");

        // Polimorfismo em tempo de execucao(runtime)
        System.out.println(pessoa.obterEndereco());
        System.out.println(aluno.obterEndereco());
        System.out.println(professor.obterEndereco());
    }
}
