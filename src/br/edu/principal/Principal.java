package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner USERinput = new Scanner(System.in);
		String ContactName = "", ContactNumber = "", ContactEmail = "", ContactNameSearch = "";
		int option = 0;
		boolean USERcontinue = true;
		
		System.out.println("Agenda de Contatos v.0.0.0");
		
		while(USERcontinue) {
			System.out.println("1 - Adicionar Contato");
			System.out.println("2 - Listar Contato");
			System.out.println("3 - Procurar Contato");
			System.out.println("4 - Excluir Contato");
			System.out.println("5 - Sair\n");
		
			System.out.print("Selecione a opção desejada: ");
			option = USERinput.nextInt();
			USERinput.nextLine();
		
			switch(option) {
				default -> System.out.println("Opção Inválida. Tente Novamente.");
				
				case 1  -> {
					System.out.print("Nome: ");
					ContactName = USERinput.nextLine();
					
					System.out.print("Número: ");
					ContactNumber = USERinput.nextLine();
					
					System.out.print("Email: ");
					ContactEmail = USERinput.nextLine();
					
					System.out.println("\nContato \"" + ContactName + "\" foi salvo com sucesso.\n");
				}
				
				case 2  -> {
					if (ContactName.isEmpty()) {
						System.out.println("Nenhum contato cadastrado.\n");
					}
					
					else {
						System.out.println("Nome   : " + ContactName);
						System.out.println("Celular: " + ContactNumber);
						System.out.println("E-mail : " + ContactEmail);
						System.out.println();
					}
					
				}
				
				case 3  -> {
					if (ContactName.isEmpty()) {
						System.out.println("Nenhum contato cadastrado.\n");
					}
					
					else {
						System.out.print("Digite o nome que deseja procurar: ");
    	                ContactNameSearch = USERinput.nextLine();
    	                
    	                if (ContactName.equalsIgnoreCase(ContactNameSearch)) {
    	                	System.out.println("Contato Encontrado:");
    						System.out.println("Nome   : " + ContactName);
    						System.out.println("Celular: " + ContactNumber);
    						System.out.println("E-mail : " + ContactEmail);
    						System.out.println();
    	                }
    	                
    	                else {
    	                	System.out.println("Contato não encontrado.\n");
    	                }
					}
				}
				
				case 4  -> {
					
                    if (ContactName.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.\n");
                    } 
                    
                    else {
                    	ContactName = "";
                    	ContactNumber = "";
                    	ContactEmail = "";

                        System.out.println("Contato excluído.");
                    }
				}
				
				case 5  -> {
					System.out.println("Saíndo...");
					USERcontinue = false;
				}
				
			}

		}

	}

}