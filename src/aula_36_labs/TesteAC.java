package aula_36_labs;

import java.util.Scanner;

public class TesteAC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe nome da agenda ");
        String nome = scanner.nextLine();

        Agenda agenda = new Agenda(nome);

        // Criar um array de contatos
        Contato[] contatos = new Contato[3];

        for(int i=0; i<3; i++){

            System.out.println("Entre com as informacoes do contato");
            Contato c = new Contato();

            System.out.println("Informe nome do contato");
            c.setNome(scanner.nextLine());

            System.out.println("Informe telefone do contato");
            c.setTelefone(scanner.nextLine());

            System.out.println("Informe e-mail do contato");
            c.setEmail(scanner.nextLine());

            // Adicionando objeto c em nosso array
            contatos[i] = c;
        }

        agenda.setContatos(contatos);

        if (agenda != null){
            System.out.println(agenda.obterInfo());
        }

    }
}
