package aula_34_labs;

import java.util.Scanner;

public class FatorialTeste {


    public static void imprimir(){
        System.out.println(Fatorial.getResultado());
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num = 0.0;

        do{
            System.out.println("Entre com o numero positivo");
            num = scan.nextInt();

            if (num <0){
                System.out.println("Numero invalido entre novamente");
            }

        } while (num < 0);

        Fatorial.fatorialNumero(num);
        imprimir();
    }
}
