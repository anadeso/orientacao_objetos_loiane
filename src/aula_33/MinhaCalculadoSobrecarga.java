package aula_33;

public class MinhaCalculadoSobrecarga {

    // Sobrecarga de método
    // Quandoo temos o MESMO nome e/ou tambem o mesmo retorno, porém com parâmetros DIFERENTES.
    public int Soma(int num1, int num2){
        return num1 + num2;
    }

    public int Soma(int num1, int num2, int num3){
        return num1 + num2 +num3;
    }

    public double soma(double num1, double num2){
        return num1 + num2;
    }

}
