package aula_35;

public class Fatorial {

    private static double resultado;

    public static double fatorialNaoRecursivo(double  numero){

        if (numero == 0){
            return 1;
        }

        int total = 1;
        for(double i=numero; i>=1; i--){
            total *= i;
        }
        return resultado = total;
    }

    // Mais facil de entender e ler a estrutura de um metodo
    // Muito utilizado em estrutura de dados (algoritmo de arvore)
    // Nao que tenha uma performance muito boa
    public static int fatorial(int num){

        if (num == 0){
            return 1;
        }
        return num * fatorial(num - 1);
    }


}
