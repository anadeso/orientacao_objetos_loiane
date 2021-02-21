package aula_36_labs;

import java.util.Scanner;

public class TesteAC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe nome da agenda ");
        String nome = scanner.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contato = new Contato[3];

        for(int i=1; i<=3; i++){

            System.out.println("Informe nome do contato");
            contato.setNome(scanner.next());

            System.out.println("Informe telefone do contato");
            contato.setTelefone(scanner.next());

            System.out.println("Informe e-mail do contato");
            contato.setEmail(scanner.next());
        }

        agenda.setContato(contato);
        System.out.println();

        System.out.println("Nome da agenda : " + agenda.getNome());

        for(Contato c : agenda.getContato() ){
           System.out.println(c.getNome() + c.getTelefone() + c.getEmail());
        }

    }
}
