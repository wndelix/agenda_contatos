# 📒 Agenda de Contatos em Java

Aplicação de console desenvolvida em Java para gerenciamento básico de contatos. O projeto permite adicionar, listar, procurar e excluir contatos por meio de um menu interativo no terminal.

O projeto foi desenvolvido com fins educacionais, praticando conceitos fundamentais da linguagem Java, como variáveis, estruturas de repetição, estruturas condicionais, `switch`, entrada de dados com `Scanner` e organização de projetos.

---

## 📌 Funcionalidades

Atualmente, a aplicação oferece as seguintes operações:

### ➕ Adicionar contato

- **Nome**
- **Número de telefone**
- **E-mail**

### 📋 Listar contato

Exibe os dados do contato cadastrado.

### 🔎 Procurar contato

Permite pesquisar um contato pelo nome.

> A busca não diferencia letras maiúsculas de minúsculas.

### 🗑️ Excluir contato

Remove o contato atualmente armazenado.

### 🚪 Sair

Encerra a execução da aplicação.

---

## 🖥️ Funcionamento

Ao iniciar o programa, o usuário encontra o seguinte menu:

```text
Agenda de Contatos v.0.0.0

1 - Adicionar Contato
2 - Listar Contato
3 - Procurar Contato
4 - Excluir Contato
5 - Sair

Selecione a opção desejada:
```

### 📝 Exemplo de cadastro

```text
Selecione a opção desejada: 1

Nome: João Silva
Número: (85) 99999-9999
Email: joao@email.com

Contato "João Silva" foi salvo com sucesso.
```

### 🔎 Exemplo de pesquisa

```text
Selecione a opção desejada: 3

Digite o nome que deseja procurar: João Silva

Contato Encontrado:
Nome   : João Silva
Celular: (85) 99999-9999
E-mail : joao@email.com
```

---

## 🛠️ Tecnologias utilizadas

- **Java**
- **Java Scanner** para entrada de dados pelo terminal
- **Eclipse IDE** para desenvolvimento
- **Terminal/Console** para interação com o usuário

---

## 📂 Estrutura do projeto

A estrutura atual do projeto é:

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

### 📁 Diretórios e arquivos

| Arquivo/Diretório | Descrição |
|---|---|
| `src/` | Contém os arquivos-fonte do projeto |
| `src/br/edu/principal/` | Pacote principal da aplicação |
| `Principal.java` | Classe responsável pela execução do programa |
| `bin/` | Arquivos compilados `.class` |
| `LICENSE` | Licença do projeto |
| `README.md` | Documentação do projeto |

---

## ▶️ Como executar

### 📋 Pré-requisitos

Para executar o projeto, é necessário ter instalado:

- **JDK (Java Development Kit)**
- **Eclipse IDE**, caso queira executar o projeto pelo ambiente de desenvolvimento

### 💻 Executando pelo Eclipse

1. Abra o Eclipse.
2. Importe ou abra o projeto `agenda_contatos`.
3. Localize o arquivo:

```text
src/br/edu/principal/Principal.java
```

4. Clique com o botão direito sobre `Principal.java`.
5. Selecione:

**Run As → Java Application**

6. Utilize o console do Eclipse para interagir com a aplicação.

### ⌨️ Executando pelo terminal

Caso o Java esteja configurado no sistema, também é possível compilar e executar pelo terminal.

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

---

## 🧠 Conceitos de Java utilizados

O projeto utiliza diversos conceitos básicos da linguagem:

### 📥 Entrada de dados

A classe `Scanner` é utilizada para receber informações digitadas pelo usuário:

```java
Scanner USERinput = new Scanner(System.in);
```

### 🔄 Estrutura de repetição

O menu permanece disponível enquanto a variável de controle for verdadeira:

```java
while (USERcontinue) {
    // Menu
}
```

### 🔀 Estrutura `switch`

As opções escolhidas pelo usuário são processadas utilizando `switch`:

```java
switch(option) {
    case 1 -> {
        // Adicionar contato
    }

    case 2 -> {
        // Listar contato
    }

    // ...
}
```

### 🔀 Estruturas condicionais

O programa verifica, por exemplo, se existe um contato cadastrado:

```java
if (ContactName.isEmpty()) {
    System.out.println("Nenhum contato cadastrado.");
}
```

### 🔤 Comparação de strings

A pesquisa utiliza `equalsIgnoreCase()`, permitindo encontrar o contato independentemente de letras maiúsculas ou minúsculas:

```java
ContactName.equalsIgnoreCase(ContactNameSearch)
```

---

## ⚠️ Limitações da versão atual

Esta versão é uma implementação inicial e possui algumas limitações importantes:

- A aplicação armazena apenas um contato por vez.
- Os dados são armazenados somente em variáveis durante a execução.
- Ao encerrar o programa, os contatos são perdidos.
- Não existe persistência em banco de dados ou arquivo.
- Não há validação de telefone ou e-mail.
- A opção **Listar Contato** exibe somente o único contato armazenado.
- A exclusão remove diretamente os dados do contato atual.

Essas características são esperadas em uma versão inicial voltada ao aprendizado dos fundamentos de Java.

---

## 🚀 Possíveis melhorias

Como evolução do projeto, podem ser implementadas novas funcionalidades:

- Permitir o cadastro de múltiplos contatos.
- Criar uma classe `Contato`.
- Utilizar `ArrayList` para armazenar vários contatos.
- Implementar edição de contatos.
- Permitir pesquisa parcial pelo nome.
- Adicionar validação de telefone.
- Adicionar validação de e-mail.
- Persistir contatos em arquivo.
- Implementar banco de dados.
- Criar uma interface gráfica.
- Separar a aplicação em diferentes classes seguindo princípios de orientação a objetos.

---

## 📈 Próxima evolução sugerida

Uma possível evolução da estrutura seria:

```text
src/
└── br/
    └── edu/
        └── principal/
            ├── Principal.java
            ├── Contato.java
            └── Agenda.java
```

### 📌 Onde:

- `Principal.java` ficaria responsável pela inicialização da aplicação.
- `Contato.java` representaria os dados de cada contato.
- `Agenda.java` seria responsável pelo gerenciamento dos contatos.

Essa organização tornaria o projeto mais próximo de uma aplicação orientada a objetos e facilitaria futuras expansões.

---

## 👨‍💻 Status do projeto

**Versão:** `0.0.0`

**Status:** Em desenvolvimento 🚧

O projeto encontra-se em uma versão inicial, com as funcionalidades básicas de gerenciamento de um contato implementadas.

---

## 📄 Licença

Este projeto possui um arquivo `LICENSE` na raiz do repositório. Consulte o arquivo para obter informações sobre os termos de uso e distribuição.

---

## 🎓 Objetivo

O principal objetivo deste projeto é praticar conceitos fundamentais de programação em Java, desenvolvendo uma aplicação simples e funcional para gerenciamento de contatos através do terminal.

O projeto pode servir como base para futuras implementações envolvendo **Programação Orientada a Objetos**, **coleções**, **persistência de dados** e **interfaces gráficas**.
