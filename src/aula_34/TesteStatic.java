package aula_34;

public class TesteStatic {

    static int resultSoma;

    public static void main(String[] args) {

        // Veja que para acessar o método nao precisamos de uma instãncia

        MinhaCalculadora.soma(500, 500);
        MinhaCalculadora.soma(1500.9, 1600.9);

        // So conseguimos acessar essa vaiavel pois é estatica
        resultSoma = 1;

        // So coneguimos acessar o metodo somaValores que esta fora do escopo Main
        // se o metodo estiver com static
        somaValores(400, 800);

    }

    public static int somaValores(int num1, int num2){
        return MinhaCalculadora.soma(num1, num2);
    }

}
