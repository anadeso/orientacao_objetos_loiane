package aula_31;

public class Carro {

    // Com public todoos podem visualizar dentro do pacote, fora do pacote e dentro classe (geral para quem quiser)
    public String marca;
    String modelo;
    // Com default pode ser visualizado apenas dentro do pacote
    int numPassageiros;
    double capCombustivel;
    // Private apenas da propria classe
    private double consumoCombustivel;

    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " +this.capCombustivel * this.consumoCombustivel);
    }

    private double obterAutonomia(){
        return this.capCombustivel * this.consumoCombustivel;
    }

    private double divideKmPorConsumoCombustivel(double km){
        return km/this.consumoCombustivel;
    }

    public double calcularCombustivel(double km){
        return divideKmPorConsumoCombustivel(km);
    }
}
