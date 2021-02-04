package aula_30;

/*
* Aula sobre this
* */

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 paraâmetros");
    }

    public Carro(String marca, String modelo){
        this(marca, modelo, 10);
        System.out.println("Chamdno o construtor com 2 parâmetros");
    }

    public Carro() {
    }

    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " +this.capCombustivel * this.consumoCombustivel);
    }

    public double obterAutonomia(){
        return this.capCombustivel * this.consumoCombustivel;
    }

    public double alcularCombustivel(double km){

        double qtdCombustivel = km/this.consumoCombustivel;
        return qtdCombustivel;

    }

}
