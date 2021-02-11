package aula_34_labs;

public class CalculadoraTeste {

    private static void imprimir(){
        System.out.println(Calculadora.getResultado());
    }

    public static void main(String[] args) {
        Calculadora.somar(1.0, 2.0);
        imprimir();

        Calculadora.subtrair(2.0, 1.0);
        imprimir();

        Calculadora.multiplicar(2, 2);
        imprimir();

        Calculadora.dividir(4, 2);
        imprimir();

        Calculadora.elevarPotencia(2.0, 3.0);
        imprimir();
    }


}
