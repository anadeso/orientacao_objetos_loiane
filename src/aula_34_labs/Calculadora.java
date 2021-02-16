package aula_34_labs;

public class Calculadora {

    private static double resultado;

    public static double somar(double num1, double num2){
        return resultado = num1 + num2;
    }

    public static double subtrair(double num1, double num2){
        return resultado = num1 - num2;
    }

    public static double multiplicar(double num1, double num2){
        return resultado = num1 * num2;
    }

    public static double dividir(double num1, double num2){
        return resultado = num1/num2;
    }

    public static double elevarPotencia(double num1, double num2){
        //return Math.pow(num1, num2);

        double valor = num1;

        for(double i=1; i<=num2; i++){
            valor *= num1;
        }

        return resultado = valor;

    }

    public static double getResultado() {
        return resultado;
    }
}
