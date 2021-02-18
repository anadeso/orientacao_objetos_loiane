package aula_36;

public class Teste {

    public static void main(String[] args) {

       Contato contato = new Contato();
       contato.setNome("Ana");
       //contato.setEndereco("Av. Ribeiro, 123");
       //contato.setTelefone("95555-5555");

       // relacionamento tem-um endereco
       Endereco endereco = new Endereco();
       endereco.setNomeRua("Rua sao joao");
       endereco.setNumero("123");
       endereco.setCep("00000-000");
       endereco.setEstado("XPTO");
       endereco.setCidade("NAP");

       contato.setEndereco(endereco);

       // relacionamento tem-muitos telefone
       Telefone telefone = new Telefone();
       telefone.setTipo("celular");
       telefone.setDdd("11");
       telefone.setNumero("95555-5555");

       Telefone telefone2 = new Telefone();
       telefone2.setTipo("celular");
       telefone2.setDdd("11");
       telefone2.setNumero("8888-8888");

       Telefone[] telefones = new Telefone[2];
       telefones[0] = telefone;
       telefones[1] = telefone2;

       contato.setTelefones(telefones);

        // Aqui teremos a referencia do objeto, e tentando obter o valor de um atributo que pertence a instancia desse
        // objeto...isso é bem perigoso, pois se eu nao realizar o setEndereco na linha abaixo teremos NullP ointerException
        //System.out.println(contato.getEndereco().getCidade());

        // Teste de console
        System.out.println(contato.getNome());

        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if (contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }*/

        if (contato != null && contato.getTelefones() != null){
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
