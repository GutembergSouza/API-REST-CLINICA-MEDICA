# 🏥 API Rest VOLLMED

A **VOLLMED API** é um projeto desenvolvido com o objetivo de **praticar e demonstrar conhecimentos em desenvolvimento backend com Java e Spring Boot**, aplicando boas práticas de arquitetura, segurança e versionamento de banco de dados.

O sistema simula o gerenciamento de **agendamentos de exames médicos**, considerando a **disponibilidade de médicos e pacientes**.

---

## 🎯 Objetivo do Projeto

Este projeto foi criado como parte do meu aprendizado em **desenvolvimento de APIs RESTful** com **Spring Boot**.  
O foco principal é entender e aplicar:

- Estrutura de uma API REST moderna
- Boas práticas de autenticação e segurança
- Versionamento e migração de banco de dados
- Paginação, ordenação e validação de dados
- Padrão DTO e camadas bem definidas

---

## 🧠 Tecnologias e Conceitos Estudados

| Tecnologia / Conceito | Descrição |
|------------------------|-----------|
| **Java 17** | Linguagem principal do projeto |
| **Spring Boot 3.5.3** | Framework para criação de APIs REST |
| **Spring Security** | Implementação de segurança e autenticação |
| **MySQL** | Banco de dados relacional |
| **Lombok** | Reduz boilerplate criando getters, setters e construtores automaticamente |
| **Flyway** | Controle de versão do banco de dados com migrations |
| **Jakarta Validation** | Validação dos dados de entrada do usuário |
| **DTO (Data Transfer Object)** | Protege dados sensíveis e controla o que é exposto nas requisições |
| **Spring Data Pageable** | Paginação e ordenação automática dos resultados |

---

## ⚙️ Funcionalidades Implementadas

- CRUD de pacientes e médicos
- Paginação e ordenação de resultados
- Controle de versão do banco de dados via Flyway
- Validação de dados de entrada


---

## 🚧 Próximos Aprendizados e implementações

- 🧾 **Agendamento de Exames**  
  Implementação da lógica de agendamento entre pacientes e médicos, considerando disponibilidade, horários e regras de negócio específicas.

- ⚠️ **Melhoria dos Retornos de Erro**  
  Criação de um padrão global de tratamento de exceções com mensagens mais claras e adequadas para cada tipo de erro.

- 🔐 **Criptografia de Senhas (Hashing)**  
  Armazenamento seguro de credenciais utilizando algoritmos de hashing como **BCrypt**, garantindo a integridade e a privacidade dos dados.

- 🪪 **Autenticação com JWT (JSON Web Token)**  
  Implementação de autenticação **stateless**, permitindo controle de sessão e segurança nas rotas da API.

- 🔑 **Autorização Baseada em Perfis de Usuário**  
  Diferenciação de permissões e acessos para médicos, pacientes e administradores.

- 📘 **Documentação com Swagger / OpenAPI**  
  Integração com **Springdoc OpenAPI** para gerar documentação automática e interativa dos endpoints da API.

- 🧪 **Testes Automatizados com JUnit e Mockito**  
  Desenvolvimento de testes unitários e de integração para garantir estabilidade, cobertura e qualidade do código.

---
---

## 🏗️ Boas Práticas Aplicadas

- Arquitetura em camadas (Controller, Service, Repository, DTO, Model)
- Injeção de dependências e inversão de controle
- Uso de Migrations com Flyway para versionamento do banco
- Tratamento de exceções e mensagens personalizadas
- Paginação padrão de 10 registros por página

---

## 🚀 Como Executar o Projeto

1. **Clone o repositório**
   ```bash
   git clone https://github.com/GutembergSouza/volmmed-api.git
   
2. **Configure o banco de dados MySQL**

- Crie um banco chamado vollmed_api

- Configure o application.properties com suas credenciais

3. **Execute o projeto**
    ```bash 
    ./mvnw spring-boot:run
4. **Acesse**
   http://localhost:8080/swagger-ui/index.html
