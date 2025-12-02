# 🇧🇷 README -- Português

# API de Gerenciamento de Biblioteca

Este projeto é uma **API REST** desenvolvida em **Java 17** com **Spring
Boot**, utilizada para gerenciar livros de uma biblioteca.\
A aplicação permite criar, listar, atualizar e excluir livros,
utilizando **Spring Data JPA** e **H2 Database**.

## Funcionalidades

-   Cadastro de livros\
-   Listagem de todos os livros\
-   Busca de livro por ID\
-   Atualização de informações\
-   Exclusão de livros

## Tecnologias Utilizadas

-   Java 17\
-   Spring Boot 3\
-   Spring Web\
-   Spring Data JPA\
-   H2 Database\
-   Lombok

## Estrutura do Projeto

    src/main/java
     ├── controller   -> Endpoints REST
     ├── service      -> Regras de negócio
     ├── repository   -> Persistência de dados
     └── model        -> Entidades

## Como Executar

1.  Clone o repositório:

        git clone <url-do-seu-repositorio>

2.  Abra o projeto na IDE\

3.  Execute:

        mvn spring-boot:run

4.  Acesse:

        http://localhost:8080

## Endpoints

### Criar livro

    POST /book

``` json
{
		"id": 1,
		"title": "Verity",
		"author": "Coolen Houver",
		"yearPublication": 2020,
		"gender": "Romance",
		"quantity": 1
}
```

### Listar

    GET /book

### Buscar por ID

    GET /book/{id}

### Atualizar

    PUT /book/{id}

### Excluir

    DELETE /book/{id}

## Próximas Melhorias

-   Sistema de empréstimo\
-   Paginação\
-   DTOs\
-   Swagger\
-   Deploy em nuvem

# 🇺🇸 README -- English

# Library Management API

This project is a **REST API** built with **Java 17** and **Spring
Boot** for managing library books.\
It allows creating, listing, updating, and deleting books using **Spring
Data JPA** and **H2 database**.

## Features

-   Add books\
-   List all books\
-   Find by ID\
-   Update details\
-   Delete books

## Technologies

-   Java 17\
-   Spring Boot 3\
-   Spring Web\
-   Spring Data JPA\
-   H2 Database\
-   Lombok

## Project Structure

    src/main/java
     ├── controller   -> REST endpoints
     ├── service      -> Business logic
     ├── repository   -> Data persistence
     └── model        -> Entities

## How to Run

1.  Clone the repository:

        git clone <your-repository-url>

2.  Open the project in your IDE\

3.  Run:

        mvn spring-boot:run

4.  Access:

        http://localhost:8080

## Endpoints

### Create book

    POST /book

``` json
{
		"id": 1,
		"title": "Verity",
		"author": "Coolen Houver",
		"yearPublication": 2020,
		"gender": "Romance",
		"quantity": 1
}
```

### List

    GET /book

### Find by ID

    GET /book/{id}

### Update

    PUT /book/{id}

### Delete

    DELETE /book/{id}

## Future Improvements

-   Loan system\
-   Pagination\
-   DTOs\
-   Swagger\
-   Cloud deployment
