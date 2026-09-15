public static void mostrarIntro() {
    	System.out.println("╔══════════════════════════════════════╗");
    	System.out.println("║          AGENDA DE CONTATOS          ║");
    	System.out.println("║               v1.1.0                 ║");
    	System.out.println("╠══════════════════════════════════════╣");
    	System.out.println("║              Bem-vindo!              ║");
    	System.out.println("╚══════════════════════════════════════╝");
}

public static void mostrarMenu() {
		System.out.println();
		System.out.println("1 - Adicionar Contato");
		System.out.println("2 - Listar Contato");
		System.out.println("3 - Procurar Contato");
		System.out.println("4 - Alterar Contato");
		System.out.println("5 - Excluir Contato");
		System.out.println("6 - Sair");
		System.out.println();
}

public static int selecionarOpcao(Scanner userInput) {
    	System.out.print("Selecione a opção desejada: ");
      int opc = userInput.nextInt();
      userInput.nextLine();  // Limpa o buffer do teclado
      return opc;
}

public static void sobre() {
    	JOptionPane.showMessageDialog(null, "Desenvolvido por Wendel Peterson"
}
