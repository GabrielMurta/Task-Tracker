# 📝 Task Manager CLI (Java)

Projeto simples de gerenciamento de tarefas via linha de comando (CLI), desenvolvido em Java, com foco em prática de lógica, orientação a objetos e organização em camadas.

---

## 🚀 Funcionalidades

- Criar tarefas
- Atualizar tarefas
- Deletar tarefas
- Marcar tarefa como **In Progress**
- Marcar tarefa como **Done**
- Listar tarefas
- Listar tarefas por status

---

## 🧠 Tecnologias e conceitos utilizados

- Java
- Programação Orientada a Objetos (POO)
- Estrutura em camadas:
  - Repository
  - Service
  - Model
- Enum para controle de status
- Manipulação de listas (`ArrayList`)

---

## 🏗️ Estrutura do projeto
```
src/
├── models/
│ └── Task.java
├── enums/
│ └── Status.java
├── repository/
│ └── TaskRepository.java
├── services/
│ └── TaskServices.java
└── Main.java
```
---

## ▶️ Como executar

1. Clone o repositório:

```bash
git clone https://github.com/GabrielMurta/Task-Tracker.git

⚠️ Observações
Os dados são armazenados apenas em memória (não há persistência)
Ao encerrar o programa, as tarefas são perdidas
🎯 Objetivo

Projeto desenvolvido para praticar conceitos fundamentais de desenvolvimento backend com Java e reforçar boas práticas de organização de código.

📌 Melhorias futuras
Persistência de dados (arquivo ou banco)
Interface gráfica ou API REST
Tratamento de erros mais robusto**

👨‍💻 Autor

Gabriel Murta
