package aula_43_labs;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaRendimento=" + diaRendimento +
                '}';
    }

    public boolean calcularNovoSaldo(double taxaRendimento){

        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){

            double taxaCalculada = getSaldo() * taxaRendimento;
            double saldoAtualizado = getSaldo() + taxaCalculada;
            setSaldo(saldoAtualizado);
            return true;
            //setSaldo(getSaldo() + (getSaldo() * taxaRendimento));
        }
        return false;
    }
}
