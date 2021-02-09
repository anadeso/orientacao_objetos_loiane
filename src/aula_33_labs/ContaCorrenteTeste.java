package aula_33_labs;


public class ContaCorrenteTeste {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldo(-10);

        System.out.println("Saldo da conta " +conta.getNumero() + " = " + conta.getSaldo());

        boolean saqueEfetuado = conta.sacar(10);

        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Nao foi possivel realizar saque, Saldo insuficiente");
        }

        saqueEfetuado = conta.sacar(500);

        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Nao foi possivel realizar saque, Saldo insuficiente");
        }

        System.out.println("Deposito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();

        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Esta usando cheque especial");
        } else {
            System.out.println("Nao esta usando cheque especial");
        }

        conta.sacar(600);
        conta.consultarSaldo();

        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Esta usando cheque especial");
        } else {
            System.out.println("Nao esta usando cheque especial");
        }
    }
}
