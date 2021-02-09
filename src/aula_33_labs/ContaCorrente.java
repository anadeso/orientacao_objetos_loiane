package aula_33_labs;

public class ContaCorrente {

    private String numero;
    private String agencia;
    private double saldo;
    private double limiteEspecial;
    private double valorEspecialUsado;
    private boolean especial;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, double saldo, double limiteEspecial, double valorEspecialUsado, boolean especial) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limiteEspecial = limiteEspecial;
        this.valorEspecialUsado = valorEspecialUsado;
        this.especial = especial;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public boolean sacar(double quantiaASacar) {

        if (this.saldo >= quantiaASacar) {
            this.saldo -= quantiaASacar;
            return true;
        } else {
            if (especial) {

                double limite = limiteEspecial + saldo;

                if(limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }

            } else { // Nao é especial e nao tem saldo suficiente
                return false;
            }
        }

    }

    public void depositar(double valorDepositado){
        this.saldo +=valorDepositado;
    }

    public double consultarSaldo(){
        return this.saldo;
    }

    public boolean verificarUsoChequeEspecial(){
        if(this.saldo <= 0){
            return true;
        } else {
            return false;
        }
    }

}
