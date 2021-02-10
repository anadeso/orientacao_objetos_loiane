package aula_33_labs;

public class Aluno {

    private String nome;
    private int matricula;
    private String curso;
    private String[] nomeDisciplina = new String[3];
    private double[][] notasDisciplina = new double[3][4];

    public Aluno() {
        nomeDisciplina = new String[3];
        notasDisciplina = new double[3][4];
    }

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.nomeDisciplina = new String[3];
        this.notasDisciplina = new double[3][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String[] nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public double[][] getNotasDisciplina() {
        return notasDisciplina;
    }

    public void setNotasDisciplina(double[][] notasDisciplina) {
        this.notasDisciplina = notasDisciplina;
    }

    public void mostrarInfo(){

        System.out.println("Nome " +nome);
        System.out.println("Matricula " +matricula);
        System.out.println("Nome do curso " +curso);

        for(int i=0; i<notasDisciplina.length; i++){
            System.out.println("Notas da disciplina " +nomeDisciplina);
            for(int j=0; j<notasDisciplina[i].length; j++){
                System.out.print(notasDisciplina[i][j] + " ");
            }
            System.out.println();

        }
    }

    public boolean verificarAprovado(int indice){

        double soma = 0;

        for(int i=0; i<notasDisciplina[indice].length; i++){
            soma += notasDisciplina[indice][i];
        }

        double media = soma/4;

        if(media >= 7){
            return true;
        }

        return false;
    }

    public void setNomeDisciplina(int pos, String nomeDisciplina){
        this.nomeDisciplina[pos] = nomeDisciplina;
    }

    public void setNomePosIJ(int posI, int posJ, double nota){
        this.notasDisciplina[posI][posJ] = nota;
    }

}
