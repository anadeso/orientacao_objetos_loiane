package aula_40;

public class Aluno extends Pessoa {

    private String curso;
    private double notas;

    public Aluno() {
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public double verificarAprovado(){
        return 0;
    }

    public void metodoQualquer(){
        // buscando apenas atributos/metodos da classe Pessoa
        super.setCpf("42352352352");
        this.setCpf("232352355");
    }

    // Aqui estamos sobrescrevendo o método obterEndereco da classe Pessoa(pai)
    @Override
    public String obterEndereco() {
        String s = "Endereco do Aluno: ";
            s += super.getEndereco();
            return s;
    }
}
