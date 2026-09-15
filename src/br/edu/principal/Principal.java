package br.edu.principal;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean userContinue = true;
		int opcao;
		
		List<String> nomesContatos = new ArrayList<>(), numerosContatos = new ArrayList<>(), emailsContatos = new ArrayList<>();

		mostraIntro();

		while(userContinue) {
			
			mostraMenu();
			opcao = selecionaOpcao(userInput);

			switch(opcao) {
				default -> System.out.println("Opção Inválida. Tente Novamente.");

				case 1  -> adicionaContato(userInput, nomesContatos, numerosContatos, emailsContatos);

				case 2  -> listarContato(nomesContatos, numerosContatos, emailsContatos);

				case 3  -> procurarContato(userInput, nomesContatos, numerosContatos, emailsContatos);

				case 4  -> alterarContato(userInput, nomesContatos, numerosContatos, emailsContatos);

				case 5  -> excluirContato(userInput, nomesContatos, numerosContatos, emailsContatos);

				case 6  -> {
					System.out.println("Saindo...");
					userContinue = false;
				}

			}

		}

	}

	public static void mostraIntro() {
    	System.out.println("╔══════════════════════════════════════╗");
    	System.out.println("║          AGENDA DE CONTATOS          ║");
    	System.out.println("║               v1.0.0                 ║");
    	System.out.println("╠══════════════════════════════════════╣");
    	System.out.println("║              Bem-vindo!              ║");
    	System.out.println("╚══════════════════════════════════════╝");
	}

	public static void mostraMenu() {
		System.out.println();
		System.out.println("1 - Adicionar Contato");
		System.out.println("2 - Listar Contato");
		System.out.println("3 - Procurar Contato");
		System.out.println("4 - Alterar Contato");
		System.out.println("5 - Excluir Contato");
		System.out.println("6 - Sair");
		System.out.println();
	}

	public static int selecionaOpcao(Scanner userInput) {
    	System.out.print("Selecione a opção desejada: ");
        int opc = userInput.nextInt();
        userInput.nextLine();  // Limpa o buffer do teclado
        return opc;
    }

	public static void adicionaContato(Scanner userInput, List<String> nomesContatos, List<String> numerosContatos, List<String> emailsContatos) {
		System.out.println("═════════════ Adicionar Contato ═════════════");

		System.out.print("Nome: ");
        String nomeContato = userInput.nextLine();

        System.out.print("Telefone / Celular: ");
        String numeroContato = userInput.nextLine();

        System.out.print("E-mail: ");
        String emailContato = userInput.nextLine();

		nomesContatos.add(nomeContato);
        numerosContatos.add(numeroContato);
        emailsContatos.add(emailContato);

        System.out.println("Contato adicionado.");
	}

	public static void listarContato(List<String> nomesContatos, List<String> numerosContatos, List<String> emailsContatos) {
		System.out.println("══════════════ Listar Contatos ══════════════");

		if (nomesContatos.isEmpty()) {
			System.out.println("Nenhum contato cadastrado.");
		}

		else {
			for(int i = 0; i < nomesContatos.size(); i++) {
				System.out.println("\nContato " +  (i + 1));
				System.out.println("Nome   : " + nomesContatos.get(i));
				System.out.println("Celular: " + numerosContatos.get(i));
				System.out.println("E-mail : " + emailsContatos.get(i));
			}
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

			for(int i = 0; i < nomesContatos.size(); i++){
				if (nomesContatos.get(i).equalsIgnoreCase(contatoNomeBusca)) {
					System.out.println("Contato Encontrado:");
					System.out.println("Nome   : " + nomesContatos.get(i));
					System.out.println("Celular: " + numerosContatos.get(i));
					System.out.println("E-mail : " + emailsContatos.get(i));
					System.out.println();

					contatoEncontrado = true;
				}
			}

			if (!contatoEncontrado){
				System.out.println("Contato não encontrado.");
			}
		}		
	}

	public static void alterarContato(Scanner userInput, List<String> nomesContatos, List<String> numerosContatos, List<String> emailsContatos) {
		System.out.println("══════════════ Alterar Contato ══════════════");

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

			System.out.print("Digite o novo email: ");
			String novoEmailContato = userInput.nextLine();

			nomesContatos.set(contatoIndice, novoNomeContato);
			numerosContatos.set(contatoIndice, novoNumeroContato);
			emailsContatos.set(contatoIndice, novoEmailContato);

			System.out.println();
			System.out.println("Contato alterado com sucesso!");

		} 
			
		else {
			System.out.println("Contato não encontrado!");
		}
	}

	public static void excluirContato(Scanner userInput, List<String> nomesContatos, List<String> numerosContatos, List<String> emailsContatos) {
		System.out.println("══════════════ Excluir Contato ══════════════");

		if (nomesContatos.isEmpty()) {
			System.out.println("Nenhum contato cadastrado.\n");
		}

		else {
			System.out.print("Digite o nome do contato que deseja excluir: ");
			String contatoNomeBusca = userInput.nextLine();
			int contatoIndice = -1;

			for(int i = 0; i < nomesContatos.size(); i++){
				if(nomesContatos.get(i).equalsIgnoreCase(contatoNomeBusca)) {
					contatoIndice = i;
					break;
				}
			}
			
			if (contatoIndice == -1) {
				System.out.println("Nenhum contato encontrado.\n");
			}

			else{
				nomesContatos.remove(contatoIndice);
				numerosContatos.remove(contatoIndice);
				emailsContatos.remove(contatoIndice);

				System.out.println("Contato excluído com sucesso.");
			}
		}
	}

}
