# Sistema de Controle de Demandas

## Descrição
Este projeto é um sistema de controle de demandas desenvolvido em Java com Spring Boot. Ele oferece uma API RESTful para gerenciar demandas de funcionários, permitindo criar, ler, atualizar e deletar registros de atividades e tarefas.

## Funcionalidades
- Criar novas demandas
- Listar todas as demandas
- Buscar uma demanda específica por ID
- Atualizar informações de uma demanda existente
- Deletar uma demanda

## Tecnologias Utilizadas
- Java 17
- Spring Boot 3.4.1
- Spring Data JPA
- H2 Database (para desenvolvimento)
- Maven (gerenciamento de dependências)
- RESTful API

## Estrutura do Projeto
- `model`: Contém a classe `Demanda` que define a estrutura dos dados
- `repository`: Interface `DemandaRepository` para operações de banco de dados
- `service`: Classe `DemandaService` com a lógica de negócios
- `controller`: Classe `DemandaController` que define os endpoints da API

## Como Executar
1. Clone o repositório
2. Navegue até a pasta do projeto
3. Execute `mvn spring-boot:run`
4. A aplicação estará disponível em `http://localhost:8080`

## Endpoints da API
- POST `/api/demandas`: Criar uma nova demanda
- GET `/api/demandas`: Listar todas as demandas
- GET `/api/demandas/{id}`: Buscar uma demanda específica
- PUT `/api/demandas/{id}`: Atualizar uma demanda existente
- DELETE `/api/demandas/{id}`: Deletar uma demanda

## Exemplo de Payload (JSON)
```
{
  "funcionario": "Gustavo Caçador",
  "pendencia": "Implementando API do projeto Controle de Demandas",
  "situacao": "Em andamento",
  "servico": "TI",
  "dataAbertura": "2024-12-21",
  "nivel": 1,
  "prazo": "2025-01-21",
  "canal": "Postman",
  "solicitante": "Gustavo",
  "emailSolicitante": "gustavo@gmail.com"
}
```
```

Este formato garante que cada campo fique em uma linha separada, melhorando a legibilidade do JSON no GitHub.


## Configuração do Banco de Dados
O projeto utiliza H2 Database para desenvolvimento. As configurações podem ser encontradas em `src/main/resources/application.properties`.

## Testes
Os testes podem ser executados via Maven: `mvn test`
