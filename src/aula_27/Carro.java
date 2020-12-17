package aula_27;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // Meqtodo simples - sem retorno
    public void exibirAutonomia(){
        System.out.println("Autonomia é: " + (capCombustivel * consumoCombustivel));
    }

    // Metodo com retorno
    public double obterAutonomia(){
        System.out.println("Entrei no método obterConsumo");
        return capCombustivel * consumoCombustivel;
    }

    // Metodo recebendo parâmetro
    public double calcularCombustivel(double km){
         double qtdCombustivel;
         return qtdCombustivel = km/consumoCombustivel;
    }
}
