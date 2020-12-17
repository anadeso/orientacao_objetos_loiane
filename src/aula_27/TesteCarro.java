package aula_27;

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

        // Chamando metodo simples - sem retorno
        carro.exibirAutonomia();

        // Chamdno metodo com retorno
        System.out.println();
        double autonomia = carro.obterAutonomia();
        System.out.println("Autonomia " +autonomia);
        System.out.println("Autonomia do carro é " +carro.obterAutonomia());

        // Chamando metodo com paraâmetro

        System.out.println("Quantidade de combustível é: " +carro.calcularCombustivel(10));
        System.out.println("Quantidade de combustível é: " +carro.calcularCombustivel(15));
    }
}
