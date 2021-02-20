package aula_36_labs;

import java.util.Scanner;

public class TesteAC {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe nome da agenda ");
        agenda.setNome(scanner.nextLine());
    }
}
