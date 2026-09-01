# 📒 Agenda de Contatos

Projeto de uma agenda de contatos desenvolvida em **Java** com o objetivo de praticar conceitos fundamentais da linguagem, estruturas de dados e organização de código.

A aplicação funciona através do terminal e permite adicionar, listar, procurar e excluir contatos durante sua execução.

---

## 📌 Novidades da versão 0.2.0

A versão **0.2.0** substitui o armazenamento baseado em arrays por coleções dinâmicas utilizando `ArrayList`.

### Principais alterações

* Migração de `String[]` para `ArrayList<String>`.
* Remoção do limite fixo de contatos.
* Uso de `add()` para adicionar novos contatos.
* Uso de `get()` para acessar informações armazenadas.
* Uso de `remove()` para excluir contatos.
* Uso de `size()` para percorrer a lista.
* Uso de `isEmpty()` para verificar se existem contatos cadastrados.
* Simplificação do gerenciamento dos dados da agenda.

Na versão anterior, a agenda possuía espaço limitado para armazenar contatos. Agora, as listas aumentam dinamicamente conforme novos contatos são adicionados.

---

## Funcionalidades

Atualmente, a agenda permite:

* Adicionar contatos.
* Listar todos os contatos cadastrados.
* Procurar contatos pelo nome.
* Excluir contatos pelo nome.
* Armazenar nome, número de telefone e e-mail.
* Comparar nomes ignorando diferenças entre letras maiúsculas e minúsculas.
* Adicionar contatos sem um limite fixo previamente definido.
* Informar quando não existem contatos cadastrados.
* Informar quando uma busca não encontra resultados.

---

## 🛠️ Funcionamento

Ao iniciar o programa, o seguinte menu é exibido:

```text
Agenda de Contatos v.0.2.0

1 - Adicionar Contato
2 - Listar Contato
3 - Procurar Contato
4 - Excluir Contato
5 - Sair

Selecione a opção desejada:
```

### Adicionar contato

O usuário informa:

```text
Nome: João
Número: 85999999999
E-mail: joao@email.com
```

Os dados são adicionados às listas correspondentes.

### Listar contatos

Todos os contatos cadastrados são exibidos:

```text
Contato 1
Nome   : João
Celular: 85999999999
E-mail : joao@email.com
```

### Procurar contato

A pesquisa é realizada pelo nome completo utilizando:

```java
equalsIgnoreCase()
```

Dessa forma, buscas como:

```text
João
JOÃO
joão
```

são consideradas equivalentes.

### Excluir contato

O programa procura o contato pelo nome e identifica sua posição nas listas.

Ao encontrar o contato, os dados correspondentes são removidos de:

```java
contactsName
contactsNumber
contactsEmail
```

utilizando:

```java
remove(indexToDelete)
```

---

## Tecnologias utilizadas

* Java
* Java Collections Framework
* `Scanner`
* `List`
* `ArrayList`

---

## Estrutura do projeto

Atualmente, a lógica da aplicação está concentrada na classe `Principal`.

```text
src/
└── br/
    └── edu/
        └── principal/
            └── Principal.java
```

O armazenamento dos contatos é realizado através de três listas:

```java
List<String> contactsName = new ArrayList<>();
List<String> contactsNumber = new ArrayList<>();
List<String> contactsEmail = new ArrayList<>();
```

Cada posição representa um mesmo contato.

Por exemplo:

```text
Índice          0
                │
contactsName   João
contactsNumber 85999999999
contactsEmail  joao@email.com
```

---

## ▶️ Como executar

### Eclipse

1. Importe ou abra o projeto no Eclipse.
2. Localize a classe `Principal.java`.
3. Execute utilizando:

```text
Run As → Java Application
```

### Terminal

Entre no diretório `src` do projeto:

```bash
cd src
```

Compile:

```bash
javac br/edu/principal/Principal.java
```

Execute:

```bash
java br.edu.principal.Principal
```

É necessário possuir o **JDK** instalado.

---

## 🧠 Conceitos praticados

O projeto utiliza diversos conceitos básicos de Java.

### Estruturas de controle

```java
while
switch
if
else
for
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

### Métodos de `ArrayList`

```java
add()
get()
remove()
size()
isEmpty()
```

### Comparação de Strings

```java
equalsIgnoreCase()
```

Também são praticados:

* Variáveis.
* Tipos primitivos.
* Operadores.
* Índices.
* Estruturas dinâmicas.
* Percorrimento de listas.
* Controle de fluxo.

---

## ⚠️ Limitações atuais

Apesar das melhorias da versão 0.2.0, o projeto ainda possui algumas limitações.

### Dados armazenados apenas em memória

Os contatos deixam de existir quando o programa é encerrado.

Ainda não existe persistência utilizando arquivos ou banco de dados.

### Informações separadas em três listas

Cada contato depende do mesmo índice em:

```java
contactsName
contactsNumber
contactsEmail
```

Isso funciona para o estágio atual do projeto, mas não representa a melhor organização para uma aplicação maior.

### Busca somente pelo nome completo

A busca utiliza:

```java
equalsIgnoreCase()
```

Portanto, ainda não é possível pesquisar apenas parte de um nome.

---

## 🚀 Próximos passos

Com a migração para `ArrayList` concluída, os próximos passos do projeto podem focar na organização do código utilizando orientação a objetos.

Uma possível estrutura futura é:

```text
src/
└── br/
    └── edu/
        ├── principal/
        │   └── Principal.java
        │
        ├── model/
        │   └── Contato.java
        │
        └── service/
            └── Agenda.java
```

### Melhorias planejadas

* Criar uma classe `Contato`.
* Agrupar nome, telefone e e-mail em um único objeto.
* Criar uma classe responsável pelo gerenciamento da agenda.
* Separar a interface do terminal da lógica da aplicação.
* Adicionar edição de contatos.
* Melhorar o sistema de busca.
* Validar entradas do usuário.
* Implementar persistência dos contatos.

---

## 📈 Evolução do projeto

| Versão  | Alterações                                                                    |
| ------- | ----------------------------------------------------------------------------- |
| `0.0.0` | Implementação inicial da agenda                                               |
| `0.1.0` | Suporte a múltiplos contatos utilizando arrays, listagem, pesquisa e exclusão |
| `0.2.0` | Migração para `ArrayList` e remoção do limite fixo de contatos                |

A evolução do projeto acompanha o aprendizado de novos conceitos da linguagem Java.

---

## 📄 Licença

Este projeto possui finalidade educacional.

---

## 🎓 Objetivo

O principal objetivo deste projeto é acompanhar a evolução do aprendizado em **Java**, começando com estruturas simples e aprimorando gradualmente a arquitetura da aplicação conforme novos conceitos são estudados.
