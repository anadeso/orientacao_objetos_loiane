package aula_34_labs;

public class Contador {

    // Atributo estatico é compartilhado por toda a instancia da classe
    private static int contador;

    // Cenário onde distribuimos senhas, qtd de contas de um banco que foram criados
    // para isso usamos um atributo estatico, pois o mesmo vai ser compartilhado por toda a instancia

    public Contador(){
        contador++;
    }
    public static void zerarContador(){
        contador = 0;
    }

    public static void incrementarContador(){
         contador++;
    }

    public static int getContador() {
        return contador;
    }
}
