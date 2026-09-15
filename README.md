```markdown
# Agenda de Contatos

Projeto de uma agenda de contatos desenvolvida em **Java**, com o objetivo de praticar conceitos fundamentais da linguagem, estruturas de dados, manipulação de coleções e modularização de código.

A aplicação funciona através do terminal e permite cadastrar, visualizar, pesquisar, alterar e excluir contatos durante sua execução.

---

## Novidades da versão 1.0.0

A versão **1.0.0** adiciona a **modularização do código em métodos estáticos**, organizando a lógica da aplicação em funções específicas para cada operação.

Agora o código é dividido em métodos como adicionar, listar, pesquisar, alterar e excluir, deixando a classe principal mais limpa, legível e organizada.

### Principais alterações

* Refatoração completa do código utilizando métodos estáticos.
* Criação de métodos específicos para exibição de menu e inicialização.
* Organização do fluxo principal de execução (`main`) utilizando um loop de repetição e estrutura de seleção.
* Manutenção de todas as funcionalidades anteriores (adicionar, listar, pesquisar, alterar, excluir e gerenciar listas sem limite fixo).

---

## Funcionalidades

Atualmente, a agenda permite:

* Adicionar contatos.
* Listar todos os contatos cadastrados.
* Procurar contatos pelo nome.
* Alterar contatos existentes.
* Excluir contatos.
* Armazenar nome, número de celular e e-mail.
* Comparar nomes ignorando diferenças entre letras maiúsculas e minúsculas.
* Adicionar contatos sem um limite fixo.
* Informar quando não existem contatos cadastrados.
* Informar quando uma pesquisa não encontra resultados.

---

## Funcionamento

Ao iniciar o programa, a tela de apresentação e o menu são exibidos:

```text
╔══════════════════════════════════════╗
║          AGENDA DE CONTATOS          ║
║               v1.0.0                 ║
╠══════════════════════════════════════╝
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

### Adicionar contato

O usuário informa os dados do novo contato:

```text
═════════════ Adicionar Contato ═════════════
Nome: Ana Souza
Telefone / Celular: (85) 98888-7777
E-mail: ana.souza@email.com
Contato adicionado.

```

Os dados são adicionados às listas correspondentes utilizando o método `add()`.

---

### Listar contatos

Todos os contatos cadastrados são percorridos e exibidos:

```text
══════════════ Listar Contatos ══════════════

Contato 1
Nome   : Ana Souza
Celular: (85) 98888-7777
E-mail : ana.souza@email.com

```

---

### Procurar contato

A pesquisa é realizada pelo nome utilizando:

```java
equalsIgnoreCase()

```

Dessa forma, valores como:

```text
João
JOÃO
joão

```

são considerados equivalentes durante a pesquisa.

Exemplo de tela de busca:

```text
══════════════ Procurar Contato ═════════════
Digite o nome que deseja procurar: Ana Souza
Contato Encontrado:
Nome   : Ana Souza
Celular: (85) 98888-7777
E-mail : ana.souza@email.com

```

---

### Alterar contato

A opção de alteração solicita inicialmente o nome do contato:

```text
══════════════ Alterar Contato ══════════════
Digite o nome que deseja procurar: Ana Souza

```

Após encontrar o contato, o programa solicita os novos dados:

```text
Digite o novo nome: Ana Clara Souza
Digite o novo celular: (85) 99999-8888
Digite o novo email: anaclara@email.com

Contato alterado com sucesso!

```

Os valores existentes são substituídos utilizando o método `set()` e o índice correspondente encontrado na busca.

Caso nenhum contato seja encontrado, o programa informa:

```text
Contato não encontrado!

```

---

### Excluir contato

O programa procura o contato pelo nome, localiza seu índice, remove os dados correspondentes das três listas utilizando `remove()` e encerra a busca com o comando `break`.

Exemplo de tela de exclusão:

```text
══════════════ Excluir Contato ══════════════
Digite o nome do contato que deseja excluir: Ana Clara Souza
Contato excluído com sucesso.

```

Quando nenhum registro é localizado, a mensagem de aviso correspondente é exibida.

---

## Tecnologias utilizadas

* Java
* Java Collections Framework
* `Scanner`
* `List`
* `ArrayList`

---

## Estrutura do projeto

A lógica da aplicação está concentrada na classe `Principal`, dividida em diversos métodos estáticos.

```text
src/
└── br/
    └── edu/
        └── principal/
            └── Principal.java

```

Os contatos são armazenados utilizando três listas paralelas:

```java
List<String> nomesContatos = new ArrayList<>();
List<String> numerosContatos = new ArrayList<>();
List<String> emailsContatos = new ArrayList<>();

```

Os dados relacionados a um mesmo contato compartilham o mesmo índice nas três listas.

---

## Como executar

### Eclipse

Abra o projeto no Eclipse, localize a classe `Principal.java` e execute utilizando:

```text
Run As -> Java Application

```

### Terminal

Entre no diretório `src`:

```bash
cd src

```

Compile o programa:

```bash
javac br/edu/principal/Principal.java

```

Execute:

```bash
java br.edu.principal.Principal

```

É necessário possuir um ambiente de desenvolvimento Java (JDK) instalado no sistema.

---

## Conceitos praticados

### Estruturas de controle

```java
while
switch
if
else
for
break

```

### Modularização e métodos

```java
Métodos estáticos (public static void / int)
Passagem de parâmetros por valor e referências de listas
Retorno de valores

```

### Entrada de dados

```java
Scanner

```

### Coleções

```java
List
ArrayList

```

### Métodos utilizados

```java
add()
get()
set()
remove()
size()
isEmpty()
equalsIgnoreCase()

```

Outros conceitos praticados incluem variáveis, tipos primitivos, operadores, controle de fluxo, busca de elementos, percorrimento de listas e alteração de valores armazenados.

---

## Limitações atuais

### Dados armazenados apenas em memória

Os contatos cadastrados existem apenas enquanto o programa está em execução. Ao encerrar a aplicação, os dados são perdidos.

### Dados separados em três listas

Cada contato depende do mesmo índice em listas separadas (`nomesContatos`, `numerosContatos`, `emailsContatos`).

### Pesquisa baseada no nome completo

A pesquisa exige que o nome seja informado de forma correspondente para encontrar o registro.

---

## Evolução do projeto

| Versão | Alterações |
| --- | --- |
| `0.0.0` | Implementação inicial da agenda |
| `0.1.0` | Suporte a múltiplos contatos utilizando arrays, além de listagem, pesquisa e exclusão |
| `0.2.0` | Migração para `ArrayList` e remoção do limite fixo de contatos |
| `0.3.0` | Adição da funcionalidade de alteração de contatos utilizando `set()` |
| `1.0.0` | Refatoração e modularização completa do código em métodos estáticos |

---

## Licença

Este projeto possui finalidade educacional.

---

## Objetivo

O principal objetivo deste projeto é acompanhar o aprendizado em **Java**, aplicando novos conceitos progressivamente em uma aplicação simples, modularizada e funcional.

```

```
