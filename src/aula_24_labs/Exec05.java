package aula_24_labs;

public class Exec05 {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numero = 123456;
        conta.agencia = "1234";
        conta.especial = true;
        conta.limite = 500;
        conta.saldo = 1000;

        System.out.println("Saldo da conta " + conta.numero +  " = " + conta.saldo + "");
    }
}
