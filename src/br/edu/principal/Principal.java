package br.edu.principal;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean userContinue = true, contactFound = false;
		int option, contactIndex = -1;
		String newContactName = "", newContactNumber = "", newContactEmail = "", contactNameSearch = "";
		List<String> contactsName = new ArrayList<>(), contactsNumber = new ArrayList<>(), contactsEmail = new ArrayList<>();

		System.out.print("Agenda de Contatos v.0.3.0");

		while(userContinue) {
			System.out.println("\n1 - Adicionar Contato");
			System.out.println("2 - Listar Contato");
			System.out.println("3 - Procurar Contato");
			System.out.println("4 - Alterar Contato");
			System.out.println("5 - Excluir Contato");
			System.out.println("6 - Sair\n");

			System.out.print("Selecione a opção desejada: ");
			option = userInput.nextInt();
			userInput.nextLine();

			switch(option) {
				default -> System.out.println("Opção Inválida. Tente Novamente.");

				case 1  -> {
						System.out.print("Nome: ");
						contactsName.add(userInput.nextLine());

						System.out.print("Número: ");
						contactsNumber.add(userInput.nextLine());

						System.out.print("E-mail: ");
						contactsEmail.add(userInput.nextLine());

						System.out.println("Contato salvo com sucesso.\n");
					}

				case 2  -> {
					if (contactsName.isEmpty()) {
						System.out.println("Nenhum contato cadastrado.\n");
					}

					else {
						for(int i = 0; i < contactsName.size(); i++) {
							System.out.println("\nContato " +  (i + 1));
							System.out.println("Nome   : " + contactsName.get(i));
							System.out.println("Celular: " + contactsNumber.get(i));
							System.out.println("E-mail : " + contactsEmail.get(i));
						}
					}
				}

				case 3  -> {
					if (contactsName.isEmpty()) {
						System.out.println("Nenhum contato cadastrado.\n");
					}

					else {
						System.out.print("Digite o nome que deseja procurar: ");
						contactNameSearch = userInput.nextLine();

						contactFound = false;

						for(int i = 0; i < contactsName.size(); i++){
							if(contactsName.get(i).equalsIgnoreCase(contactNameSearch)) {
								System.out.println("Contato Encontrado:");
								System.out.println("Nome   : " + contactsName.get(i));
								System.out.println("Celular: " + contactsNumber.get(i));
								System.out.println("E-mail : " + contactsEmail.get(i));
								System.out.println();

								contactFound = true;
							}
						}
						if(!contactFound){
							System.out.println("Contato não encontrado.\n");
						}
					}
				}

				case 4 -> {
					System.out.print("Digite o nome que deseja procurar: ");
					contactNameSearch = userInput.nextLine();
					contactIndex = -1;

					for (int i = 0; i < contactsName.size(); i++) {
						if (contactsName.get(i).equalsIgnoreCase(contactNameSearch)) {
							contactIndex = i;
							break;
						}
					}

					if (contactIndex != -1) {
						System.out.print("Digite o novo nome: ");
						newContactName = userInput.nextLine();

						System.out.print("Digite o novo celular: ");
						newContactNumber = userInput.nextLine();

						System.out.print("Digite o novo email: ");
						newContactEmail = userInput.nextLine();

						contactsName.set(contactIndex, newContactName);
						contactsNumber.set(contactIndex, newContactNumber);
						contactsEmail.set(contactIndex, newContactEmail);

						System.out.println("\nContato alterado com sucesso!");
					} else {
						System.out.println("Contato não encontrado!");
					}
				}


				case 5  -> {
					if (contactsName.isEmpty()) {
						System.out.println("Nenhum contato cadastrado.\n");
					}

					else {
						System.out.print("Digite o nome do contato que deseja excluir: ");
						contactNameSearch = userInput.nextLine();

						contactIndex = -1;

						for(int i = 0; i < contactsName.size(); i++){
							if(contactsName.get(i).equalsIgnoreCase(contactNameSearch)) {
								contactIndex = i;
							}
						}
						if(contactIndex == -1) {
							System.out.println("Nenhum contato encontrado.\n");
						}
						else{
							contactsName.remove(contactIndex);
							contactsNumber.remove(contactIndex);
							contactsEmail.remove(contactIndex);

							System.out.println("Contato excluído com sucesso.");
						}
					}
				}

				case 6  -> {
					System.out.println("Saindo...");
					userContinue = false;
				}

			}

		}

	}

}