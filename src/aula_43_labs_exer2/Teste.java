package aula_43_labs_exer2;

public class Teste {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Contribuinte 01");
        pessoaFisica.setRendaBruta(1000);
        pessoaFisica.setCpf("720.566.558-29");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Contribuinte 02");
        pessoaJuridica.setRendaBruta(5000);
        pessoaJuridica.setCnpj("14.626.206/0001-36");

        PessoaFisica pessoaFisica03 = new PessoaFisica();
        pessoaFisica03.setNome("Contribuinte 03");
        pessoaFisica03.setRendaBruta(2000);
        pessoaFisica03.setCpf("196.346.938-06");

        PessoaJuridica pessoaJuridica04 = new PessoaJuridica();
        pessoaJuridica04.setNome("Contribuinte 04");
        pessoaJuridica04.setRendaBruta(3000);
        pessoaJuridica04.setCnpj("44.276.002/0001-83");

        PessoaFisica pessoaFisica05 = new PessoaFisica();
        pessoaFisica05.setNome("Contribuinte 05");
        pessoaFisica05.setRendaBruta(3700);
        pessoaFisica05.setCpf("253.876.258-81");

        PessoaJuridica pessoaJuridica06 = new PessoaJuridica();
        pessoaJuridica06.setNome("Contribuinte 06");
        pessoaJuridica06.setRendaBruta(4000);
        pessoaJuridica04.setCnpj("04.456.000/0001-51");

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = pessoaFisica;
        contribuintes[1] = pessoaJuridica;
        contribuintes[2] = pessoaFisica03;
        contribuintes[3] = pessoaJuridica04;
        contribuintes[4] = pessoaFisica05;
        contribuintes[5] = pessoaJuridica06;

        for(Contribuinte c : contribuintes){
            System.out.println(c.toString());
        }

    }

}
