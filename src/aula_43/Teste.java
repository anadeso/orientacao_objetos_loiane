package aula_43;

public class Teste {

    public static void main(String[] args) {

        Aluno  aluno = new Aluno();

        aluno.setCurso("Sistema Informacao");
        double[] n = {10, 9, 8, 7};
        aluno.setNotas(n);

        System.out.println(aluno);

        String s1 = "abcdef";
        String s2 = "abcdeF";

        System.out.println(s1==s2); // Comparando a referencia
        System.out.println(s1.equalsIgnoreCase(s2)); // Comparando conteudo


    }
}
