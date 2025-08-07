package application;

import model.agenda.Contato;
import service.AgendaService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Sistema de Agenda de Contatos -----");

        AgendaService agendaService = new AgendaService();

        int opcao = 0;

        do {
            try {
                System.out.println("\n----- Menu -----");
                System.out.println("1 - Adicionar Contato\n2 - Remover Contato\n3 - Listar Todos os Contatos\n4 - Salvar os Contatos");
                System.out.print("Escolha: ");
                opcao = sc.nextInt();
                sc.nextLine();
                System.out.println("----- Menu -----");
            } catch (InputMismatchException e) {
                System.out.println("A opção deve ser um número inteiro...");
                sc.nextLine();
            }

            switch (opcao) {
                case 1:
                    agendaService.adicionarContato();
                    break;
                case 2:
                    agendaService.removerPorID();
                    break;
                case 3:
                    try {
                        agendaService.listarContatos();
                    } catch (StringIndexOutOfBoundsException e) {
                        System.out.println("Verifique qual contato está com o número incorreto e remova-o...");

                        for (Contato contato : agendaService.getContatos()) {
                            System.out.println(contato.infoSemFormatarNumero());
                        }

                        System.out.println();

                        agendaService.removerPorID();
                    }
                    break;
                case 4:
                    agendaService.salvarArquivos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida...");
                    break;
            }
        } while (opcao != 5);
    }
}