package aula_33_labs;

public class LampadaTeste {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();

        lampada.mudarEstado();
        lampada.mostrarEstado();
    }
}
