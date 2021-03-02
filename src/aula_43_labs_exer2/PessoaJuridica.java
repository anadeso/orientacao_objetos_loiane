package aula_43_labs_exer2;

public class PessoaJuridica extends Contribuinte{

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "PessoaJuridica{" +
                "cnpj= '" + cnpj + '\'' +
                '}' +
                "Imposto a ser pago= " + calcularImposto();
    }
}
