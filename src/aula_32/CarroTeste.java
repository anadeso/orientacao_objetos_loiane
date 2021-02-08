package aula_32;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setMarca("Wolksvagem");
        carro.getModelo();

        System.out.println("Marca é " +carro.getMarca());
    }
}
