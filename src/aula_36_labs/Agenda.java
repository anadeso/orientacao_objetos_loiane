package aula_36_labs;

import aula_24_labs.Contatos;
import aula_36.Telefone;

public class Agenda {

    private String nome;
    private Contato[] contato;

    public Agenda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContato() {
        return contato;
    }

    public void setContato(Contato[] contato) {
        this.contato = contato;
    }
}
