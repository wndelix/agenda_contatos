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
}
