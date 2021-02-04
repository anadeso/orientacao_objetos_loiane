package aula_27_labs;

import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do Aluno");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do curso");
        aluno.curso = scan.next();

        System.out.println("Entre com a matricula");
        aluno.matricula = scan.nextInt();

        for(int i=0; i<aluno.nomeDisciplina.length; i++){

            System.out.println("Entre com o nome da disciplina " + i);
            aluno.nomeDisciplina[i] = scan.next();
        }

        for(int i=0; i<aluno.notasDisciplina.length; i++){
            System.out.println("Entre com a disciplina " + aluno.notasDisciplina[i]);
            for(int  j=0; j<aluno.notasDisciplina[i].length; j++){
                System.out.println("Entre com a nota ");
                aluno.notasDisciplina[i][j] = scan.nextDouble();
            }

        }

        aluno.mostrarInfo();

        for(int i=0; i<aluno.nomeDisciplina.length; i++){
            if(aluno.verificarAprocado(i)){
                System.out.println("Disciplina " +aluno.nomeDisciplina[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " +aluno.nomeDisciplina[i] + " - foi reprovao");
            }
        }

    }

}
