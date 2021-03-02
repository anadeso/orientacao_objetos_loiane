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

        System.out.println("**** Teste Conta Poupanca ****");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Conta Poupanca");
        contaPoupanca.setNumConta("2222");
        contaPoupanca.setDiaRendimento(2);

        contaPoupanca.depositar(100);
        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Novo rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Nao é dia de rendimento");
        }
        System.out.println(contaPoupanca);


        System.out.println("**** Teste Conta Especial ****");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("5255");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);
        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);

    }

    // Aqui temos polimorfismo
    private static void realizarSaque(ContaBancaria conta, double valor){

        if (conta.sacar(valor)){
            System.out.println("Saque efetuado novo saldo " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + " saldo da conta é: " +conta.getSaldo());
        }

    }
}
