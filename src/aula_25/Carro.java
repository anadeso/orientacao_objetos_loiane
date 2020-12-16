package aula_25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public void exibirAutonomia(){
        System.out.println("A autonomia é " + (capCombustivel *consumoCombustivel));
    }



}
