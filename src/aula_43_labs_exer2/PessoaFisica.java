package aula_43_labs_exer2;

public class PessoaFisica extends Contribuinte{

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {

        double renda = getRendaBruta();

        // Nao inserimos else pois estamos usando RETURN
        if (renda <= 1400){
            return 0;
        }

        if (renda > 1400 && renda <= 2100){
            return (renda * 0.1) - 100;
        }

        if(renda > 2100 && renda <= 2800){
            return (renda * 0.15) - 270;
        }

        if(renda > 2800 && renda <= 3600){
            return (renda * 0.25) - 500;
        }

        // maior 3600
        return (renda * 0.3) - 700;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                '}' + "Imposto a ser pago= " +calcularImposto();
    }
}
