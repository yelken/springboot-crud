# Spring Boot, MySQL, JPA, Hibernate Rest API

Aplicação utilizando Spring Boot, MySQL, JPA e Hibernate.

## Requirements

1. Java - 1.8.x
2. Maven - 3.x.x
3. Mysql - 5.x.x

## Passos para o SETUP

**1. Clone a aplicação**

```bash
git clone https://github.com/yelken/springboot-crud.git
```

**2. Crie o banco de dados no MySQL**
```bash
create database notes_app
```

**3. Modifique o usuário e senha de acordo com a sua instalação**

+ abra `src/main/resources/application.properties`

+ modifique `spring.datasource.username` e `spring.datasource.password` de acordo com sua instalação

**4. Build e rode a aplicação usando MAVEN**

```bash
mvn package
java -jar target/crud-1.0.0.jar
```

Alternativamente, você pode rodar dessa forma -

```bash
mvn spring-boot:run
```

O app vai rodar nesse endereço <http://localhost:8080>.

## Explore as APIs

A aplicação define as APIs abaixo.

    GET /api/notes
    POST /api/notes
    GET /api/notes/{noteId}
    PUT /api/notes/{noteId}
    DELETE /api/notes/{noteId}

Você pode testar as APIs utilizando o Postman 