package aula_52;

public class ContatoNaoExiste extends Exception{

    private String nome;

    public ContatoNaoExiste(String nome){
        this.nome = nome;
    }

    @Override
    public String getMessage() {
        return "Contato " + nome + " não existe na agenda!";
    }
}
