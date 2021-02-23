package aula_36_labs;

public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String obterInfo(){
        String info = "Nome do curso = " +nome + "\n";

        // verifica se é nulo pois é um objeto
        if (professor != null){
            info += professor.getInfo();
        }

        if (alunos != null){
            System.out.println("----- Alunos ------");
            for (Aluno a : alunos){
                if (a != null){
                    info += a.obterInfo();
                    info += "\n";
                }
            }
            info += "\n Media da turma = " +obterMediaTurma();
        }
        return info;
    }

    public double obterMediaTurma(){
        double soma = 0;
        for (Aluno a : alunos){
            if (a != null){
                soma += a.obterMedia();
            }
        }
        return soma/alunos.length;
    }
}
