package aula_26;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // Metodo sem retorno - metodo simples
    public void exibirAutonomia(){
        System.out.println("Autonomia é " + (capCombustivel * consumoCombustivel));
    }

    // Metodo com retorno
    public double obterAutonomia(){
        System.out.println("Metodo obter autonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }

}
