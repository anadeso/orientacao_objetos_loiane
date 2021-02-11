package aula_34_labs;

public class CalculadoraTeste {

    private static void imprimir(){
        System.out.println(Calculadora.getResultado());
    }

    public static void main(String[] args) {

        Calculadora.somar(2.0, 3.0);
        imprimir();

    }
}
