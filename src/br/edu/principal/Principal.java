package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean userContinue = true, contactFound = false;
		int option, maxContacts = 5, contactCount = 0, indexToDelete = -1;

		String[] contactsName = new String[maxContacts], contactsNumber = new String[maxContacts], contactsEmail = new String[maxContacts];
		String contactNameSearch = "";

		// To be added (v0.2.0)
		// List<String> contactsName = new ArrayList<>(), contactsNumber = new ArrayList<>(), contactsEmail = new ArrayList<>();

		System.out.print("Agenda de Contatos v.0.1.0");

		while(userContinue) {
			System.out.println("\n1 - Adicionar Contato");
			System.out.println("2 - Listar Contato");
			System.out.println("3 - Procurar Contato");
			System.out.println("4 - Excluir Contato");
			System.out.println("5 - Sair\n");
		
			System.out.print("Selecione a opção desejada: ");
			option = userInput.nextInt();
			userInput.nextLine();
		
			switch(option) {
				default -> System.out.println("Opção Inválida. Tente Novamente.");
				
				case 1  -> {
					if(contactCount == maxContacts){
						System.out.println("Agenda cheia.\n");
					}

					else{
						System.out.print("Nome: ");
						contactsName[contactCount] = userInput.nextLine();

						System.out.print("Número: ");
						contactsNumber[contactCount] = userInput.nextLine();

						System.out.print("E-mail: ");
						contactsEmail[contactCount] = userInput.nextLine();

						contactCount++;

						System.out.println("Contato salvo com sucesso.\n");
					}
				}
				
				case 2  -> {
					if (contactCount == 0) {
						System.out.println("Nenhum contato cadastrado.\n");
					}
					
					else {
						for(int i = 0; i < contactCount; i++){
							System.out.println("\nContato " +  (i+ 1));
							System.out.println("Nome   : " + contactsName[i]);
							System.out.println("Celular: " + contactsNumber[i]);
							System.out.println("E-mail : " + contactsEmail[i]);
						}
					}
				}
				
				case 3  -> {
					if (contactCount == 0) {
						System.out.println("Nenhum contato cadastrado.\n");
					}
					
					else {
						System.out.print("Digite o nome que deseja procurar: ");
    	                contactNameSearch = userInput.nextLine();

						contactFound = false;

						for(int i = 0; i < contactCount; i++){
							if(contactsName[i].equalsIgnoreCase(contactNameSearch)) {
								System.out.println("Contato Encontrado:");
								System.out.println("Nome   : " + contactsName[i]);
								System.out.println("Celular: " + contactsNumber[i]);
								System.out.println("E-mail : " + contactsEmail[i]);
								System.out.println();

								contactFound = true;
							}
						}
						if(!contactFound){
							System.out.println("Contato não encontrado.\n");
						}
					}
				}
				
				case 4  -> {
					if (contactCount == 0) {
						System.out.println("Nenhum contato cadastrado.\n");
					}
                    
                    else {
						System.out.print("Digite o nome do contato que deseja excluir: ");
						contactNameSearch = userInput.nextLine();

						indexToDelete = -1;

						for(int i = 0; i < contactCount; i++){
							if(contactsName[i].equalsIgnoreCase(contactNameSearch)) {
								indexToDelete = i;
							}
						}
						if(indexToDelete == -1) {
							System.out.println("Nenhum usuário encontrado.\n");
						}
						else{
							for(int i = indexToDelete; i < contactCount - 1; i++) {
								contactsName[i] = contactsName[i + 1];
								contactsNumber[i] = contactsNumber[i + 1];
								contactsEmail[i] = contactsEmail[i + 1];
							}
							contactsName[contactCount - 1] = null;
							contactsNumber[contactCount - 1] = null;
							contactsEmail[contactCount - 1] = null;

							contactCount--;

							System.out.println("Contato excluído com sucesso.");
						}
                    }
				}
				
				case 5  -> {
					System.out.println("Saíndo...");
					userContinue = false;
				}
				
			}

		}

	}

}
