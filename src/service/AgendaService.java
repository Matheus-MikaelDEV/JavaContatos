package service;

import model.agenda.Contato;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AgendaService {
    Scanner sc = new Scanner(System.in);

    List<Contato> contatos = new ArrayList<>();

    public AgendaService() {

        try (BufferedReader br = new BufferedReader(new FileReader("contatos.txt"))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(", ");

                Integer id = Integer.parseInt(dados[0].replace("ID: ", ""));
                String nome = dados[1].replace("Nome: ", "");
                String numero = dados[2].replace("Número: ", "");
                String email = dados[3].replace("Email: ", "");

                Contato contato = new Contato(id, nome, numero, email);
                contatos.add(contato);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Nenhum contato encontrado...");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void adicionarContato() {
        System.out.print("Digite o nome do contato: ");
        String nome = sc.nextLine();
        System.out.print("Digite o número do contato (sem espaços ou caracteres especiais): ");
        String numero = sc.nextLine();
        System.out.print("Digite o email do contato: ");
        String email = sc.nextLine();
        Contato contato = new Contato(contatos.size() + 1, nome, numero, email);
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void removerPorID() {
        try {
            System.out.print("Digite o ID do contato que deseja remover: ");
            Integer id = sc.nextInt();
            sc.nextLine();

            boolean removido = contatos.removeIf(contato -> contato.getId().equals(id));

            if (removido == true) {
                System.out.println("Contato removido com sucesso!");
            } else {
                System.out.println("O contato com o ID: " + id + " não foi encontrado...");
            }
        } catch (InputMismatchException e) {
            System.out.println("O ID deve ser um número inteiro...");
            sc.nextLine();
        }
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Não há contatos cadastrados...");
            return;
        }

        for (Contato contato : contatos) {
            System.out.println(contato.mostrarInfo());
        }
    }

    public void salvarArquivos() {
        if (contatos.isEmpty()) {
            System.out.println("Não há contatos cadastrados para salvar...");
            return;
        } else {
            try(BufferedWriter bw = new BufferedWriter(new FileWriter("contatos.txt"))) {

                for (Contato contato : contatos) {
                    bw.write("ID: " + contato.getId() + ", Nome: " + contato.getNome() + ", Número: " + contato.getNumero() + ", Email: " + contato.getEmail());
                    bw.newLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Contato> getContatos() {
        return contatos;
    }
}