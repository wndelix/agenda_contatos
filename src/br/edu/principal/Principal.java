package br.edu.principal;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		List<String> nomesContatos = new ArrayList<>();
		List<String> numerosContatos = new ArrayList<>();
		List<String> emailsContatos = new ArrayList<>();
		
		Scanner userInput = new Scanner(System.in);
		boolean userContinue = true;
		int opcao;
		
		Utils.mostrarIntro();

		while(userContinue) {
			Utils.mostrarMenu();
			opcao = Utils.selecionarOpcao(userInput);

			switch(opcao) {
				default -> System.out.println("Opção Inválida. Tente Novamente.");
				case 1  -> Agenda.adicionaContato(userInput, nomesContatos, numerosContatos, emailsContatos);
				case 2  -> Agenda.listarContato(nomesContatos, numerosContatos, emailsContatos);
				case 3  -> Agenda.procurarContato(userInput, nomesContatos, numerosContatos, emailsContatos);
				case 4  -> Agenda.alterarContato(userInput, nomesContatos, numerosContatos, emailsContatos);
				case 5  -> Agenda.excluirContato(userInput, nomesContatos, numerosContatos, emailsContatos);
				case 6  -> {
					System.out.println("Saindo...");
					userContinue = false;
				}
			}
		}
	}
}
