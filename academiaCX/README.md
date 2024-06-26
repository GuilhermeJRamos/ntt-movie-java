# NTT Movie API

Este é um projeto desenvolvido utilizando o framework Spring na versão 3.2.4, com a utilização das bibliotecas Spring Web, Spring Devtools, Spring Validation, além do driver MySQL e Lombok.

## Objetivo

O objetivo principal deste projeto foi criar uma API REST utilizando o framework Spring e conectar-se a um banco de dados, neste caso, o MySQL.

## Como Executar

Para executar o projeto, siga os passos abaixo:

1. Clone o repositório.
2. Certifique-se de que as dependências foram corretamente instaladas executando `mvn install`.
3. Rode o comando `mvn spring-boot:run` para iniciar o projeto em modo de desenvolvimento.

Os endpoints da API têm como raiz a URL base do Spring, geralmente `http://localhost:8080/`, seguida de alguma sub-rota específica.

## Migrations Iniciais

As migrações iniciais para o banco de dados estão disponíveis no arquivo `migrations.sql`.

## Documentação das Rotas

A documentação das rotas foi gerada utilizando o Swagger e pode ser acessada em `http://localhost:8080/swagger-ui/index.html`.

## Observações

Nunca havia estudado mais a fundo o backend, então essa aplicação foi bem desafiadora para mim, pois tive que aprender tudo do 0 para conseguir fazer uma tarefa grande como esta, porém depois de alguns dias de estudo consegui desenvolve-la por completo
