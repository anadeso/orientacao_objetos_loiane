package aula_52;

public class Agenda {

    private Contato[] contatos;

    public Agenda(){
        contatos = new Contato[5];
    }

    public boolean adicionarContato(Contato c) throws AgendaCheiaException {

        boolean cheia = true;
        for(int i=0; i<contatos.length; i++){
            if (contatos[i] == null){
                contatos[i] = c;
                cheia = false;
                break;
            }
        }

        if (cheia){
            throw new AgendaCheiaException();
        }

        return false;
    }

    public int consultaContato(String nome) throws ContatoNaoExiste{

        for(int i=0; i<contatos.length; i++){
            if (contatos[i] != null){
                if (contatos[i].getNome().equalsIgnoreCase(nome)){
                    return i;
                }
            }
        }
        throw new ContatoNaoExiste(nome);
    }

    @Override
    public String toString() {
        String s = "";
        for(Contato c : contatos){
            if (c != null){
                s += c.toString() + "\n";
            }
        }

        return s;
    }
}
