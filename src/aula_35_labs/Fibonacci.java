package aula_35_labs;

public class Fibonacci {

    public final static int TAM_MEM = 5;
    public static long[] memoria = new long[TAM_MEM];

    public static long sequenciaFibonacci(int num){

        if (num < 2){
            return memoria[num];
        }

        //verifica se o numero ja foi calculado e salvo na memória
        //caso contraário, faz o calculoe salva
        long fib = memoria[num];

        if (fib == 0){
            fib = sequenciaFibonacci(num-1) + sequenciaFibonacci(num-2);
            memoria[num] = fib;
        }

        return memoria[num];
    }
}
