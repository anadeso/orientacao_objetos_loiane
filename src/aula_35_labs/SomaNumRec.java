package aula_35_labs;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SomaNumRec {

    public static int somaNum(int num){

        if (num < 2){
            return 1;
        }

        return somaNum(num-1) +somaNum(num-2);
    }

    // 3 = 4 - 3 - 2 - 1
    public static int somatorio(int num){

        if (num == 1){
            return  1;
        }

        System.out.println(num);
        return  num + somatorio(num-1);
    }

    // 5 + 5-1
    // 4 + 4-1
    // 3 + 3-1
    // 2 + 2-1
    // 1







}
