package br.edu.principal;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    public static void adicionaContato(Scanner userInput, List<String> nomesContatos, List<String> numerosContatos, List<String> emailsContatos) {
        System.out.println("═════════════ Adicionar Contato ═════════════");

        System.out.print("Digite o nome: ");
        String nomeContato = userInput.nextLine();
        
        System.out.print("Digite o celular: ");
        String numeroContato = userInput.nextLine();

        System.out.print("Digite o e-mail: ");
        String emailContato = userInput.nextLine();

        nomesContatos.add(nomeContato);
        numerosContatos.add(numeroContato);
        emailsContatos.add(emailContato);

        System.out.println("Contato " + nomeContato + " foi adicionado com sucesso.");
    }

    public static void listarContato(List<String> nomesContatos, List<String> numerosContatos, List<String> emailsContatos) {
        System.out.println("══════════════ Listar Contatos ══════════════");

        if (nomesContatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } 
        
        else {
            for (int i = 0; i < nomesContatos.size(); i++) {
                System.out.println("-".repeat(45));
                System.out.println("   Nome: " + nomesContatos.get(i));
                System.out.println("Celular: " + numerosContatos.get(i));
                System.out.println(" E-mail: " + emailsContatos.get(i));
            }
            System.out.println("-".repeat(45));
        }
    }

    public static void procurarContato(Scanner userInput, List<String> nomesContatos, List<String> numerosContatos, List<String> emailsContatos) {
        System.out.println("══════════════ Procurar Contato ═════════════");

        if (nomesContatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } 
        
        else {
            System.out.print("Digite o nome que deseja procurar: ");
            String contatoNomeBusca = userInput.nextLine();
            boolean contatoEncontrado = false;

            for (int i = 0; i < nomesContatos.size(); i++) {
                if (nomesContatos.get(i).equalsIgnoreCase(contatoNomeBusca)) {
                	System.out.println("-".repeat(45));
                    System.out.println("   Nome: " + nomesContatos.get(i));
                    System.out.println("Celular: " + numerosContatos.get(i));
                    System.out.println(" E-mail: " + emailsContatos.get(i));

                    contatoEncontrado = true;
                }
            }
            
            if (!contatoEncontrado) {
                System.out.println("Contato não encontrado.");
            }
        }
    }

    public static void alterarContato(Scanner userInput, List<String> nomesContatos, List<String> numerosContatos, List<String> emailsContatos) {
        System.out.println("══════════════ Alterar Contato ══════════════");

        if (nomesContatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }

        System.out.print("Digite o nome que deseja procurar: ");
        int contatoIndice = -1;
        String contatoNomeBusca = userInput.nextLine();

        for (int i = 0; i < nomesContatos.size(); i++) {
            if (nomesContatos.get(i).equalsIgnoreCase(contatoNomeBusca)) {
                contatoIndice = i;
                break;
            }
        }

        if (contatoIndice != -1) {
            System.out.print("Digite o novo nome: ");
            String novoNomeContato = userInput.nextLine();

            System.out.print("Digite o novo celular: ");
            String novoNumeroContato = userInput.nextLine();

            System.out.print("Digite o novo e-mail: ");
            String novoEmailContato = userInput.nextLine();

            nomesContatos.set(contatoIndice, novoNomeContato);
            numerosContatos.set(contatoIndice, novoNumeroContato);
            emailsContatos.set(contatoIndice, novoEmailContato);

            System.out.println("Contato alterado com sucesso.");
        } 
        
        else {
            System.out.println("Contato não encontrado.");
        }
    }

    public static void excluirContato(Scanner userInput, List<String> nomesContatos, List<String> numerosContatos, List<String> emailsContatos) {
        System.out.println("══════════════ Excluir Contato ══════════════");

        if (nomesContatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } 
        
        else {
            System.out.print("Digite o nome do contato que deseja excluir: ");
            String contatoNomeBusca = userInput.nextLine();
            int contatoIndice = -1;

            for (int i = 0; i < nomesContatos.size(); i++) {
                if (nomesContatos.get(i).equalsIgnoreCase(contatoNomeBusca)) {
                    contatoIndice = i;
                    break;
                }
            }

            if (contatoIndice == -1) {
                System.out.println("Nenhum contato encontrado.");
            } 
            
            else {
                nomesContatos.remove(contatoIndice);
                numerosContatos.remove(contatoIndice);
                emailsContatos.remove(contatoIndice);

                System.out.println("Contato excluído com sucesso.");
            }
        }
    }
}
