package aula_42;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        // Constante e final
        System.out.println(Constantes.URL_BLOG);
        Constantes.URL_BLOG = "Consigo modificar pq não declarei como final";

        System.out.println(Constantes.CURSO_COMPLETO);
        //Constantes.CURSO_COMPLETO = "Veja que aqui já não consigo modificar";

    }
}
