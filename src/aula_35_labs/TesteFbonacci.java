package aula_35_labs;

import aula_35.Fatorial;

import java.lang.module.FindException;

public class TesteFbonacci {

    public static void main(String[] args) {

        Fibonacci.memoria[0] = 0;
        Fibonacci.memoria[1] = 1;

        for (int i=1; i<Fibonacci.TAM_MEM; i++){
            System.out.println("Fibonacci de " + i + ": " + Fibonacci.sequenciaFibonacci(i));
        }

    }
}
