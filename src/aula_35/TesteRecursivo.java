package aula_35;

public class TesteRecursivo {

    public static void main(String[] args) {

        double fatoriaNR = Fatorial.fatorialNaoRecursivo(5);
        System.out.println(fatoriaNR);

        int fatorialR = Fatorial.fatorial(5);
        System.out.println(fatorialR);

    }
}
