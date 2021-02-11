package aula_34_labs;

public class ContadorTeste {

    public static void imprimir(){
        System.out.println(Contador.getContador());
    }

    public static void main(String[] args) {

        imprimir();

        Contador.incrementarContador();
        imprimir();

        Contador.zerarContador();
        imprimir();

        Contador.incrementarContador();
        Contador.incrementarContador();
        Contador.incrementarContador();
        imprimir();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimir();

    }
}
