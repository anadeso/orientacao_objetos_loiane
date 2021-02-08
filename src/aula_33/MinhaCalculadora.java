package aula_33;

public class MinhaCalculadora {

    // SOBRECARGA DE METODOS
    // PERCEBA QUE TEMOS TAMBÉM POLIMORFISMO
    public int soma(int num1, int num2){
        return num1 + num2;
    }

    public double soma(double num1, double num2){
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public int soma(int[] vetorInteiros){

        int total = 0;

        for(int x=0; x<vetorInteiros.length; x++){
            total += vetorInteiros[x];
        }
        return total;
    }
}
