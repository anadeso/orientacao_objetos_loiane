package aula_36_labs;

public class Agenda {

    private String nome;
    private Contato[] contatos;

    public Agenda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfo(){
        String info = "Nome = " +nome;

        if (contatos != null){
            for(Contato c : contatos){
                info += c.obterInfor() + "\n";
            }
        }

        return info;
    }
}
