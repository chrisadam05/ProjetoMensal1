# 🛒 Mini Sistema de Mercado (Java CLI)

Projeto desenvolvido em **Java SE** para gerenciamento simples de produtos utilizando **terminal (CLI)**.
O objetivo do sistema é aplicar conceitos de **Programação Orientada a Objetos (POO)** e **estruturas de dados em memória**.

---

# 📌 Funcionalidades

O sistema permite realizar operações básicas de gerenciamento de produtos:

* ✅ Cadastrar produto
* 📋 Listar produtos
* 🔍 Buscar produto por ID
* ❌ Remover produto
* ✏️ Atualizar produto
* 🚪 Encerrar sistema

Todas as operações são realizadas diretamente pelo **terminal**.

---

# 🧠 Conceitos Utilizados

O projeto aplica conceitos fundamentais da programação em Java:

### Programação Orientada a Objetos

* Encapsulamento
* Herança
* Polimorfismo
* Abstração

### Estruturas de Dados

* `ArrayList`
* `List`

### Boas práticas

* Separação de responsabilidades
* Organização em pacotes
* Validação de entrada do usuário
* Reaproveitamento de código

---

# 🗂 Estrutura do Projeto

```
pj1
 └── src
     └── main
         └── java
             └── com
                 └── mensal1
                     ├── Main.java
                     ├── model
                     │     ├── Produto.java
                     │     ├── Cliente.java
                     │     └── ClienteComum.java
                     └── service
                           └── ProdutoService.java
```

### 📄 Descrição das Classes

**Main.java**

Responsável pela interface com o usuário e pelo menu do sistema.

**Produto.java**

Classe que representa um produto contendo:

* id
* nome
* preço
* quantidade

**ProdutoService.java**

Classe responsável pela lógica de negócio do sistema:

* adicionar produtos
* listar produtos
* buscar produtos
* remover produtos
* atualizar produtos

**Cliente.java / ClienteComum.java**

Exemplo de herança para demonstrar conceitos de **POO**.

---

# ⚙️ Como Compilar o Projeto

No terminal, entre na pasta `src/main/java` e execute:

```
javac com/mensal1/**/*.java
```

---

# ▶️ Como Executar

Após compilar:

```
java com.mensal1.Main
```

---

# 🖥 Exemplo de Menu

```
=============================
|| MINI SISTEMA DE MERCADO ||
=============================
||  1 - Cadastrar produto  ||
||  2 - Listar produtos    ||
||  3 - Buscar produto     ||
||  4 - Remover produto    ||
||  5 - Atualizar produto  ||
||  6 - Sair               ||
=============================
```

---

# 📚 Tecnologias Utilizadas

* Java SE
* Collections Framework
* VS Code
* Git
* GitHub

---

# 👨‍💻 Autor

Projeto desenvolvido para atividade acadêmica de **LEONARDO****CHRISTOPHER**.
