package aula_36_labs;

import java.util.Scanner;

public class TesteCurso {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do curso: ");
        String nome = scan.nextLine();

        System.out.println("Entre com o horario do curso: ");
        String horario = scan.nextLine();

        System.out.println("Entre com o nome do professor");
        String nomePro = scan.nextLine();

        System.out.println("Entre com o departamento do professor");
        String depPro = scan.nextLine();

        System.out.println("Entre com o email do professor");
        String emailPro = scan.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor pro = new Professor();
        pro.setNome(nomePro);
        pro.setEmail(emailPro);
        pro.setDepartamento(depPro);

        curso.setProfessor(pro);

        Aluno[] alunos = new Aluno[5];

        for(int i=0; i<5; i++){

            Aluno a = new Aluno();
            scan.nextLine();

            System.out.println("Entre com o nome do aluno ");
            String nomeAluno= scan.nextLine();

            System.out.println("Entre com a matricula do aluno ");
            String matricAluno = scan.nextLine();

            double[] notas = new double[4];

            for(int j=0; j<4; j++){
                System.out.println("Entre com a nota " +(j+1));
                notas[j] = scan.nextDouble();
            }

            alunos[i] = a;
            a.setNome(nomeAluno);
            a.setMatricula(matricAluno);
            a.setNotas(notas);

        }

        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());


    }
}
