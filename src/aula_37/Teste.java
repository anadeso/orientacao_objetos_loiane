package aula_37;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Maria");

        Professor professor = new Professor();

        // so teremos acessoa as informacoes que for da classe Pessoa
        // aqui temos um conceito de polimorfismo
        Pessoa a = new Aluno();
        Pessoa prof = new Professor();
        //prof.getSala

    }
}
