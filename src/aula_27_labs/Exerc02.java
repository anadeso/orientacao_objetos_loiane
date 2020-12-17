package aula_27_labs;

import jdk.swing.interop.SwingInterOpUtils;

public class Exerc02 {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Saldo da conta " +conta.numero + " = " +conta.saldo);
        boolean saqueEfetuado = conta.sacar(10);

        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso ");
            System.out.println("Saldo atual da conta = " +conta.saldo);
        } else {
            System.out.println("Nao foi possivel realizar saque.");
        }

        System.out.println();
        System.out.println("Usando cheque escial? " + conta.verificarUsoChequeEspecial());


        System.out.println();
        saqueEfetuado = conta.sacar(500);

        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso ");
            System.out.println("Saldo atual da conta " +conta.saldo);
        } else {
            System.out.println("Nao foi possivel realizar saque");
        }

        System.out.println();
        System.out.println("Deposito de 500");
        conta.depositar(500);
        System.out.println("Saldo atual da conta " +conta.consultarSaldo());

        System.out.println();
        System.out.println("Usando cheque escial? " + conta.verificarUsoChequeEspecial());

        conta.sacar(600);
        System.out.println("Usando cheque escial? " + conta.verificarUsoChequeEspecial());

    }
}
