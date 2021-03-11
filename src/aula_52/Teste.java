package aula_52;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3){
            opcao = obterOpcaoMenu(scan);

            if (opcao == 1){   // consulta contato
                consultaContato(scan, agenda);
            } else if (opcao == 2){ // adicionar contato
                adicionarContato(scan, agenda);
            }
        }
    }

    public static void adicionarContato(Scanner scan, Agenda agenda){

        // primeiro verificar se a agenda esta cheia,
        // criar metodo para agenda cheia
        // lancar exception
        try {
            System.out.println("Criando um contato, entre com as informações");
            String nome = lerInformacaoString(scan, "Entre com o nome do contato");
            String telefone = lerInformacaoString(scan, "Entre com o telefone do contato");
            String email = lerInformacaoString(scan, "Entre com o email do contato");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setTelefone(telefone);

            System.out.println("Contato a ser criado");
            System.out.println(contato);

            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }
    }

    public static void consultaContato(Scanner scan, Agenda agenda){
        String nomeContato = lerInformacaoString(scan,
                "Entre com o nome do contato a ser pesquisado");

        try {
            if (agenda.consultaContato(nomeContato) >= 0){
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExiste e) {
            System.out.println(e.getMessage());
        }
    }

    public static String lerInformacaoString(Scanner scan, String msg){
        System.out.println(msg);
        String entrada = scan.nextLine(); // aqui estamos lendo String, se fosse int, boolean precisariamos parsear
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scan){

        boolean entradaValida = false;
        int opcao = 3;

        // enquanto entrada nao for valida
        while (!entradaValida){
            System.out.println("Digite a opcao desejada:");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");

            // aqui pode ocorrer um erro, pois pode digitar nao inteiro
            // e tambem uma opcao diferente de 1, 2 ou 3, diante disso vamos tratar
            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3){
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida");
                }

            } catch(Exception e){
                System.out.println("Entrada invaálida, digite novamente \n");
            }
        }
        return opcao;
    }
}
