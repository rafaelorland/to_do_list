# Spring ToDo List REST API

Este é um simples exemplo de uma API RESTful de uma lista de tarefas (ToDo List) desenvolvida com Spring Boot. O projeto realiza operações CRUD (Create, Read, Update, Delete) em uma entidade `Lista`.

##Endpoints

1. Listar todas as tarefas
  Endpoint:
    GET /tarefas
   
3. Criar uma nova tarefa
  Endpoint:
    POST /tarefas
   
    Corpo da Requisição:
    json
    {
      "descricao": "Descrição da tarefa",
      "situacao": false
    }
   
4. Atualizar uma tarefa existente
  Endpoint:
    PUT /tarefas/{id}
   
    Corpo da Requisição:
    json
    {
      "descricao": "Nova descrição da tarefa",
      "situacao": true
    }
   
5. Excluir uma tarefa
  Endpoint:
    DELETE /tarefas/{id}
   