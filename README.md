# Agenda de Contatos em Java

Aplicação de console desenvolvida em Java para gerenciamento simples de contatos por meio de um menu interativo.

O projeto tem finalidade educacional e acompanha a evolução do aprendizado de fundamentos da linguagem, como arrays, estruturas de repetição e decisão, entrada de dados com `Scanner` e manipulação de strings.

**Versão atual:** `0.1.0`  

---

## Novidades da versão 0.1.0

A versão `0.1.0` amplia a implementação inicial da agenda e passa a permitir o gerenciamento de múltiplos contatos durante a execução do programa.

Principais melhorias:

- suporte a até **5 contatos** simultaneamente;
- armazenamento de nome, telefone e e-mail em arrays;
- listagem de todos os contatos cadastrados;
- pesquisa por nome sem diferenciar letras maiúsculas e minúsculas;
- exclusão de um contato específico pelo nome;
- reorganização dos arrays após uma exclusão;
- controle da quantidade de contatos cadastrados;
- mensagens para agenda vazia, agenda cheia e contato não encontrado.

---

## Funcionalidades

### Adicionar contato

Permite cadastrar um novo contato com:

- nome;
- número de telefone;
- e-mail.

A agenda possui, nesta versão, capacidade máxima para **5 contatos**.

### Listar contatos

Exibe todos os contatos cadastrados, numerados de acordo com a posição ocupada na agenda.

Exemplo:

```text
Contato 1
Nome   : João Silva
Celular: (85) 99999-9999
E-mail : joao@email.com

Contato 2
Nome   : Maria Souza
Celular: (85) 98888-8888
E-mail : maria@email.com
```

### Procurar contato

Permite procurar um contato pelo nome completo.

A comparação utiliza `equalsIgnoreCase()`, portanto a busca não diferencia letras maiúsculas de minúsculas.

```text
Digite o nome que deseja procurar: joão silva

Contato Encontrado:
Nome   : João Silva
Celular: (85) 99999-9999
E-mail : joao@email.com
```

### Excluir contato

Remove um contato informado pelo nome.

Após a exclusão, os contatos posicionados depois dele são deslocados para manter os dados armazenados de forma contínua nos arrays.

### Sair

Encerra a execução da aplicação.

---

## Funcionamento

Ao iniciar, a aplicação apresenta um menu com as operações disponíveis:

```text
Agenda de Contatos v.0.1.0

1 - Adicionar Contato
2 - Listar Contato
3 - Procurar Contato
4 - Excluir Contato
5 - Sair

Selecione a opção desejada:
```

O menu permanece ativo até que a opção **5 - Sair** seja selecionada.

---

## Tecnologias e conceitos utilizados

- **Java**
- **Scanner** para entrada de dados pelo terminal
- **Arrays** para armazenamento dos contatos
- estruturas de repetição `while` e `for`
- estruturas condicionais `if` / `else`
- `switch` para processamento das opções do menu
- `equalsIgnoreCase()` para comparação de nomes

O projeto pode ser desenvolvido e executado em qualquer ambiente com um JDK compatível. O Eclipse IDE é opcional.

---

## Estrutura atual

```text
agenda_contatos/
├── bin/
│   └── br/
│       └── edu/
│           └── principal/
│               └── Principal.class
├── LICENSE
├── README.md
└── src/
    └── br/
        └── edu/
            └── principal/
                └── Principal.java
```

| Arquivo/Diretório | Descrição |
|---|---|
| `src/` | Código-fonte do projeto |
| `src/br/edu/principal/` | Pacote principal da aplicação |
| `Principal.java` | Classe que contém o fluxo atual da agenda |
| `bin/` | Arquivos compilados `.class` |
| `LICENSE` | Licença do projeto |
| `README.md` | Documentação |

---

## Como executar

### Pré-requisitos

É necessário ter um **JDK (Java Development Kit)** instalado.

Para verificar a instalação:

```bash
java --version
javac --version
```

### Pelo terminal

Entre no diretório do projeto:

```bash
cd agenda_contatos
```

Compile o código:

```bash
javac -d bin src/br/edu/principal/Principal.java
```

Execute a aplicação:

```bash
java -cp bin br.edu.principal.Principal
```

### Pelo Eclipse

1. Abra ou importe o projeto no Eclipse.
2. Localize `src/br/edu/principal/Principal.java`.
3. Clique com o botão direito no arquivo.
4. Selecione **Run As → Java Application**.
5. Utilize o console para interagir com a agenda.

---

## Implementação atual

Nesta versão, os dados são armazenados em três arrays paralelos:

```java
String[] contactsName = new String[maxContacts];
String[] contactsNumber = new String[maxContacts];
String[] contactsEmail = new String[maxContacts];
```

A variável `contactCount` controla quantas posições estão efetivamente ocupadas.

A listagem e a pesquisa percorrem apenas os contatos cadastrados:

```java
for (int i = 0; i < contactCount; i++) {
    // processamento do contato
}
```

Na exclusão, os elementos posteriores ao contato removido são deslocados uma posição para a esquerda. A última posição utilizada é limpa e `contactCount` é decrementado.

Essa abordagem é suficiente para a proposta atual do projeto e permite praticar diretamente o funcionamento de arrays antes da adoção de coleções dinâmicas.

---

## Limitações atuais

A versão `0.1.0` ainda possui algumas limitações intencionais:

- capacidade fixa de **5 contatos**;
- dados mantidos apenas em memória;
- todos os contatos são perdidos ao encerrar o programa;
- pesquisa apenas por correspondência completa do nome;
- ausência de validação de telefone e e-mail;
- ausência de edição de contatos já cadastrados;
- toda a lógica ainda está concentrada na classe `Principal`;
- não há persistência em arquivo ou banco de dados.

---

## Próximos passos

Algumas evoluções planejadas ou possíveis para as próximas versões são:

- substituir os arrays fixos por `ArrayList`;
- criar uma classe `Contato` para representar cada registro;
- separar as responsabilidades da aplicação em diferentes classes;
- permitir edição de contatos;
- implementar pesquisa parcial por nome;
- validar telefone e e-mail;
- adicionar persistência em arquivo;
- posteriormente, estudar integração com banco de dados e interface gráfica.

Uma estrutura futura pode seguir este formato:

```text
src/
└── br/
    └── edu/
        └── principal/
            ├── Principal.java
            ├── Contato.java
            └── Agenda.java
```

Nesse modelo:

- `Principal.java` inicia a aplicação e controla a interação com o usuário;
- `Contato.java` representa os dados de um contato;
- `Agenda.java` concentra as operações de cadastro, busca, listagem e exclusão.

---

## Evolução do projeto

| Versão | Principais mudanças |
|---|---|
| `0.0.0` | Implementação inicial com gerenciamento de um único contato |
| `0.1.0` | Suporte a múltiplos contatos com arrays, listagem, busca e exclusão por nome |
| `0.2.0` | Planejada: adoção de coleções dinâmicas e evolução da estrutura interna |

---

## Objetivo

O objetivo do projeto é desenvolver uma agenda funcional enquanto conceitos de Java são aplicados gradualmente em um projeto real e de escopo controlado.

A evolução das versões serve também para registrar a transição de uma implementação básica para estruturas mais flexíveis, incluindo coleções, orientação a objetos e persistência de dados.

---

## Licença

Os termos de uso e distribuição estão disponíveis no arquivo `LICENSE` presente na raiz do projeto.
