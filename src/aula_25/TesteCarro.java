package aula_25;

public class TesteCarro {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "Ducato";
        carro.numPassageiros = 10;
        carro.capCombustivel = 100;
        carro.consumoCombustivel = 0.2;

        System.out.println(carro.marca);
        System.out.println(carro.modelo);

        carro.exibirAutonomia();
    }
}
