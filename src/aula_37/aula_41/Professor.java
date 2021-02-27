package aula_37.aula_41;

public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

    // Aqui estamos sobrescrevendo o método obterEndereco da classe Pessoa(pai)
    @Override
    public String obterEndereco() {
        String s = "Endereco do Professo: ";
            s += super.getEndereco();
            return s;
    }
}
