package aula_45;

public class Teste {
    public static void main(String
                                    [] args){
        Aluno aluno = new Aluno();
        Pessoa alunoPessoa = aluno; // upcasting - transformando uma classe menor para um tipo de clase maior

        Pessoa aluno2 = (Pessoa) new Aluno(); // upcating

        // Downcasting
        Pessoa aluno3 = new Pessoa();
        // Erro de execucao, pois Pessoa tem atributos que o Aluno nao tem
        // Mesmo que Aluno tenha como superclasse Pessoa
        Aluno aluno4 = (Aluno) aluno3;
    }
}
