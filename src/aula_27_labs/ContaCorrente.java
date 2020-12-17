package aula_27_labs;

public class ContaCorrente {

    String numero;
    String agencia;
    double saldo;
    double limiteEspecial;
    double valorEspecialUsado;
    boolean especial;

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
