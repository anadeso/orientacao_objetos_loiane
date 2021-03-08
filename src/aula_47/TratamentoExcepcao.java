package aula_47;

import java.io.IOException;

public class TratamentoExcepcao {

    public static void main(String[] args) {

        try{

            int[] vetor = new int[4];
            System.out.println("Antes da exception");

            vetor[4] = 1;
            System.out.println("Esse texto não será impresso");

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("A exception ocorreu, pois tentou acessar um indice que na2o existe!");
        }

        System.out.println("Esse texto seraá impresso após a exception");

    }
}
