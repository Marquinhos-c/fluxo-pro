# 📅 Sistema de Agendamento

Sistema back-end desenvolvido em Java com Spring Boot para gerenciamento de agendamentos em estabelecimentos como barbearias, clínicas e salões de beleza.

---

## 🚀 Funcionalidades

- Cadastro de usuários (donos de estabelecimento)
- Cadastro de funcionários
- Gerenciamento de horários disponíveis
- Criação e controle de agendamentos
- Registro de clientes
- Organização da agenda por data e horário

---

## 🧩 Regras de Negócio

- Cada usuário representa um estabelecimento
- Um estabelecimento pode ter vários funcionários
- Cada funcionário possui horários disponíveis
- Os agendamentos são vinculados a:
    - Cliente
    - Funcionário
    - Horário

---

## 🛠️ Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Banco de Dados (PostgreSQL)
- Maven
- JUnit (para testes unitários)

---

## ▶️ Como executar o projeto

```bash
# Clonar o repositório
git clone https://github.com/Marquinhos-c/fluxo-pro.git

# Entrar na pasta
cd fluxo-pro

# Rodar o projeto
./mvnw spring-boot:run 

## 🔒 Configuração

Crie um arquivo application.yml baseado no modelo abaixo:

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/seu_banco
    username: seu_usuario
    password: sua_senha
```

---

## 📌 Próximas melhorias
Implementação do Spring Security (autenticação e autorização)
Integração com AWS
Envio de notificações automáticas (lembretes de agendamento)
Uso de IA para comunicação com clientes
Criação de API REST completa


## 📷 Status do projeto

🚧 Em desenvolvimento

## 👨‍💻 Autor

Marcos Costa


