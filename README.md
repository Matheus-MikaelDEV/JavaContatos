# 📒 JavaContatos

Um sistema simples de agenda de contatos feito em Java, executado no terminal. Com ele, você pode adicionar, remover e visualizar contatos de forma prática e organizada.

## 🛠️ Funcionalidades

- ✅ Adicionar contato (nome, número e email)
- 🗑️ Remover contato por ID
- 📃 Listar todos os contatos cadastrados
- 📛 Validação de entrada e tratamento de erros

## 📂 Estrutura do Projeto

```
JavaContatos/
├── application/
│   └── Main.java                # Classe principal (menu e fluxo do sistema)
├── service/
│   └── AgendaService.java       # Lógica principal da agenda de contatos
├── model/
│   └── agenda/
│       └── Contato.java         # Classe que representa um contato
```

## 🧪 Como Executar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/Matheus-MikaelDEV/JavaContatos.git
   ```

2. **Compile os arquivos Java:**
   ```bash
   javac application/Main.java
   ```

3. **Execute o programa:**
   ```bash
   java application.Main
   ```

> É necessário ter o **Java JDK 8+** instalado na máquina.

## 📌 Exemplo de Uso

```
----- Sistema de Agenda de Contatos -----

----- Menu -----
1 - Adicionar Contato
2 - Remover Contato
3 - Listar Todos os Contatos
4 - Sair do Sistema
Escolha: 1

Digite o nome do contato: Ana Silva
Digite o número do contato: 11999998888
Digite o email do contato: ana@email.com

Contato adicionado com sucesso!
```

## ⚙️ Tecnologias Utilizadas

- Java 8+
- Programação Orientada a Objetos (POO)
- Manipulação de entrada com Scanner
- Estrutura de dados com List (ArrayList)
- **Tratamento de erros** com `try-catch` (InputMismatchException, StringIndexOutOfBoundsException)

## 🤝 Contribuição

Sinta-se à vontade para abrir issues ou pull requests com melhorias ou sugestões! 💡

---

**Desenvolvido por Matheus Mikael** 🚀
