package aula_47;

public class MultiplosCatch {

    public static void main(String[] args) {

        int[] numeros = {4,8,16,32,64,128};
        int[] demon = {2, 0, 4, 8, 0};

        for(int i=0; i<numeros.length; i++){
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
        }

    }
}
