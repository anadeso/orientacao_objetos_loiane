package aula_36;

public class Teste {

    public static void main(String[] args) {

       Contato contato = new Contato();
       contato.setNome("Ana");
       //contato.setEndereco("Av. Ribeiro, 123");
       contato.setTelefone("95555-5555");

       Endereco endereco = new Endereco();
       endereco.setNomeRua("Rua sao joao");
       endereco.setNumero("123");
       endereco.setCep("00000-000");
       endereco.setEstado("XPTO");
       endereco.setCidade("NAP");

       contato.setEndereco(endereco);

        System.out.println(contato.getNome());

        // Aqui teremos a referencia do objeto, e tentando obter o valor de um atributo
        // que pertence a instancia desse objeto...isso é bem perigoso, pois se eu nao realizar
        // o setEndereco na linha abaixo teremos NullPointerException

        //System.out.println(contato.getEndereco().getCidade());
        System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }
    }
}
