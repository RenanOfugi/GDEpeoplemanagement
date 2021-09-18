![](https://img.shields.io/github/license/RenanOfugi/GDEpeoplemanagement)

# GDEpeoplemanagement

## Projeto referente ao Bootcamp DIO da Capgemini - Java and Angular



## Descrição

**GDEpeoplemanagement** é um projeto de backend utilizando Spring, que visa implementar um pequeno sistema de gerenciamento de **GDEs** utilizando os métodos REST (*GET*, *POST*,*PUT*,*DELETE*), com deploy no serviço em nuvem da Heroku.



## Tecnologias e Ferramentas

Foram utilizado as seguintes tecnologias e ferramentas para o desenvolvimento:
 - Java 11
 - Spring
 - Database H2
 - Heroku
 - Insomnia (pode ser utilizado qualquer outro alternativo)
 - Intellij IDEA



## Executando o projeto

### Localmente

Após fazer o clone deste repositório em sua máquina local, temos duas alternarnativas para realizar a execução:

1. **Com uma IDE Java**. Abra uma IDE e caso o maven esteja corretamente configurado, simplesmente clique no botão de executar normalmente. 
2.  **Por um terminal**, sem o uso da IDE. Neste texto irei descrever a execução em uma distribuição Linux baseada em Debian:
   * Abra o terminal e navegue até a pasta que foi clonada
   * Execute `mvn spring-boot:run`

Após esses passos, será criado uma instância executando em `localhost:8080`, onde poderá ser feito as operações dos métodos REST. Utilize ferramentas como o Insomnia ou o Postman, por exemplo. 

### Remoto

Foi realizado o deploy no Heroku deste projeto, ou seja, as operações poderão ser realizados utilizando esta [URL](https://gde-people-management.herokuapp.com)



## Licença

Este projeto está licenciado sob os termos da [MIT License](https://opensource.org/licenses/MIT)

