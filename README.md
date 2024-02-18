
# API Certificações

Essa API tem como objetivo verificar se um usuário já realizou uma prova, retornar as questões da prova, verificar as respostas do usuário e retornar um ranking com as 10 melhores notas.

## Documentação da API

#### Verificação se o usuário já realizou a prova

```http
  POST /students/verifyIfHasCertification
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `email` | `string` |  Email do usuário |
| `tech` | `string` | Tecnologia|


```json
{
  "email": "exemplo@email.com",
  "tech": "JAVA"
}
```

#### Retorna as questões da prova por tecnologia

```http
  GET /technology/{technology}
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `technology` | `string` |  Tecnologia da busca |



```json
Exemplo:
  GET /technology/JAVA

```



#### Analiza as questões, retornando acerto ou erro

```http
  POST /students/certification/answer
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `email`      | `string` | Email do usuário
| `technology` | `string` | Tecnologia Selecionada|
| `questionsAnswers` |`object`| Lista com os ids das perguntas e respostas


```json
{
  "email": "test@mail.com",
  "technology": "JAVA",
  "questionsAnswers": [
    {
      "questionID": "c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66",
      "alternativeID": "bafdf631-6edf-482a-bda9-7dce1efb1890"
    },
    {
      "questionID": "b0ec9e6b-721c-43c7-9432-4d0b6eb15b01",
      "alternativeID": "f8e6e9b3-199b-4f0d-97ce-7e5bdc080da9"
    },
    {
      "questionID": "f85e9434-1711-4e02-9f9e-7831aa5c743a",
      "alternativeID": "d3e51a56-9b97-4bb8-9827-8bcf89f4b276"
    }
  ]
}

```

#### Retorna ranking TOP10 maiores notas

```http
  GET /ranking/top10
```


