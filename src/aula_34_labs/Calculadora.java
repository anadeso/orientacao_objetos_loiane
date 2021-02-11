package aula_34_labs;

public class Calculadora {

    private static double resultado;

    public static double somar(double num1, double num2){
        return resultado += num1 + num2;
    }

    public static double subtrair(double num1, double num2){
        return resultado -= num1 - num2;
    }

    public static double getResultado() {
        return resultado;
    }
}
