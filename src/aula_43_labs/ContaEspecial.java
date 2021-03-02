package aula_43_labs;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {

        double saldoLimite = getSaldo() + this.limite;

        if ((saldoLimite - valor) >= 0){
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite = " + limite +
                '}' + super.toString();
    }
}
