package aula_33_labs;


import java.util.Scanner;

public class AlunoTeste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do Aluno");
        aluno.setNome(scan.next());

        System.out.println("Entre com o nome do curso");
        aluno.setCurso(scan.next());

        System.out.println("Entre com a matricula");
        aluno.setMatricula(scan.nextInt());

        for(int i=0; i<aluno.getNomeDisciplina().length; i++){
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.setNomeDisciplina(i, scan.next());
        }

        for(int i=0; i<aluno.getNotasDisciplina().length; i++){
            System.out.println("Entre com a disciplina " + aluno.getNomeDisciplina()[i]);
            for(int  j=0; j<aluno.getNotasDisciplina()[i].length; j++){
                System.out.println("Entre com a nota ");
                aluno.setNomePosIJ(i, j , scan.nextDouble());
            }

        }

        aluno.mostrarInfo();

        for(int i=0; i<aluno.getNomeDisciplina().length; i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina " +aluno.getNomeDisciplina()[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " +aluno.getNomeDisciplina()[i] + " - foi reprovao");
            }
        }
       
    }


}
