package aula_24_labs;

import java.util.Date;

public class Exec04 {
    public static void main(String[] args) {

        LivroDeBiblioteca livroDeBiblioteca = new LivroDeBiblioteca();

        livroDeBiblioteca.nome = "Mastering ExtJS";
        livroDeBiblioteca.autor = "Loiane Groner";
        livroDeBiblioteca.anoLancamento = 2015;

        livroDeBiblioteca.emprestado = true;
        livroDeBiblioteca.dataEntrega = new Date();
        livroDeBiblioteca.emprestadoA = "Ana";

    }
}
