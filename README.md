# Descrição do Projeto

## Projeto Spring Security com Autenticação JWT

Este projeto é uma aplicação web baseada no framework Spring Boot, que utiliza Spring Security para implementar a autenticação e autorização de usuários por meio de tokens JWT (JSON Web Tokens). A implementação de JWT é uma forma moderna e segura de garantir que apenas usuários autenticados possam acessar determinados recursos da aplicação.

# Funcionalidades

## Registro de Usuários: 
Os novos usuários podem se registrar na aplicação.

## Autenticação: 
Os usuários registrados podem fazer login para obter um token JWT.

## Autorização: 
Acesso controlado a recursos protegidos com base nos papéis dos usuários (roles).

## Validação de Token: 
Verificação automática da validade do token JWT em cada requisição.

## Proteção de Endpoints: 
Endpoints específicos são protegidos e só podem ser acessados por usuários autenticados.

## Logout: 
Invalidar o token JWT ao fazer logout.

# Tecnologias Utilizadas

## Spring Boot: 
Framework para criação de aplicações Java.

## Spring Security: 
Framework para autenticação e controle de acesso.
JWT (JSON Web Token): Padrão de token aberto que define uma forma compacta e autônoma para a transmissão segura de informações entre as partes como um objeto JSON.

## Maven: 
Ferramenta de automação de compilação e gerenciamento de dependências.

## Mysql: 
Para testes e desenvolvimento.

## Lombok: 
Biblioteca para reduzir o boilerplate de código Java.

# Estrutura do Projeto

Controller: Contém os endpoints da API.

Service: Contém a lógica de negócios.

Repository: Interface para interação com o banco de dados.

Model: Contém as classes de modelo de dados.

Security: Configurações de segurança e filtros JWT.

Como Executar o Projeto

## Pré-requisitos:

Java 11 ou superior
Maven
Clone o repositório:

## Copy code
git clone <URL-do-repositório>
cd <nome-do-diretório>

Compile e execute o projeto:

## Copy code
mvn spring-boot:run
Acesse a aplicação:

## A aplicação estará disponível em http://localhost:9090.
