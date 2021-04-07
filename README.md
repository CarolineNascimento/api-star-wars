# API Star Wars
> Consumo da API https://swapi.dev/

Projeto desenvolvido em Spring Boot e Angular.

## Instalando / Iniciando a aplicação

### Configurações necessárias

```shell
* [Java 11]
* [Maven]
* [Node]
* [Angular]
```

### Baixar o projeto 

```shell
git clone https://github.com/CarolineNascimento/api-star-wars.git
```

### Running API

Acessar a pasta do projeto spring e rodar o comando de execução via maven ou executar o projeto na sua workspace de preferência

```shell
cd api-star-wars\api-star-wars
mvn spring-boot:run
```

### Running Front

Acessar a pasta do projeto angular

```shell
cd api-star-wars\angular-star-wars
ng serve
```

### Documentação Swagger

```
http://localhost:9090/swagger-ui.html
```

### Endpoints para teste da API

> Endpoint que retorna a lista de filmes
- **http://localhost:9090/list-films - GET**

> Endpoint que retorna os detalhes de um filme específico
- **http://localhost:9090/detail-film/{id} - GET**

> Endpoint para atualizar a descrição de um filme
- **http://localhost:9090/update-film/{id} - PUT**
Body:
{
  "opening_crawl": "Teste"
}


[Java 11]: <https://www.oracle.com/java/technologies/javase-jdk11-downloads.html>
[Maven]: <https://maven.apache.org/>
[Node]: <https://nodejs.org/pt-br/download/>
[Angular]: <https://cli.angular.io/>
