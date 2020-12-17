package aula_27_labs;

import javax.security.auth.callback.LanguageCallback;

public class Exerc01 {

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
