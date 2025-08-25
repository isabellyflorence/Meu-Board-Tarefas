# 📝 Board de Tarefas em Java

Um projeto de gerenciamento de tarefas desenvolvido em Java, permitindo criar, listar, atualizar e remover tarefas, seguindo boas práticas de programação e arquitetura em camadas (Model, Repository, Service e Main). Este projeto serve como exemplo prático de aplicação de conceitos de orientação a objetos e estruturação de código limpo.

---

## 🚀 Funcionalidades

- Criar novas tarefas com título, descrição e prioridade.
- Listar todas as tarefas cadastradas.
- Atualizar o status de uma tarefa (Pendente, Em andamento, Concluída).
- Remover tarefas pelo ID.
- Estrutura modular seguindo boas práticas de programação.

---

## ⚙️ Tecnologias Utilizadas

- Java 8 ou superior
- IDEs sugeridas: IntelliJ, Eclipse ou VS Code
- (Opcional) Maven para gerenciamento de dependências

---

## 🛠️ Como Executar

1. Clone o repositório:

git clone https://github.com/seu-usuario/meu-board-tarefas.git
Navegue até a pasta do projeto:

cd meu-board-tarefas
Compile e execute o projeto:

javac -d bin src/**/*.java
java -cp bin Main
Siga as instruções do menu no console para criar, listar, atualizar e remover tarefas.

---

###💡 Próximas Melhorias
Persistência em banco de dados (MySQL, MongoDB ou H2).

Interface gráfica usando JavaFX ou Swing.

Filtros por prioridade, status ou palavra-chave.

API REST para expor o board como serviço web.

Testes unitários para Service e Repository.
