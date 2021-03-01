package aula_43_labs;

public class Teste {

    public static void main(String[] args) {

        System.out.println("**** Teste ContaBancaria ****");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente conta simples");
        contaSimples.setNumConta("1234");

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 40);
        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);

        System.out.println("**** Teste ContaBancaria ****");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Conta Poupanca");
        contaPoupanca.setNumConta("2222");

        contaPoupanca.depositar(100);

        realizarSaque(contaPoupanca, 40);
        realizarSaque(contaPoupanca, 70);

        System.out.println(contaPoupanca);
    }

    private static void realizarSaque(ContaBancaria conta, double valor){

        if (conta.sacar(valor)){
            System.out.println("Saque efetuado novo saldo " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + " saldo da conta é: " +conta.getSaldo());
        }

    }
}
