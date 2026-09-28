# Agenda de Contatos

Aplicação de agenda de contatos desenvolvida em **Java** para fins educacionais, com foco no aprendizado de programação, estruturas de dados, modularização e organização de código.

A aplicação funciona pelo terminal e permite cadastrar, visualizar, pesquisar, alterar e excluir contatos durante a execução.

## Versão

**1.1.0**

## Funcionalidades

A aplicação oferece as seguintes operações:

- Adicionar contatos
- Listar contatos cadastrados
- Pesquisar contatos pelo nome
- Alterar dados de contatos
- Excluir contatos
- Armazenar nome, telefone e e-mail
- Pesquisa de nomes sem diferenciação entre maiúsculas e minúsculas
- Quantidade de contatos limitada apenas pela memória disponível
- Mensagens de feedback para operações realizadas e situações sem resultados

## Demonstração

Ao iniciar a aplicação, uma tela de apresentação e o menu principal são exibidos:

```text
╔══════════════════════════════════════╗
║          AGENDA DE CONTATOS          ║
║                v1.1.0                ║
╠══════════════════════════════════════╣
║              Bem-vindo!              ║
╚══════════════════════════════════════╝

1 - Adicionar Contato
2 - Listar Contato
3 - Procurar Contato
4 - Alterar Contato
5 - Excluir Contato
6 - Sair

Selecione a opção desejada:
```

### Cadastro

Para cadastrar um contato, são solicitados nome, telefone e e-mail:

```text
═════════════ Adicionar Contato ═════════════
Digite o nome: Ana Souza
Digite o celular: (85) 98888-7777
Digite o e-mail: ana.souza@email.com
Contato Ana Souza foi adicionado com sucesso.
```

### Pesquisa

A pesquisa é realizada pelo nome e utiliza `equalsIgnoreCase()`, permitindo localizar o mesmo nome independentemente de diferenças entre letras maiúsculas e minúsculas.

```text
══════════════ Procurar Contato ═════════════
Digite o nome que deseja procurar: Ana Souza
---------------------------------------------
   Nome: Ana Souza
Celular: (85) 98888-7777
 E-mail: ana.souza@email.com
---------------------------------------------
```

### Alteração

A aplicação permite substituir os dados de um contato existente:

```text
══════════════ Alterar Contato ══════════════
Digite o nome que deseja procurar: Ana Souza
Digite o novo nome: Ana Clara Souza
Digite o novo celular: (85) 99999-8888
Digite o novo e-mail: anaclara@email.com
Contato alterado com sucesso.
```

### Exclusão

Um contato pode ser localizado pelo nome e removido da agenda:

```text
══════════════ Excluir Contato ══════════════
Digite o nome do contato que deseja excluir: Ana Clara Souza
Contato excluído com sucesso.
```

## Estrutura do projeto

A aplicação está organizada em três classes principais:

```text
src/
└── br/
    └── edu/
        └── principal/
            ├── Principal.java
            ├── Agenda.java
            └── Utils.java
```

### `Principal.java`

Responsável pelo ponto de entrada da aplicação e pelo controle do fluxo principal.

O menu é executado dentro de um loop e as operações são direcionadas para os métodos correspondentes da classe `Agenda`.

### `Agenda.java`

Concentra as operações relacionadas aos contatos:

- `adicionaContato()`
- `listarContato()`
- `procurarContato()`
- `alterarContato()`
- `excluirContato()`

Os dados são manipulados por meio de listas recebidas como parâmetros.

### `Utils.java`

Responsável por funcionalidades auxiliares da interface, incluindo:

- Tela de apresentação
- Exibição do menu
- Leitura da opção escolhida
- Janela de informações sobre o programa

A versão atual da aplicação é apresentada como `v1.1.0`.

## Tecnologias

- **Java**
- **Java Collections Framework**
- `List`
- `ArrayList`
- `Scanner`
- `JOptionPane`

## Conceitos praticados

O projeto utiliza diversos conceitos fundamentais da linguagem Java:

### Controle de fluxo

```java
while
switch
if
else
for
break
```

### Coleções

```java
List
ArrayList
```

### Entrada de dados

```java
Scanner
```

### Manipulação de listas

```java
add()
get()
set()
remove()
size()
isEmpty()
```

### Comparação de strings

```java
equalsIgnoreCase()
```

### Modularização

A lógica foi distribuída entre diferentes métodos e classes, evitando concentrar todas as responsabilidades no método `main`.

## Armazenamento dos contatos

Atualmente, cada contato é representado por três listas:

```java
List<String> nomesContatos = new ArrayList<>();
List<String> numerosContatos = new ArrayList<>();
List<String> emailsContatos = new ArrayList<>();
```

Os dados correspondentes a um contato compartilham o mesmo índice nas três listas.

Por exemplo:

```text
Índice 0
├── Nome:    Ana Souza
├── Telefone: (85) 98888-7777
└── E-mail:   ana.souza@email.com
```

## Como executar

### Eclipse

1. Abra o projeto no Eclipse.
2. Localize `Principal.java`.
3. Execute a classe como uma aplicação Java:

```text
Run As → Java Application
```

### Terminal

Entre no diretório `src`:

```bash
cd src
```

Compile o projeto:

```bash
javac br/edu/principal/*.java
```

Execute a aplicação:

```bash
java br.edu.principal.Principal
```

É necessário ter um **JDK (Java Development Kit)** instalado.

## Limitações atuais

A versão atual possui algumas limitações conhecidas:

- Os contatos são armazenados apenas em memória.
- Os dados são perdidos quando a aplicação é encerrada.
- Nome, telefone e e-mail são mantidos em listas separadas.
- A pesquisa é baseada no nome informado pelo usuário.
- Não existe persistência em arquivo ou banco de dados.
- Não há validação específica para telefone ou e-mail.

Essas limitações fazem parte do estágio atual do projeto e podem ser abordadas em versões futuras.

## Evolução do projeto

| Versão | Alterações |
|---|---|
| `0.0.0` | Implementação inicial da agenda |
| `0.1.0` | Suporte a múltiplos contatos utilizando arrays, além de listagem, pesquisa e exclusão |
| `0.2.0` | Migração para `ArrayList` e remoção do limite fixo de contatos |
| `0.3.0` | Adição da funcionalidade de alteração de contatos utilizando `set()` |
| `1.0.0` | Refatoração e modularização do código em métodos estáticos |
| `1.1.0` | Organização da aplicação em classes `Principal`, `Agenda` e `Utils`, além da evolução da interface do programa |

## Próximos passos

Possíveis evoluções para versões futuras:

- Criar uma classe `Contato`
- Substituir as listas paralelas por uma coleção de objetos
- Implementar persistência dos contatos
- Adicionar validação de dados
- Permitir pesquisas mais flexíveis
- Melhorar a interface do terminal
- Adicionar testes automatizados
- Implementar persistência utilizando arquivos ou banco de dados

## Objetivo

O projeto acompanha a evolução do aprendizado em **Java**, permitindo aplicar novos conceitos progressivamente em uma aplicação prática.

A agenda serve como projeto de estudo para experimentar estruturas de dados, métodos, classes, modularização e organização de código.

## Licença

Projeto desenvolvido para fins educacionais.
