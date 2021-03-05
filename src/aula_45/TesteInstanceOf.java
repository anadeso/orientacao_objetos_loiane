package aula_45;

public class TesteInstanceOf {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        if (pessoa instanceof Pessoa){
            System.out.println("É o tipo pessoa");
        }

        if (aluno instanceof Aluno){
            System.out.println("É o tipo aluno");
        }

        if (professor instanceof Professor){
            System.out.println("É o tipo professor");
        }
    }
}
